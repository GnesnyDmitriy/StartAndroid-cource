import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ru.startandroid.develop.listener.R;

public class MainActivity extends Activity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    private View.OnClickListener oclBtn;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button)

                View.OnClickListener oclBtn = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                public void onClick (View v){
                    // по id определеяем кнопку, вызвавшую этот обработчик
                    switch (v.getId()) {
                        case R.id.btnOk:
                            // кнопка ОК
                            tvOut.setText("Нажата кнопка ОК");
                            break;
                        case R.id.btnCancel:
                            // кнопка Cancel
                            tvOut.setText("Нажата кнопка Cancel");
                            break;
                        btnOk.setOnClickListener(oclBtn);
                        btnCancel.setOnClickListener(oclBtn);
                    }
                }
            }
        };

    }
}