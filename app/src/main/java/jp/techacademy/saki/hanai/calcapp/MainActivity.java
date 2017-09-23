package jp.techacademy.saki.hanai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static jp.techacademy.saki.hanai.calcapp.R.id.textView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

        Button button_add = (Button) findViewById(R.id.button_add);
        button_add.setOnClickListener(this);
        Button button_sub = (Button) findViewById(R.id.button_sub);
        button_sub.setOnClickListener(this);
        Button button_mul = (Button) findViewById(R.id.button_mul);
        button_mul.setOnClickListener(this);
        Button button_dev = (Button) findViewById(R.id.button_dev);
        button_dev.setOnClickListener(this);

        mTextView = (TextView) findViewById(textView);
    }

    @Override
    public void onClick(View v) {
        //check EditText number

        if(mEditText1.getText().toString().equals("") ||mEditText2.getText().toString().equals("")  ){
            mTextView.setText("put number to all textboxes");
        }else {
            if (v.getId() == R.id.button_add) {
                Intent intent = new Intent(this, SecoundActivity.class);
                intent.putExtra("VALUE1", mEditText1.getText().toString());
                intent.putExtra("VALUE2", mEditText2.getText().toString());
                intent.putExtra("OPERATOR", "add");
                startActivity(intent);
            } else if (v.getId() == R.id.button_sub) {
                Intent intent = new Intent(this, SecoundActivity.class);
                intent.putExtra("VALUE1", mEditText1.getText().toString());
                intent.putExtra("VALUE2", mEditText2.getText().toString());
                intent.putExtra("OPERATOR", "sub");
                startActivity(intent);
            } else if (v.getId() == R.id.button_mul) {
                Intent intent = new Intent(this, SecoundActivity.class);
                intent.putExtra("VALUE1", mEditText1.getText().toString());
                intent.putExtra("VALUE2", mEditText2.getText().toString());
                intent.putExtra("OPERATOR", "mul");
                startActivity(intent);
            } else if (v.getId() == R.id.button_dev) {
                Intent intent = new Intent(this, SecoundActivity.class);
                if(Double.parseDouble(mEditText2.getText().toString())==0.0) {
                    mTextView.setText("can't divide by zero");
                }else {
                    intent.putExtra("VALUE1", mEditText1.getText().toString());
                    intent.putExtra("VALUE2", mEditText2.getText().toString());
                    intent.putExtra("OPERATOR", "dev");
                    startActivity(intent);
                }
            }
        }
    }
}