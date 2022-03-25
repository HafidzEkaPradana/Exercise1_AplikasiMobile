package com.example.exercise1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainHomeActivity extends AppCompatActivity {

    EditText edtTask, edtJenistask, edtTimetask;
    FloatingActionButton fab;
    String task,jenistask,timetask;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.mnLogout)
        {
            //method memanggil activity "Pendaftaran"
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        //namaSelamat = findViewById(R.id.tvNama);

        //Bundle bundle =getIntent().getExtras();
        //String display = bundle.getString("c");
        //namaSelamat.setText(display);

        edtTask =findViewById(R.id.edTask);
        edtJenistask = findViewById(R.id.edJenistask);
        edtTimetask = findViewById(R.id.edTimetask);
        fab = findViewById(R.id.fbSubmit);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                task = edtTask.getText().toString();
                jenistask = edtJenistask.getText().toString();
                timetask = edtTimetask.getText().toString();

                if(task.isEmpty() || jenistask.isEmpty() || timetask.isEmpty()){
                    Snackbar.make(view, "Semua data harus diisi",Snackbar.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getApplicationContext(),"Task Berhasil Ditambah", Toast.LENGTH_LONG).show();

                    Bundle b = new Bundle();
                    b.putString("d",task.trim());
                    b.putString("e", jenistask.trim());
                    b.putString("f", timetask.trim());

                    Intent i = new Intent(getApplicationContext(), TaskHasil.class);

                    i.putExtras(b);
                    startActivity(i);
                }



            }
        });

    }

}