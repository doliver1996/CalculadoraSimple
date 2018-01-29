package co.edu.uninorte.calculadorasimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private TextView txt1;
    private TextView txt2;
    int numero =7;
    int numero2= 8;
    int numero3= 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        txt1 = (TextView)findViewById(R.id.txt1);
        //txt2 = (TextView)findViewById(R.id.txt2);

    }


     public void button2(View view){
        // String numero = txt1.getText().toString();
        txt1.setText(numero);


     }


    public void button3(View view){
         txt1.setText(numero2);


    }
    public void button4(View view){
        txt1.setText(numero3);

    }
    public void button5(View view){


    }
    public void button6(View view){


    }
    public void button7(View view){



    }
    public void button8(View view){


    }
    public void button9(View view){


    }
    public void button10(View view){


    }
    public void button11(View view){


    }
    public void button12(View view){


    }
    public void button13(View view){


    }
    public void button14(View view){


    }
    public void button15(View view){


    }
    public void button16(View view){


    }
    public void button17(View view){


    }
    public void button18(View view){


    }








}








