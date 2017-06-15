package com.tatlicilar.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAdd;
    Button btnSubtract;
    Button btnMultiply;
    Button btnDivide;
    Button btnEqual;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonErase;
    Button buttonMc;
    Button buttonDecimal;

    EditText ekran;

    private double operand = 0;
    private double operand2 = 0;

    String add = "+";
    String sub = "-";
    String mult = "*";
    String div = "/";
    String equal = "=";
    String islem;
    public String result = null;

    boolean plus ,minus ,mul , divide ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.buttonPlus);
        btnSubtract = (Button) findViewById(R.id.buttonMinus);
        btnMultiply = (Button) findViewById(R.id.buttonMult);
        btnDivide = (Button) findViewById(R.id.buttonDiv);
        btnEqual = (Button) findViewById(R.id.buttonEqual);
        buttonErase = (Button) findViewById(R.id.buttonErase);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonMc =(Button) findViewById(R.id.buttonMc);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        ekran = (EditText) findViewById(R.id.ekran);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        buttonErase.setOnClickListener(this);
        buttonMc.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        buttonErase.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonPlus:
                calc(add);
            break;
            case R.id.buttonMinus:
                calc(sub);
                break;
            case R.id.buttonMult:
                calc(mult);
                break;
            case R.id.buttonDiv:
                calc(div);
                break;
            case R.id.buttonEqual:
                calc(equal);
                break;
            case R.id.buttonMc:
                ekran.setText("");
                operand = 0.0;
                operand2 = 0.0;
                break;
            case R.id.buttonDecimal:
                ekran.append(".");
                break;
            case R.id.buttonErase:
                backspace();
                break;
            case R.id.button0:
                ekran.append("0");
                break;
            case R.id.button1:
                ekran.append("1");
                break;
            case R.id.button2:
                ekran.append("2");
                break;
            case R.id.button3:
                ekran.append("3");
                break;
            case R.id.button4:
                ekran.append("4");
                break;
            case R.id.button5:
                ekran.append("5");
                break;
            case R.id.button6:
                ekran.append("6");
                break;
            case R.id.button7:
                ekran.append("7");
                break;
            case R.id.button8:
                ekran.append("8");
                break;
            case R.id.button9:
                ekran.append("9");
                break;
    }
    }

    public void calc(String islem){

        if(islem.equals("+")){
            if (ekran == null){
                ekran.setText("");
            }else {
                operand = Double.parseDouble(ekran.getText() + "");
                plus = true;
                ekran.setText(null);
            }
        }
        else if(islem.equals("-")){
                operand = Double.parseDouble(ekran.getText() + "");
                minus = true ;
                ekran.setText(null);
        }
        else if(islem.equals("*")){
            operand = Double.parseDouble(ekran.getText() + "");
            mul = true ;
            ekran.setText(null);
        }
        else if(islem.equals("/")){
            operand = Double.parseDouble(ekran.getText()+"");
            divide = true ;
            ekran.setText(null);
        }
        else if(islem.equals("=")){

            operand2 = Float.parseFloat(ekran.getText() + "");

            if (plus == true){
                ekran.setText(operand + operand2 +"");
                plus =false;
            }

            if (minus == true){
                ekran.setText(operand - operand2+"");
                minus=false;
            }

            if (mul == true){
                ekran.setText(operand * operand2+"");
                mul=false;
            }

            if (divide == true){
                ekran.setText(operand / operand2+"");
                divide=false;
            }
        }

    }
    private void backspace()
    {
        String str=ekran.getText().toString();
        if (str.length() >0 ) {
            str = str.substring(0, str.length() - 1);
            ekran.setText(str);
        }
    }
}
