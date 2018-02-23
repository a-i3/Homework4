package com.andrey_i.homework4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonAdapter extends ArrayAdapter<Person> {
    public PersonAdapter(Context context, Person[] objects) {
        super(context, R.layout.list_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Person person = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null);
        }
        ((TextView) convertView.findViewById(R.id.money)).setText(person.money);
        ((TextView) convertView.findViewById(R.id.name)).setText(person.name);
        ((ImageView) convertView.findViewById(R.id.flag)).setImageResource(person.flag_res);
        return convertView;
    }
}
