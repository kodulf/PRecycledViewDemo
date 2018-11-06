package bjpkten.precycledviewdemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bjpkten.precycledviewdemo.entity.Room;
import bjpkten.precycledviewdemo.http.HttpUtils;
import bjpkten.precycledviewdemo.http.RequestCallback;
import bjpkten.precycledviewdemo.http.ResultList;

public class MainActivity extends AppCompatActivity {
    HashMap<String,String> values;
    ArrayList<Room> arrayList;
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private Handler mHandler ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        myAdapter = new MyAdapter();
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.addItemDecoration(new MyItemDecorator(10));
        recyclerView.setAdapter(myAdapter);

        mHandler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                myAdapter.notifyDataSetChanged();
                return false;
            }
        });


        //__DAYU_PP	BJZaN3n7ar26rvAvqZYu696910639432
        //uid	20734067
        //PHPSESSID	hvreidthvl5h5mddmkocr7s8b0
        values  = new HashMap<>();
        values.put("__DAYU_PP","BJZaN3n7ar26rvAvqZYu696910639432");
        values.put("uid","20734067");
        values.put("PHPSESSID","hvreidthvl5h5mddmkocr7s8b0");
        arrayList = new ArrayList<>();





    }

    private void startHttpMethod() {
        final String cookie = "__DAYU_PP=BJZaN3n7ar26rvAvqZYu696910639432;uid=20734067;PHPSESSID=hvreidthvl5h5mddmkocr7s8b0";

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    HttpUtils.postRequestForResultList(
                            "http://app.guojiang.tv/room/getRooms?page=0&status=2&platform=android&deviceName=Motorola%2BXT1085&androidVersion=5.1&channel=and-lianxiang-24&packageId=24&version=4.7.1",
                            cookie,
                            values,
                            new RequestCallback<ResultList<Room>>() {
                                @Override
                                public void onFailure(ResultList<Room> resultList, Exception e) {
                                    System.out.println(e.getStackTrace());
                                }

                                @Override
                                public void onResponse(ResultList<Room> resultList) {
                                    List<Room> data = (List<Room>)resultList.getData();
                                    arrayList.addAll(data);
                                    System.out.println("kodulf"+arrayList.toString());

                                    mHandler.sendEmptyMessage(0);
                                }
                            },new Room());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void startHTTP(View view) {
        startHttpMethod();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        SimpleDraweeView simpleDraweeView;
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            simpleDraweeView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
        }
    }

    class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{


        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            View v =  LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_layout,null);
            return  new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
            Room room = arrayList.get(i);
            myViewHolder.simpleDraweeView.setImageURI(room.getHeadPic());
            myViewHolder.name.setText(room.getNickname());
        }

        @Override
        public int getItemCount() {
            int size = 0;
            if(arrayList!=null)
            size = arrayList.size();

            return size;
        }
    }
}
