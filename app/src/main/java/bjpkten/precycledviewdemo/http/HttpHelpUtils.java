package bjpkten.precycledviewdemo.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kodulf on 2017/5/4.
 */

public class HttpHelpUtils {

    /**
     * 获取参数的String格式的
     * @param values
     * @return
     */
    public static StringBuilder getParametersString(HashMap<String, String> values) {
        StringBuilder parameters = new StringBuilder();
        Set<Map.Entry<String, String>> entries = values.entrySet();
        for (Map.Entry entry :entries){
            parameters.append(entry.getKey()+"="+entry.getValue()+"&");
        }
        if(parameters.length()>0){
            parameters.deleteCharAt(parameters.length()-1);//删除掉最后的&
        }
        return parameters;
    }



    /**
     * 范型解析为list的
     * @param result
     * @param readString
     * @param <T>
     */
    public static <T> void parseJsonStringToResultListGeneric(ResultList<T> result, String readString, T t) throws Exception{

        ResultList<T> responseObject = JSON.parseObject(readString, new TypeReference<ResultList<T>>() {
        });
        if (responseObject.getData() != null) {
            String valueString = JSON.toJSONString(responseObject.getData());
            List<T> values = (List<T>) JSON.parseArray(valueString, t.getClass());

            //更新result
            result.setData(values);
        }
        result.setMsg(responseObject.getMsg());
        result.setErrno(responseObject.getErrno());

    }

    /**
     * 范型解析为特定类
     * @param result
     * @param responseStr
     * @param k
     * @param <K>
     * @throws Exception
     */
    public static <K> void parseJsonStringToResultGeneric(Result<K> result, String responseStr, K k) throws Exception{
        Result<K> responseObject = JSON.parseObject(responseStr, new TypeReference<Result<K>>() {
        });
        if (responseObject.getMsg() != null) {
            K valueObject = null;
            Class<?> targetType = k.getClass();
            if (targetType == String.class) {
                valueObject = (K) responseObject.getData().toString();
            } else if ((targetType == Integer.class) || (targetType == Integer.TYPE))
                valueObject = (K) Integer.valueOf(responseObject.getData().toString());
            else if ((targetType == Byte.class) || (targetType == Byte.TYPE))
                valueObject = (K) Byte.valueOf(responseObject.getData().toString());
            else if ((targetType == Double.class) || (targetType == Double.TYPE))
                valueObject = (K) Double.valueOf(responseObject.getData().toString());
            else if ((targetType == Float.class) || (targetType == Float.TYPE))
                valueObject = (K) Float.valueOf(responseObject.getData().toString());
            else if ((targetType == Long.class) || (targetType == Long.TYPE))
                valueObject = (K) Long.valueOf(responseObject.getData().toString());
            else if ((targetType == Short.class) || (targetType == Short.TYPE))
                valueObject = (K) Short.valueOf(responseObject.getData().toString());
            else if (targetType == BigDecimal.class)
                valueObject = (K) new BigDecimal(responseObject.getData().toString());
            else {
                valueObject = (K) JSONObject.toJavaObject((JSONObject) responseObject.getData(), k.getClass());
            }
            result.setData(valueObject);
        }
        result.setErrno(responseObject.getErrno());
        result.setMsg(responseObject.getMsg());

    }

}
