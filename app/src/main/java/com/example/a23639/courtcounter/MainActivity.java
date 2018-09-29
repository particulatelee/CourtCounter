package com.example.a23639.courtcounter;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        TextView text = findViewById(R.id.text1);
        EditText input1 = findViewById(R.id.editText1);
        EditText input2 = findViewById(R.id.editText2);
        float a,b;
        String c;
        try{
            a = Float.parseFloat(input1.getText().toString());
            b = Float.parseFloat(input2.getText().toString());
            c = String.format("%.2f", b / a / a);
            text.setText("您的BMI数值为:" + c);
        }catch (Exception e){
            Toast toast = Toast.makeText(this,"输入不合法",Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void next(View view){
        Intent intent = new Intent(this,ExchangeActivity.class);
        startActivity(intent);
    }

}
