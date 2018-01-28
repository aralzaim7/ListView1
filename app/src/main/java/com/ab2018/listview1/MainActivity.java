package com.ab2018.listview1;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.ab2018.listview1.R;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ArrayList studentsList;
    ListView studentListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentListView = findViewById(R.id.ogrenciList);

        studentsList = new ArrayList<String>();
        studentsList.add("Fahrettin Erdinç");
        studentsList.add("Sezer Uğuz");
        studentsList.add("Berk Erdem");
        studentsList.add("Didem Filiz");

        // nerede gösterecem, nasil gösterecem, ne gösterecem sorularına cevap verir adaptör
        ArrayAdapter adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, studentsList);
        studentListView.setAdapter(adapter);

    }
}
