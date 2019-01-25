package com.gb.listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String stringArray[] = {"RedMi","Oppo","Vivo","Nokia","Samsung","Lenovo","Micromax","LG","IPhone","Honor"};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.item_row,R.id.txtItemName,stringArray);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String s = (String) adapterView.getItemAtPosition(i);
        onToastShow(MainActivity.this,s);
    }

    private void onToastShow(Context context, String msg) {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
