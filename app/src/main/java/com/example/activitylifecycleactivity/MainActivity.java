package com.example.activitylifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }
    }

    //private static String TAG = "LIFTCYCLE";
    @Override  //完全生命周期开始时被调用，初始化Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i(TAG, "(1) onCreate()");


            /*Intent intent2 = getIntent();
            final String result = intent2.getStringExtra("result");
            if(result != null) {
                Toast.makeText(this, result, Toast.LENGTH_LONG).show();
            }*/

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=
                        new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("name","李奇峰");
                intent.putExtra("age",20);
                startActivityForResult(intent,0);
            }
        });

    }



/*
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "(2) onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "(5) onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "(3) onResume()");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG,"(4) onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "(6) onRestart()");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "(7) onDestroy()");
    }
*/
}