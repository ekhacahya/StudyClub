package id.eka_cbn.studyclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonNavigasi;

    private TextView textSkor;
    private int skor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = (Button)findViewById(R.id.buttonOne);
        buttonTwo = (Button)findViewById(R.id.buttonTwo);
        buttonThree = (Button)findViewById(R.id.buttonThree);
        buttonNavigasi = (Button)findViewById(R.id.buttonNav);

        textSkor = (TextView)findViewById(R.id.textSkor);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahSkor(5);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahDua();
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahTiga();
            }
        });

        buttonNavigasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Halaman2.class);

                startActivity(intent);
            }
        });
    }

    private void tambahSkor(int score){
        skor += score;
        textSkor.setText(""+skor);
    }

    private void tambahSatu(){
        skor += 1;
        textSkor.setText(""+skor);
    }
    private void tambahTiga(){
        skor += 3;
        textSkor.setText(""+skor);
    }

    private void tambahDua(){
        skor += 2;
        textSkor.setText(""+skor);
    }

}
