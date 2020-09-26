package com.example.activitylifecycleactivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent2 = getIntent();
        final String name2 = intent2.getStringExtra("name");
        final Integer age2 = intent2.getIntExtra("age",0);
        //intent2.putExtra("result","姓名:"+name2+"年龄:"+age2);
        //setResult(0,intent);
        //finish();
        Toast.makeText(this,name2+age2,Toast.LENGTH_LONG).show();

        Button btnback = (Button)findViewById(R.id.buttonReturn);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(AnotherActivity.this,MainActivity.class);
                intent.putExtra("result","AnotherActivity已接收："+name+age);
                startActivity(intent);
                finish();*/
                Intent intent = getIntent();
                String name = intent.getStringExtra("name");
                Integer age = intent.getIntExtra("age",0);
                intent.putExtra("result","姓名:"+name+"年龄:"+age);
                setResult(0,intent);
                finish();
            }
        });
    }
}