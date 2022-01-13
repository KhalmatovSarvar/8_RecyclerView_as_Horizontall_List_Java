package com.example.a8_recyclerview_as_horizontall_list_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a8_recyclerview_as_horizontall_list_java.adapter.CustomAdapter;
import com.example.a8_recyclerview_as_horizontall_list_java.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<Member> members = prepareMemberList();
        refreshAdapter(members);
    }
    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
    }

    private void refreshAdapter(List<Member> members) {
        CustomAdapter adapter = new CustomAdapter(context,members);
        recyclerView.setAdapter(adapter);
        }


    private List<Member> prepareMemberList() {

        List<Member> members= new ArrayList<>();
        for(int i = 0; i<10; i++){
            members.add(new Member("Sarvarbek"+i,"Khalmatov"+i));
        }
        return members;

    }

}