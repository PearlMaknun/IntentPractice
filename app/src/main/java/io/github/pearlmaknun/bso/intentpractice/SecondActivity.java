package io.github.pearlmaknun.bso.intentpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nama = findViewById(R.id.NamaLengkap);

        String namaLengkap = getIntent().getStringExtra("nama");

        nama.setText(namaLengkap);

    }
}
