package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    double[] c = new double[]{0.0 ,0.0,0.0,0.0,0.0,0.0,0.0,0.0 };
    double[] cr  = new double[]{0.0 ,0.0,0.0,0.0,0.0,0.0,0.0,0.0 };
    public static double sum = 0.0, avg = 0.0 , credit= 0.0;
    EditText c1 , c2 , c3 ,c4 ,c5 , c6 ,c7 ,c8;
    EditText cr1, cr2, cr3 ,cr4 ,cr5, cr6 ,cr7, cr8 ;

    Button b ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1   = findViewById(R.id.c1);
        cr1 = findViewById(R.id.cr1);

        c2   = findViewById(R.id.c2);
        cr2 = findViewById(R.id.cr2);

        c3   = findViewById(R.id.c3);
        cr3 = findViewById(R.id.cr3);

        c4   = findViewById(R.id.c4);
        cr4 = findViewById(R.id.cr4);

        c5   = findViewById(R.id.c5);
        cr5 = findViewById(R.id.cr5);

        c6   = findViewById(R.id.c6);
        cr6 = findViewById(R.id.cr6);

        c7   = findViewById(R.id.c7);
        cr7 = findViewById(R.id.cr7);

        c8   = findViewById(R.id.c8);
        cr8 = findViewById(R.id.cr8);

        final TextView t = findViewById(R.id.cal);

        b = findViewById(R.id.submitB);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c1.getText().toString().equals(""))
                    c[0] = Double.parseDouble(c1.getHint().toString());
                else
                    c[0] = Double.parseDouble(c1.getText().toString());

                if(c2.getText().toString().equalsIgnoreCase(""))
                    c[1] = Double.parseDouble(c2.getHint().toString());
                else
                    c[1] = Double.parseDouble(c2.getText().toString());
                
                if(c3.getText().toString().equalsIgnoreCase(""))
                    c[2] = Double.parseDouble(c3.getHint().toString());
                else
                    c[2] = Double.parseDouble(c3.getText().toString());

                if(c4.getText().toString().equalsIgnoreCase(""))
                    c[3] = Double.parseDouble(c4.getHint().toString());
                else
                    c[3] = Double.parseDouble(c4.getText().toString());

                if(c5.getText().toString().equals(""))
                    c[4] = Double.parseDouble(c5.getHint().toString());
                else
                    c[4] = Double.parseDouble(c5.getText().toString());

                if(c6.getText().toString().equals(""))
                    c[5] = Double.parseDouble(c6.getHint().toString());
                else
                    c[5] = Double.parseDouble(c6.getText().toString());

                if(c7.getText().toString().equals(""))
                    c[6] = Double.parseDouble(c7.getHint().toString());
                else
                    c[6] = Double.parseDouble(c7.getText().toString());

                if(c8.getText().toString().equals(""))
                    c[7] = Double.parseDouble(c8.getHint().toString());
                else
                    c[7] = Double.parseDouble(c8.getText().toString());

                if(cr1.getText().toString().equals(""))
                    cr[0] = Double.parseDouble(cr1.getHint().toString());
                else
                    cr[0] = Double.parseDouble(cr1.getText().toString());

                if(cr2.getText().toString().equals(""))
                    cr[1] = Double.parseDouble(cr2.getHint().toString());
                else
                    cr[1] = Double.parseDouble(cr2.getText().toString());
                
                if(cr3.getText().toString().equals(""))
                    cr[2] = Double.parseDouble(cr3.getHint().toString());
                else
                    cr[2] = Double.parseDouble(cr3.getText().toString());
                
                if(cr4.getText().toString().equals(""))
                    cr[3] = Double.parseDouble(cr4.getHint().toString());
                else
                    cr[3] = Double.parseDouble(cr4.getText().toString());
                
                if(cr5.getText().toString().equals(""))
                    cr[4] = Double.parseDouble(cr5.getHint().toString());
                else
                    cr[4] = Double.parseDouble(cr5.getText().toString());
                
                if(cr6.getText().toString().equals(""))
                    cr[5] = Double.parseDouble(cr6.getHint().toString());
                else
                    cr[5] = Double.parseDouble(cr6.getText().toString());
                
                if(cr7.getText().toString().equals(""))
                    cr[6] = Double.parseDouble(cr7.getHint().toString());
                else
                    cr[6] = Double.parseDouble(cr7.getText().toString());
                
                if(cr8.getText().toString().equals(""))
                    cr[7] = Double.parseDouble(cr8.getHint().toString());
                else
                    cr[7] = Double.parseDouble(cr8.getText().toString());

                for(int i=0;i<8;i++)
                {
                    sum += c[i]*cr[i]; credit += cr[i] ;
                }
                avg = sum/credit ;

                avg = (double) Math.round( avg * 100 )/100 ;

                //New Activity
                startActivity(new Intent(MainActivity.this,Pop.class));


            }
        });

    }


}
