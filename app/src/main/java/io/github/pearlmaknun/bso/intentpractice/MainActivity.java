package io.github.pearlmaknun.bso.intentpractice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnimplisit = findViewById(R.id.btn_implicit);
        Button btnexplicit = findViewById(R.id.btn_explicit);
        final EditText namaLengkap = findViewById(R.id.txtNama);
        Button send = findViewById(R.id.btnSend);

        btnexplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicitIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(explicitIntent);
            }
        });

        btnimplisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implisitIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com"));
                startActivity(implisitIntent);
            }
        });

        btnexplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("nama", namaLengkap.getText().toString());
                startActivity(i);
            }
        });
    }
}
