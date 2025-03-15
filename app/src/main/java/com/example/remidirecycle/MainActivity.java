package com.example.remidirecycle;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements makananAdapter.OnItemClickListener {

    // Declare makananList at the class level
    private ArrayList<ModalMakanan> makananList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize the RecyclerView and set the LayoutManager
        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize makananList
        makananList = new ArrayList<>();

        // Add items to makananList
        makananList.add(new ModalMakanan("Nasi Goreng", "70000", "esteh", R.drawable.bakso));
        makananList.add(new ModalMakanan("Sate Ayam", "600000", "sirup", R.drawable.nasgor));
        makananList.add(new ModalMakanan("Bakso", "1000", "teh", R.drawable.miayam));
        makananList.add(new ModalMakanan("Mie Goreng", "120000", "sirup", R.drawable.bakso));

        // Create the adapter and pass the list
        makananAdapter adaptermakanan = new makananAdapter(makananList, this); // Pass the activity for the click listener
        recyclerView.setAdapter(adaptermakanan);
    }

    @Override
    public void onItemClick(ModalMakanan makananModel) {
        // Handle item click and show the name of the clicked food
        Toast.makeText(this, makananModel.getNamaMakanan(), Toast.LENGTH_SHORT).show();
    }
}
