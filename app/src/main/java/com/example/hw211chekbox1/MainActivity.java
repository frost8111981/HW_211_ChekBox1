package com.example.hw211chekbox1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edittext = findViewById(R.id.editText);   // СОЗДАЕМ ПЕРЕМЕННУЮ И ССЫЛКУ НА СОЗДАННЫЙ ЭЛЕМЕНТ
        CheckBox chbx = findViewById(R.id.checkBox);    // СОЗДАЕМ ПЕРЕМЕННУЮ И ССЫЛКУ НА СОЗДАННЫЙ ЭЛЕМЕНТ
        Button btn = findViewById(R.id.button);    // СОЗДАЕМ ПЕРЕМЕННУЮ И ССЫЛКУ НА СОЗДАННЫЙ ЭЛЕМЕНТ

           // СОЗДАЕМ СТРОКОВУЮ ПЕРЕМЕННУЮ ДЛЯ ХРАНЕНИЯ ВВОДИМЫХ ДАННЫХ



        btn.setOnClickListener(new View.OnClickListener() {   // СОЗДАЕМ СЛУШИТЕЛЯ (ДЕЙСТВИЕ ПРИ НАЖАТИИ)
            @Override
            public void onClick(View v) {
                String inputText = edittext.getText().toString();
                Toast.makeText(MainActivity.this,inputText, Toast.LENGTH_SHORT).show();   // СОХРАНЕННЫЙ ТЕКС ВЫВОДИМ ВСПЛЫВАЮЩИМ УВЕДОМЛЕНИЕМ
            }
        });


        chbx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {    // СОЗДАЕМ СЛУШИТЕЛЯ (ДЕЙСТВИЕ ПРИ НАЖАТИИ)(ГАЛОЧКА)
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    btn.setEnabled(true);
                }else{
                    btn.setEnabled(false);
                }
            }
        });


    }
}

//    android:checked="true"    В коде прописываем