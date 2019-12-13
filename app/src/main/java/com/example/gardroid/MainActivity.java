package com.example.gardroid;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   /* private Button btn_move_intent;*/
    //private Button btn_buah_naga;
    private Button btn_cara_tanam;
    private Button btn_info_cuaca;
    private Button btn_farming_notes;
    private Button btn_tentang_kami;
    private Button btn_budidaya_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //BUTTON Fragment BUDIDAYA
        btn_budidaya_fragment =(Button)findViewById(R.id. btn_budidaya_fragment);
        btn_budidaya_fragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent budidayafragmentIntent = new Intent(MainActivity.this, BudidayaSayuran.class);
                startActivity(budidayafragmentIntent);
            }
        });

     /*
        //BUTTON BUAH NAGA
        btn_buah_naga =(Button)findViewById(R.id.btn_buah_naga);
        btn_buah_naga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent buahnagaIntent = new Intent(MainActivity.this, BuahNagaActivity.class);
                startActivity(buahnagaIntent);
            }
        });

   */     //BUTTON CARA TANAM = TANYA PAKAR
        btn_cara_tanam =(Button)findViewById(R.id.btn_cara_tanam);
        btn_cara_tanam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent caratanamIntent = new Intent(MainActivity.this, TanyaPakar.class);
                startActivity(caratanamIntent);
            }
        });

        //BUTTON INFO CUACA
        btn_info_cuaca =(Button)findViewById(R.id.btn_info_cuaca);
        btn_info_cuaca.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent infocuacaIntent = new Intent(MainActivity.this, InfoCuacaActivity.class);
                startActivity(infocuacaIntent);
            }
        });

        //BUTTON FARMING NOTES
        btn_farming_notes =(Button)findViewById(R.id.btn_farming_notes);
        btn_farming_notes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent farmingnotesIntent = new Intent(MainActivity.this, FarmingNotesActivity.class);
                startActivity(farmingnotesIntent);
            }
        });




        //BUTTON Tentang Kami
        btn_tentang_kami =(Button)findViewById(R.id.btn_tentang_kami);
        btn_tentang_kami.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent tentangkamiIntent = new Intent(MainActivity.this, TentangKamiActivity.class);
                startActivity(tentangkamiIntent);
            }
        });









    }
}

        /*//BUTTON UJI COBA
        btn_move_intent =(Button)findViewById(R.id.btn_move_intent);
        btn_move_intent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent ujicobaIntent = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(ujicobaIntent);
            }
        });*/