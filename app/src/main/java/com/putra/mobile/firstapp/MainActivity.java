package com.putra.mobile.firstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // Context context = this;
    EditText user, pass;
    TextView hasil1;
    Button pindah, alert, toast, kali, bagi, tambah, kurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pindah = (Button)findViewById(R.id.btnPindah);
        alert = (Button)findViewById(R.id.btnAlert);
        toast = (Button)findViewById(R.id.btnToast);
        user = (EditText)findViewById(R.id.idInputUser);
        pass = (EditText)findViewById(R.id.idInputPass);
        hasil1 = (TextView)findViewById(R.id.txthasil);
        kali = (Button)findViewById(R.id.btnKali);
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(user.getText().toString());
                int b = Integer.parseInt(pass.getText().toString());
                int c = a * b;
                hasil1.setText("Hasil Kali : "+c);
            }
        });

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //proses1();
                hasil1.setText("Username : "+user.getText().toString()+"\nPassword :"+pass.getText().toString());
            }
        });
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //proses1();
                new AlertDialog.Builder(MainActivity.this)
                   .setTitle("Information")
                   .setMessage("Username : "+user.getText().toString()+"\nPassword : "+pass.getText().toString())
                   .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int i) {
                           Intent al = new Intent(MainActivity.this, MainActivity.class);
                           startActivity(al);
                       }
                   })
                   .show();
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //proses1();
                Toast.makeText(getApplicationContext(), "This Is Toast Information"+"\nUsername :"+user.getText().toString()+
                                "\nPassword :"+pass.getText().toString(),
               Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}
