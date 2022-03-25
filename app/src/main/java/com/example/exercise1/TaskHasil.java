package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TaskHasil extends AppCompatActivity {

    TextView task,jenis,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_hasil);

        task = findViewById(R.id.showTask);
        jenis = findViewById(R.id.showJenistask);
        time = findViewById(R.id.showTimetask);

        Bundle bundle =getIntent().getExtras();

        String isitask = bundle.getString("d");
        String isijenis = bundle.getString("e");
        String isitime = bundle.getString("f");

        task.setText(isitask);
        jenis.setText(isijenis);
        time.setText(isitime);
    }
}