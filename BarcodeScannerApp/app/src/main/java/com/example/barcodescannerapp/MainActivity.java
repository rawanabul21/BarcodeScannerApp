package com.example.barcodescannerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.barcodescannerapp.ScanCodeActivity.barcode_value;

public class MainActivity extends AppCompatActivity {

    public static TextView resultTextView;
    Button scan_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView=(TextView) findViewById(R.id.result_text);
        scan_btn= (Button) findViewById(R.id.btn_scan);

        scan_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));

            }
        });



    }
}
