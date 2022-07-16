package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, Object>> list;
    int[] icon={R.drawable.icon1, R.drawable.icon2, R.drawable.icon3};
    String[] title={"朋友圈", "收藏", "七彩圈"};
    String[] info={"你好", "写信", "你好"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        listView =(ListView)findViewById(R.id.lv);
        list= initDatas();

        SimpleAdapter adapter= new SimpleAdapter(this, list, R.layout.layout, new String[]{"img","name","txt"}, new int[]{R.id.img, R.id.title, R.id.info});
        listView.setAdapter(adapter);
    }

    private ArrayList<HashMap<String,Object>> initDatas() {
        ArrayList<HashMap<String, Object>> tmplist=new ArrayList<>();

        for(int i=0; i<3; i++){
            HashMap<String, Object> map= new HashMap<>();
            map.put("img", icon[i]);
            map.put("name", title[i]);
            map.put("txt", info[i]);
            tmplist.add(map);
        }
        return  tmplist;
    }
}