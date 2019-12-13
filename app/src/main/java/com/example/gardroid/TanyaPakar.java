package com.example.gardroid;
/*HALAMAN TANYA PAKAR*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class TanyaPakar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanya_pakar);

    }

    //KIRIM PESAN
    public void kirimPesan (View view){

        //Nama
        EditText namapengirimField = (EditText)findViewById(R.id.editText_nama);
        String namapengirim = namapengirimField.getText().toString();
/*
        //Kota
        EditText namakotaField = (EditText)findViewById(R.id.editText_kota);
        String namakota = namakotaField.getText().toString();

        //Provinsi
        EditText namaprovinsiField = (EditText)findViewById(R.id.editText_provinsi);
        String namaprovinsi = namaprovinsiField.getText().toString();
*/
        //Pesan Tanya
        EditText pesantanyaField = (EditText)findViewById(R.id.editText_pesan);
        String pesantanya = pesantanyaField.getText().toString();



        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
        sendIntent.setData(Uri.parse("mailto: ike.devanti@gmail.com")); // only email apps should handle this
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "[Pesan dari aplikasi Gardroid] :" + namapengirim);
        sendIntent.putExtra(Intent.EXTRA_TEXT,  pesantanya);
       // sendIntent.setPackage("com.whatsapp");


        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }

    }


}