package com.example.textrecognisation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.textrecognisation.TextRecognisation.RESULT_TEXT;

public class ResultActivity extends AppCompatActivity {

    private Button backButton;
    private TextView resultTextView;
    private  String resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView= findViewById(R.id.result_textview);
        backButton=findViewById(R.id.back_button);
        resultText = getIntent().getStringExtra(RESULT_TEXT);
        resultTextView.setText(resultText);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}