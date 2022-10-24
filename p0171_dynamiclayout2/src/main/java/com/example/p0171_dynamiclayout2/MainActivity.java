package com.example.p0171_dynamiclayout2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llMain;
    RadioGroup RGGravity;
    EditText etName;
    Button btnClear;
    Button btnCreate;

    int  wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = findViewById(R.id.llMain);
        RGGravity = findViewById(R.id.rgGravity);
        etName = findViewById(R.id.etName);

        btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);

        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
    switch (view.getId()) {
        case R.id.btnCreate:
        LinearLayout.LayoutParams xx = new LinearLayout.LayoutParams(wrapContent, wrapContent);
        int btnGravity = Gravity.LEFT;

        switch (RGGravity.getCheckedRadioButtonId()) {

            case R.id.rbLeft:
                btnGravity = Gravity.LEFT;
                break;

            case R.id.rbCenter:
                btnGravity = Gravity.CENTER_HORIZONTAL;
                break;

            case R.id.rbRight:
                btnGravity = Gravity.RIGHT;
                break;
        }

            xx.gravity = btnGravity;

            Button btnNew = new Button(this);
            btnNew.setText(etName.getText().toString());
            llMain.addView(btnNew, xx);
            break;

        case R.id.btnClear:
            llMain.removeAllViews();
            Toast.makeText(this, "Удалено", Toast.LENGTH_SHORT).show();
            break;
}
    }
}