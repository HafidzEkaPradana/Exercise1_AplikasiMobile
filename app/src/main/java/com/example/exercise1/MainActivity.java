package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi variable button
    Button btnLogin;
    //deklarasi edittext nama dan password
    EditText inputNama,inputPassword;

    //deklarasi variable untuk menyimpan nama dan password
    String nama, password;

    //deklarasi variable untuk menyimpan nama dan password register
    String namaReg, passwordReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variable btn login dengan component button pada layout
        btnLogin=findViewById(R.id.btSignin);

        //menghubungkan variable epassword dengan component pada layout
        inputNama=findViewById(R.id.edNama);

        //Menghubungkan variable epassword dengan component pada layout
        inputPassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set isi nama dan password yang benar
                //String namaSet = "hafaidzekapradan";
                //String passwordSet = "hafidz2022";



                //memasukkan input user kedalam nama dan password
                nama = inputNama.getText().toString();
                password = inputPassword.getText().toString();

                if(nama.isEmpty() || password.isEmpty()){
                    Toast t =Toast.makeText(getApplicationContext(),"Nama dan Password wajib diisi", Toast.LENGTH_LONG);
                    t.show();
                }else{
                    if(nama.equals(namaReg) && password.equals(passwordReg)){
                        Toast t = Toast.makeText(getApplicationContext(), "Login Sukses",Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());
                        //memasukkan value dari variable nama dengan kunci "b"
                        //dan dimasukkan dibundle

                        b.putString("b", password.trim());

                        //membuat object indent berpindah activity dari mainactivity ke activityhasil
                        Intent i = new Intent(getApplicationContext(), MainHomeActivity.class);

                        //memasukkan bundle ke dalam intent untuk dikirimkan ke activityHasil
                        i.putExtras(b);
                        //berpindah ke ActivityHasil
                        startActivity(i);
                    }
                }

            }
        });


    }


}