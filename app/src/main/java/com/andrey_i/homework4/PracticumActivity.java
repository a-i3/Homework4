package com.andrey_i.homework4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class PracticumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicum);

        PersonAdapter adapter = new PersonAdapter(this, makePerson());
        ListView lv = (ListView)findViewById(R.id.listViewPracticum);
        lv.setAdapter(adapter);
    }

    Person[] makePerson() {
        String[] money = new String[]{"$86 B", "$75.6 B", "$72.8 B", "$71.3 B", "$56 B", "$54.5 B", "$52.2 B", "$48.3 B", "$48.3 B", "$47.5 B", "$41.5 B", "$40.7 B", "$39.8 B", "$39.5 B", "$34.1 B", "$34 B", "$33.8 B", "$31.3 B", "$31.2 B", "$30.4 B", "$30 B", "$29.2 B", "$28.3 B", "$27.2 B", "$27.2 B", "$27 B", "$27 B", "$26.2 B", "$25.2 B", "$25.2 B", "$24.9 B", "$24.4 B", "$23.2 B", "$21.2 B", "$21.1 B", "$20.7 B", "$20.5 B", "$20.4 B", "$20.4 B", "$20 B", "$20 B", "$19.9 B", "$19.6 B", "$18.8 B", "$18.7 B", "$18.4 B", "$18.3 B", "$18.3 B", "$18 B", "$17.9 B", "$17.5 B", "$17.3 B", "$17 B", "$16.8 B", "$16.6 B", "$16.4 B", "$16.1 B", "$16.1 B", "$16 B", "$15.9 B", "$15.9 B", "$15.8 B", "$15.7 B", "$15.4 B", "$15.3 B", "$15.2 B", "$15.2 B", "$15.1 B", "$15 B", "$15 B", "$15 B", "$14.9 B", "$14.8 B", "$14.5 B", "$14.4 B", "$14.4 B", "$14.3 B", "$14.3 B", "$14 B", "$13.9 B", "$13.9 B", "$13.8 B", "$13.8 B", "$13.7 B", "$13.7 B", "$13.4 B", "$13.3 B", "$13.3 B", "$13.2 B", "$13.1 B", "$13.1 B", "$13 B", "$13 B", "$12.7 B", "$12.6 B", "$12.5 B", "$12.5 B", "$12.5 B", "$12.5 B", "$12.4 B"};
        int[] country = new int[]{R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_spain, R.drawable.flag_united_states, R.drawable.flag_mexico, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_france, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_france, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_china, R.drawable.flag_hong_kong, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_brazil, R.drawable.flag_china, R.drawable.flag_germany, R.drawable.flag_canada, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_italy, R.drawable.flag_united_states, R.drawable.flag_china, R.drawable.flag_hong_kong, R.drawable.flag_india, R.drawable.flag_japan, R.drawable.flag_denmark, R.drawable.flag_germany, R.drawable.flag_brazil, R.drawable.flag_united_states, R.drawable.flag_germany, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_sweden, R.drawable.flag_germany, R.drawable.flag_saudi_arabia, R.drawable.flag_russia, R.drawable.flag_united_states, R.drawable.flag_germany, R.drawable.flag_united_states, R.drawable.flag_italy, R.drawable.flag_russia, R.drawable.flag_china, R.drawable.flag_germany, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_india, R.drawable.flag_france, R.drawable.flag_russia, R.drawable.flag_russia, R.drawable.flag_china, R.drawable.flag_japan, R.drawable.flag_thailand, R.drawable.flag_france, R.drawable.flag_united_kingdom, R.drawable.flag_united_kingdom, R.drawable.flag_united_states, R.drawable.flag_russia, R.drawable.flag_south_korea, R.drawable.flag_hong_kong, R.drawable.flag_hong_kong, R.drawable.flag_australia, R.drawable.flag_india, R.drawable.flag_brazil, R.drawable.flag_russia, R.drawable.flag_russia, R.drawable.flag_united_states, R.drawable.flag_ireland, R.drawable.flag_russia, R.drawable.flag_china, R.drawable.flag_united_states, R.drawable.flag_italy, R.drawable.flag_mexico, R.drawable.flag_united_states, R.drawable.flag_chile, R.drawable.flag_india, R.drawable.flag_austria, R.drawable.flag_united_states, R.drawable.flag_china, R.drawable.flag_russia, R.drawable.flag_united_states, R.drawable.flag_germany, R.drawable.flag_united_states, R.drawable.flag_france, R.drawable.flag_philippines, R.drawable.flag_netherlands, R.drawable.flag_united_states, R.drawable.flag_united_states, R.drawable.flag_sweden, R.drawable.flag_brazil, R.drawable.flag_germany};
        String[] names = getResources().getStringArray(R.array.forbes);
        Person[] arr = new Person[names.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Person(names[i], money[i], country[i]);
        }

        return arr;
    }
    @Override
    public void onBackPressed() {
        finish();
    }
}