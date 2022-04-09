package com.shayekh.android.driver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DriverVerification extends AppCompatActivity {
    private EditText editText;
    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_verification);
        editText=(EditText)findViewById(R.id.driverId);
        confirm=(Button)findViewById(R.id.confirmButton);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText.getText().toString().equals("1342"))
                {
                    Intent intent=new Intent(DriverVerification.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast.makeText(DriverVerification.this, "Driver Code is Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
