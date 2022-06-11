package com.cursoAndroid.primeiroApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortNumber(View view){
        TextView text = findViewById(R.id.textResult); /* pegando a referencia do id*/
        int resultNumber = new Random().nextInt(11);
        text.setText("O número selecionado foi: " + resultNumber); /* setando o texto do elemento */
    }
}