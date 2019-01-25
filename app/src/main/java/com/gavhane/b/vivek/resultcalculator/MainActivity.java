package com.gavhane.b.vivek.resultcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1,e2,e3,e4,e5;
    TextView t1,t2;
    String e11,e22,e33,e44,e55,AverageString;
    int n1,n2,n3,n4,n5;
    float Average1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        e5 = (EditText) findViewById(R.id.editText5);

        b1 = (Button) findViewById(R.id.button);

        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e11  = e1.getText().toString();
                e22  = e2.getText().toString();
                e33  = e3.getText().toString();
                e44  = e4.getText().toString();
                e55  = e5.getText().toString();

                n1 = Integer.parseInt(e11);
                n2 = Integer.parseInt(e22);
                n3 = Integer.parseInt(e33);
                n4 = Integer.parseInt(e44);
                n5 = Integer.parseInt(e55);

                Average1 = (n1+n2+n3+n4+n5)/5 ;
                AverageString = String.valueOf(Average1);

                if (Average1>=90)
                {
                    t1.setText("Your average is "+ AverageString);
                    t2.setText("Your grade is A");
                } else if (Average1<90 && Average1 >=80)
                {
                    t1.setText("Your average is "+ AverageString);
                    t2.setText("Your grade is B");
                }else
                {
                    t1.setText("Your average is "+ AverageString);
                    t2.setText("Your grade is C");
                }

            }
        });
    }
}
