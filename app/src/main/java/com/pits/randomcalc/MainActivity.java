package com.pits.randomcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonAdd;
    private Button mButtonSub;
    private Button mButtonMul;
    private Button mButtonDiv;

    private EditText mInputOne;
    private EditText mInputTwo;
    private EditText mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonAdd = (Button) findViewById(R.id.button);
        mButtonSub = (Button) findViewById(R.id.button_substract);
        mButtonMul = (Button) findViewById(R.id.button_multiply);
        mButtonDiv = (Button) findViewById(R.id.button_divide);

        mInputOne = (EditText) findViewById(R.id.field_one);
        mInputTwo = (EditText) findViewById(R.id.field_two);
        mResult = (EditText) findViewById(R.id.field_result);

        mButtonAdd.setOnClickListener(this);
        mButtonSub.setOnClickListener(this);
        mButtonMul.setOnClickListener(this);
        mButtonDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String fieldOneText = mInputOne.getText().toString();
        String fieldTwoText = mInputTwo.getText().toString();
        int fieldOneValue = Integer.valueOf(fieldOneText);
        int fieldTwoValue = Integer.valueOf(fieldTwoText);
        switch (v.getId()) {
            case R.id.button:
                if (fieldOneText.isEmpty() || fieldTwoText.isEmpty()) {
                    Toast.makeText(
                            getApplicationContext(),
                            "Both inputs should be filled.",
                            Toast.LENGTH_SHORT
                    ).show();
                    return;
                }
                mResult.setText(String.valueOf(fieldTwoValue - fieldOneValue));
                break;
            case R.id.button_substract:
                if (fieldOneText.isEmpty() || fieldTwoText.isEmpty()) {
                    Toast.makeText(
                            getApplicationContext(),
                            "Both inputs should be filled.",
                            Toast.LENGTH_SHORT
                    ).show();
                    return;
                }
                mResult.setText(String.valueOf(fieldOneValue - fieldTwoValue));
                break;
            case R.id.button_multiply:
                if (fieldOneText.isEmpty() || fieldTwoText.isEmpty()) {
                    Toast.makeText(
                            getApplicationContext(),
                            "Both inputs should be filled.",
                            Toast.LENGTH_SHORT
                    ).show();
                    return;
                }
                mResult.setText(String.valueOf(fieldTwoValue / fieldOneValue));
                break;
            case R.id.button_divide:
                if (fieldOneText.isEmpty() || fieldTwoText.isEmpty()) {
                    Toast.makeText(
                            getApplicationContext(),
                            "Both inputs should be filled.",
                            Toast.LENGTH_SHORT
                    ).show();
                    return;
                }
                mResult.setText(String.valueOf(fieldOneValue / fieldTwoValue));
                break;
        }
    }
}
