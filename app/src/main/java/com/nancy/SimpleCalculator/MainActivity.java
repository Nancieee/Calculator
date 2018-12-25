package com.nancy.SimpleCalculator;

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

        Button additionBtn =(Button) findViewById(R.id.additionBtn);

        additionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumberEditText = (EditText) findViewById(R.id.FirstNumEditText);
                EditText secondNumberEditText = (EditText)findViewById(R.id.secondNumEditText);

                TextView resultTextView = (TextView) findViewById(R.id.resultText);

                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());

                int result = num1+num2;

                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}
