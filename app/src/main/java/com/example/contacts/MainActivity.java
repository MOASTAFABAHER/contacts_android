package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class  MainActivity extends AppCompatActivity {
    RecyclerView contactsRecyclerView;
    ContactsMenuAdapter adapter;
    List<ContanctsItem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecyclerView=findViewById(R.id.Recycler_view_id);
        createContactsList();
        adapter =new ContactsMenuAdapter(list);
        contactsRecyclerView.setAdapter(adapter);
    }
    void createContactsList(){
        list=new ArrayList<>();
        for(int i=0;i<6;i++){
            list.add(new ContanctsItem("Mostafa Ahmed","123456789"));
            list.add(new ContanctsItem("zew","12121212"));
            list.add(new ContanctsItem("Mostafa","141414141414"));
        }
    }
}
