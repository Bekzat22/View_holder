package com.example.view_holder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
//Дз 3:
//        Тема - RecyclerView
//        1. В первом фрагменте создать EditText для пароля(пароль задаете в коде) и кнопку
//        2. При нажатии на кнопку, если пароль верный {
//        то переходить во второй фрагмент, где будет - RecyclerView
//        } если не верный {
//        то выдавать ошибку в EditText или показать toast
//        }
//        3. Заполнить RecyclerView любыми данными(например - футбол, фильмы, книги, картинки т.д.)
//        Deadline: (11.03.23г) до 23:59.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}