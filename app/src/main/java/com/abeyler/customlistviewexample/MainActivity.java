package com.abeyler.customlistviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        List<User> userList = new ArrayList<>();
        // add users to list
        userList.add(new User("alper","beyler",false));
        userList.add(new User("sevde","kaleli",true));
        userList.add(new User("aybüke","soydan",true));
        userList.add(new User("yasin","çetin",false));
        userList.add(new User("yener","güç",false));
        userList.add(new User("begüm","güçlü",true));
        userList.add(new User("selim","beyler",false));
        userList.add(new User("mustafa","beyler",false));
        userList.add(new User("ayşe","koçak",true));
        userList.add(new User("pelin","develi",true));
        userList.add(new User("mehmet","ali",false));
        userList.add(new User("bayram","ince",false));
        userList.add(new User("damla","yener",true));
        userList.add(new User("ebru","saygın",true));
        userList.add(new User("gönül","beyler",false));
        userList.add(new User("osman","koç",false));

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,userList);
        listView.setAdapter(customAdapter);
    }
}
