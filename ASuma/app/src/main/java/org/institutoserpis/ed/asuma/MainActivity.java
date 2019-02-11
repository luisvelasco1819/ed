package org.institutoserpis.ed.asuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textViewResult = findViewById(R.id.textViewResult);
    }

    private double getDouble1() {
        String string1 = editText1.getText().toString();
        return Double.parseDouble(string1);
    }

    private double getDouble2() {
        String string2 = editText2.getText().toString();
        return Double.parseDouble(string2);
    }

    public void onButtonSumaClick(View view) {
        System.out.println("onButtonSumaClick ejecutando");

        double doubleResult = getDouble1() + getDouble2();
        textViewResult.setText(String.valueOf(doubleResult));
    }

    public void onButtonRestaClick(View view) {
        System.out.println("onButtonRestaClick ejecutando");

        //double doubleResult = getDouble1() - getDouble2();
        //textViewResult.setText(String.valueOf(doubleResult));
        String string1 = editText1.getText().toString();
        BigDecimal decimal1 = new BigDecimal(string1);
        String string2 = editText2.getText().toString();
        BigDecimal decimal2 = new BigDecimal(string2);
        BigDecimal decimalResult = decimal1.subtract(decimal2);
        textViewResult.setText(decimalResult.toString());
    }
}
