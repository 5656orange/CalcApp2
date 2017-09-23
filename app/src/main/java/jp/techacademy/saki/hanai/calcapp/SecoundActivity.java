package jp.techacademy.saki.hanai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.math.BigDecimal;

public class SecoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");
        String operator = intent.getStringExtra("OPERATOR");

        TextView textView1 = (TextView) findViewById(R.id.textView1);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        if(operator.equals("add")){
            textView1.setText(value1+"+"+value2+" =");
            textView2.setText(String.valueOf(Double.parseDouble(value1) + Double.parseDouble(value2)));
        }else if(operator.equals("sub")){
            textView1.setText(value1+"-"+value2+" =");
            textView2.setText(String.valueOf(Double.parseDouble(value1) - Double.parseDouble(value2)));
        }else if(operator.equals("mul")){
            textView1.setText(value1+"*"+value2+" =");
            textView2.setText(String.valueOf(Double.parseDouble(value1) * Double.parseDouble(value2)));
        }else if(operator.equals("dev")){
            textView1.setText(value1+"/"+value2+" =");
            textView2.setText(String.valueOf(Double.parseDouble(value1) / Double.parseDouble(value2)));
        }
    }
}
