package com.example.hoaminhquang_day04_45;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterContact extends BaseAdapter {

    List<ContactDemo> contactDemoList;

    public AdapterContact(List<ContactDemo> contactDemoList) {
        this.contactDemoList = contactDemoList;
    }

    @Override
    public int getCount() {
        return contactDemoList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactDemoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_contact,parent,false);

        ImageView imgIcon = view.findViewById(R.id.imgIcon);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvDiscribe = view.findViewById(R.id.tvDiscribe);
        TextView tvPrice = view.findViewById(R.id.tvPrice);

        ContactDemo contactDemo = contactDemoList.get(position);

        imgIcon.setVisibility(view.getVisibility());
        tvName.setText(contactDemo.getName());
        tvDiscribe.setText(contactDemo.getDiscribe());
        tvPrice.setText(String.valueOf(contactDemo.getPrice()));


        return view;
    }
}
