package kr.co.my.myevent1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener{
    Button birthDatePicker, specifiedDatePicker;
    Button showbio;
    EditText txtbirthdate, txtthedate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showComponent();
    }

    public void showComponent() {
        //layout에 있는 컴포넌트 객체 생성
        birthDatePicker = findViewById(R.id.birthDatePicker);
        specifiedDatePicker = findViewById(R.id.specifiedDatePicker);
        showbio = findViewById(R.id.showbio);
        txtbirthdate = findViewById(R.id.txtbirthdate);
        txtthedate = findViewById(R.id.txtthedate);

        birthDatePicker.setOnClickListener(this);
        specifiedDatePicker.setOnClickListener(this);
        showbio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == birthDatePicker){
            this.txtbirthdate.setText("Hello");
        } else if (v == specifiedDatePicker){
            txtthedate.setText(new Date().toString());
        }else if (v == showbio){
            String st = String.format("%s! 오늘은 %s다.",txtbirthdate.getText(), txtthedate.getText());
            Toast.makeText(getBaseContext(),st,Toast.LENGTH_LONG).show();
        }
    }
}