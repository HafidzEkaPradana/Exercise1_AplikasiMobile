package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class RegisterActivity extends AppCompatActivity {

    EditText edtNama, edtEmail, edtPassword, edtRePassword;
    Button btnRegis;

    String namaReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtNama = findViewById(R.id.edNamaReg);
        edtEmail = findViewById(R.id.edEmailReg);
        edtPassword = findViewById(R.id.edPassReg);
        edtRePassword = findViewById(R.id.edRePassReg);

        btnRegis = findViewById(R.id.btnRegister);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNama.getText().toString().isEmpty() || edtEmail.getText().toString().isEmpty() ||
                edtPassword.getText().toString().isEmpty() || edtRePassword.getText().toString().isEmpty()){
                    Snackbar.make(view, "Seluruh Data Wajib diisi !!", Snackbar.LENGTH_LONG).show();
                }else{
                    if(edtPassword.getText().toString().equals(edtRePassword.getText().toString())){
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                        Intent i =new Intent(getApplicationContext(),MainHomeActivity.class);
                        startActivity(i);

                        namaReg = edtNama.getText().toString();
                        Bundle bundleReg = new Bundle();
                        bundleReg.putString("c", namaReg.trim());
                    }else{
                        Snackbar.make(view, "Kedua password tidak sama", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}