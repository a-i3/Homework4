package com.andrey_i.homework4;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity433 extends ListActivity {
    String[] myArr = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    ArrayAdapter<String> monthAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        monthAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArr);
        setListAdapter(monthAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        String month = (String) getListAdapter().getItem(position);
        Toast.makeText(this, month, Toast.LENGTH_SHORT).show();
        myArr[11] = "November";
        monthAdapter.notifyDataSetInvalidated();
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
