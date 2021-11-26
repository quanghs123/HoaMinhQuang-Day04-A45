package com.example.hoaminhquang_day04_45;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    List<ContactDemo> contactDemoList;
    ContactDemo contact01,contact02,contact03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lvContact);

        contact01 = new ContactDemo(true,"Mon hue","Pho my bun com",12000);
        contact02 = new ContactDemo(true,"Mon Jona Bakery Cafe","Banh ngot, salad",32000);
        contact03 = new ContactDemo(true,"Kebab 1995","Mon Tho nhi ky",22000);

        contactDemoList.add(contact01);
        contactDemoList.add(contact02);
        contactDemoList.add(contact03);

    }
}