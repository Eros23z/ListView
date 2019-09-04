package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    int[]imagen = {R.drawable.uno, R.drawable.dos, R.drawable.tres};
    int[]estrellas = {4, 3, 5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        lista=(ListView)findViewById(R.id.milista);
        lista.setAdapter(new Adapter(this,imagen,estrellas));
    }


}
