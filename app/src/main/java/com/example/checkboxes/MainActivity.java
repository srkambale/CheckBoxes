package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     CheckBox c1, c2, c3,c4;
     Button button;
     TextView textView;
     ArrayList<String> result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.Checkbox1);
        c2=findViewById(R.id.Checkbox2);
        c3=findViewById(R.id.Checkbox3);
        c4=findViewById(R.id.Checkbox4);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textview);
        result=new ArrayList<>();
        textView.setEnabled(false);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()){
                    result.add("Pizza");
                }else{
                    result.remove("Pizza");
                }

            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c2.isChecked()){
                    result.add("Burger");
                }else{
                    result.remove("Burger");
                }
            }
        });
     c3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if(c3.isChecked()){
                 result.add("Coffee");
             }else {
                 result.remove("Coffee");
             }
         }
     });
     c4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if(c4.isChecked()){
                 result.add("Sandwich");
             }else{
                 result.remove("Sandwich");
         }}
     });
     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             StringBuilder stringBuilder=new StringBuilder();
             for (String s:result){
                 stringBuilder.append(s).append("\n");

                textView.setText(stringBuilder.toString());
                textView.setEnabled(false);
         }}
     });

     }
    }

