package com.example.yoshinoya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        int sumItem = DataHolder.getInstance().getSumItem();
        Double totalPayment = DataHolder.getInstance().getTotalPayment();
        String format = String.format("Rp " + "%.2f", totalPayment);

        TextView textDate = findViewById(R.id.text_date);
        TextView textItem = findViewById(R.id.text_item);
        TextView textPrice = findViewById(R.id.text_price);

        if (sumItem != 0){
            Date d = new Date();
            SimpleDateFormat simpleDate =  new SimpleDateFormat("dd/MM/yyyy");
            String date = simpleDate.format(d);

            TextView textNoHistory = findViewById(R.id.text_no_history);
            LinearLayout textHistory = findViewById(R.id.text_history);

            textNoHistory.setVisibility(View.GONE);
            textHistory.setVisibility(View.VISIBLE);

            textDate.setText(date);
            textItem.setText("Item : " + sumItem + " pcs");
            textPrice.setText(format);
        }
    }
}