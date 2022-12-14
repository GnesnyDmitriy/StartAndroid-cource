package com.example.p0191_simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    EditText etNum1;
    EditText etNum2;

    Button btnadd;
    Button btnsub;
    Button btnmult;
    Button btndiv;

    TextView tvResult;

    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);

        btnadd = findViewById(R.id.btnAdd);
        btnsub = findViewById(R.id.btnSub);
        btnmult = findViewById(R.id.btnMult);
        btndiv = findViewById(R.id.btnDiv);

        tvResult = findViewById(R.id.tvResult);

        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmult.setOnClickListener(this);
        btndiv.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        float num1 = 0;
        float num2 = 0;
        float result = 0;

        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        switch (view.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
                if (num2 == 0) {
                    tvResult.setText(R.string.ooo);
                }
                break;

            default:
                break;


        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_RESET_ID, 0, "Reset");
        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_RESET_ID:

                etNum1.setText("");
                etNum2.setText("");
                tvResult.setText("");
                break;
            case MENU_QUIT_ID:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}