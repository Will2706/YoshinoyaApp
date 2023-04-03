package com.example.yoshinoya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Intent intent = getIntent();
        int orderBB = intent.getIntExtra("OrderBB", 0);
        int orderCBB = intent.getIntExtra("OrderCBB", 0);
        int orderOBB = intent.getIntExtra("OrderOBB", 0);
        int orderCCK = intent.getIntExtra("OrderCCK", 0);
        int orderCB = intent.getIntExtra("OrderCB", 0);
        int orderCCB = intent.getIntExtra("OrderCCB", 0);

        if (orderBB != 0){
            TextView num = findViewById(R.id.num_BB);
            LinearLayout menu = findViewById(R.id.menu_BB);

            num.setText(orderBB + " pcs");
            menu.setVisibility(View.VISIBLE);

        }

        if (orderCBB != 0){
            TextView num = findViewById(R.id.num_CBB);
            LinearLayout menu = findViewById(R.id.menu_CBB);

            num.setText(orderCBB + " pcs");
            menu.setVisibility(View.VISIBLE);

        }

        if (orderOBB != 0){
            TextView num = findViewById(R.id.num_OBB);
            LinearLayout menu = findViewById(R.id.menu_OBB);

            num.setText(orderOBB + " pcs");
            menu.setVisibility(View.VISIBLE);

        }

        if (orderCCK != 0){
            TextView num = findViewById(R.id.num_CCK);
            LinearLayout menu = findViewById(R.id.menu_CCK);

            num.setText(orderCCK + " pcs");
            menu.setVisibility(View.VISIBLE);

        }

        if (orderCB != 0){
            TextView num = findViewById(R.id.num_CB);
            LinearLayout menu = findViewById(R.id.menu_CB);

            num.setText(orderCB + " pcs");
            menu.setVisibility(View.VISIBLE);

        }

        if (orderCCB != 0){
            TextView num = findViewById(R.id.num_CCB);
            LinearLayout menu = findViewById(R.id.menu_CCB);

            num.setText(orderCCB + " pcs");
            menu.setVisibility(View.VISIBLE);
        }


        int totalBB = orderBB * 9000;
        int totalCBB = orderCBB * 11000;
        int totalOBB = orderOBB * 10500;
        int totalCCK = orderCCK * 12900;
        int totalCB = orderCB * 9900;
        int totalCCB = orderCCB * 11900;

        int total = totalBB + totalCBB + totalOBB + totalCCK + totalCB + totalCCB;
        TextView showTotal = findViewById(R.id.total);
        showTotal.setText("Rp " + total + ".00");

        TextView showTotalPrice = findViewById(R.id.total_price);
        TextView showTax = findViewById(R.id.tax);
        TextView showTotalPayment = findViewById(R.id.total_payment);

        int totalPrice = total;
        double taxPrice = totalPrice * 0.11;
        String format1 = String.format("Rp " + "%.2f", taxPrice);
        double totalPayment = totalPrice + taxPrice;
        String format2 = String.format("Rp " + "%.2f", totalPayment);

        showTotalPrice.setText("Rp " + totalPrice + ".00");
        showTax.setText(format1);
        showTotalPayment.setText(format2);


        DataHolder.getInstance().setTotalPayment(totalPayment);


        LinearLayout btnCash = findViewById(R.id.btn_cash);
        LinearLayout btnVirtual = findViewById(R.id.btn_virtual);

        btnCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(PaymentActivity.this, CashierActivity.class);
                startActivity(intent1);
            }
        });

        btnVirtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(PaymentActivity.this, VirtualActivity.class);
                startActivity(intent1);
            }
        });

    }
}