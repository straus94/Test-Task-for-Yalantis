package com.example.drum.testforyalantis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //create RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        //create RecyclerView adapter
        adapter = new RecyclerViewAdapter(this, new int[] {R.drawable.img_1, R.drawable.img_2, R.drawable.img_3});
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //show name control
    public void onClick(View v){
        TextView tv = (TextView) findViewById(v.getId());
        Toast.makeText(MainActivity.this, tv.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}

