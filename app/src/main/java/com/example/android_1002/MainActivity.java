package com.example.android_1002;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TEG = "this is";
    ArrayList<Fruit> fruits = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        FruitAdapter adapter = new FruitAdapter(this, fruits);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        for(int i=0;i<25;i++) {
            fruits.add(new Fruit("Лимон", "Желтый весь", R.drawable.lemon));
            fruits.add(new Fruit("Киви", "Зеленый внутри", R.drawable.kiwi));
            fruits.add(new Fruit("Яблоко", "Красный снаружи", R.drawable.apple));
            fruits.add(new Fruit("Ананас", "Желтый внутри", R.drawable.pineapple));
        }
    }

    public void getToast(View view) {
        ConstraintLayout cv = (ConstraintLayout) view;
        TextView name = (TextView) cv.findViewById(R.id.text_name);
        Log.d(TEG, String.valueOf(name.getText()));
        switch (String.valueOf(name.getText())){
            case "Лимон":
                Toast.makeText(this,"Выбран элемент - Лимон", Toast.LENGTH_SHORT).show();
                break;
            case "Киви":
                Toast.makeText(this,"Выбран элемент - Киви", Toast.LENGTH_SHORT).show();
                break;
            case "Яблоко":
                Toast.makeText(this,"Выбран элемент - Яблоко", Toast.LENGTH_SHORT).show();
                break;
            case "Ананас":
                Toast.makeText(this,"Выбран элемент - Ананас", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"Элемент не выбран", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}



