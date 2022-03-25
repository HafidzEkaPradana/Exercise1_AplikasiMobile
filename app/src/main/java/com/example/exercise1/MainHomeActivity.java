package com.example.exercise1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainHomeActivity extends AppCompatActivity {

    EditText edtTask, edtJenistask, edtTimetask;
    FloatingActionButton fab;

    TextView namaSelamat;

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

        Bundle bundle =getIntent().getExtras();
        //String displayNama = bundle.getString("a");

        //namaSelamat.setText(displayNama);

    }
}