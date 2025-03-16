package com.example.remidirecycle;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMakanan extends AppCompatActivity {


    Button btnkembali;
    TextView tvnamaMakananDetail;
    TextView tvhargaDetailMakanan;
    ImageView gbrDetailMakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);
        btnkembali = findViewById(R.id.btnKembali);
        tvnamaMakananDetail = findViewById(R.id.tvDetailnamaMakanan);
        tvhargaDetailMakanan = findViewById(R.id.tvDetailHargaMakanan);
        gbrDetailMakanan = findViewById(R.id.gbrDetailMakanan);
        Intent intent = getIntent();
        String namaMakanan = intent.getStringExtra("namaMakanan");
        String hargaMakanan = intent.getStringExtra("hargaMakanan");
        int gambarMakanan = intent.getIntExtra("gambarMakanan", 1);

      btnkembali.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent in = new Intent(DetailMakanan.this,MainActivity.class);
              startActivity(in);
          }
      });


        tvnamaMakananDetail.setText(namaMakanan);
        tvhargaDetailMakanan.setText(hargaMakanan);

        gbrDetailMakanan.setImageResource(gambarMakanan);
    }
}