package com.example.madlab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et1=(EditText) findViewById(R.id.et1);
        EditText et2=(EditText) findViewById(R.id.et2);
        Button bt1 = (Button) findViewById(R.id.sbmt_button);
        CheckBox c1=(CheckBox)findViewById(R.id.checkBox);
        CheckBox c2=(CheckBox)findViewById(R.id.checkBox2);
        CheckBox c3=(CheckBox)findViewById(R.id.checkBox3);
        CheckBox c4=(CheckBox)findViewById(R.id.checkBox4);
        CheckBox c5=(CheckBox)findViewById(R.id.checkBox5);
        Button bt2 = (Button) findViewById(R.id.button2);
        String arr[]={"cse","ece","mech","it","civil","eee"};
        Spinner sp=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> aa=new ArrayAdapter<CharSequence>( this, R.array.weeks, android.R.layout.simple_spinner_item);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder sb=new StringBuilder();

                TextView t1=(TextView) findViewById(R.id.textView);
                t1.setText(et1.getText().toString() + et2.getText().toString());
                Toast.makeText(MainActivity.this,et1.getText().toString()+" "+et2.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res= "Selected options :\n";
                StringBuilder sb2=new StringBuilder();
                if(c2.isSelected()){
                    sb2.append(c2.getText().toString());
                    res+=c2.getText().toString();
                }
                if(c3.isSelected()){
                    sb2.append(c3.getText().toString());

                    res+=c3.getText().toString();

                }
                if(c4.isSelected()){
                    sb2.append(c4.getText().toString());
                    res+=c4.getText().toString();
                }
                if(c5.isSelected()){
                    sb2.append(c5.getText().toString());
                    res+=c5.getText().toString();
                }

                Toast.makeText(getApplicationContext(), sb2.toString()+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
}