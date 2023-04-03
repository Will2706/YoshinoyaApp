package com.example.yoshinoya.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yoshinoya.DataHolder;
import com.example.yoshinoya.HistoryActivity;
import com.example.yoshinoya.PaymentActivity;
import com.example.yoshinoya.R;

public class ProductFragment extends Fragment {

    ImageView minButtonBB, plusButtonBB, minButtonCBB, plusButtonCBB, minButtonOBB, plusButtonOBB,
            minButtonCB, plusButtonCB, minButtonCCK, plusButtonCCK, minButtonCCB, plusButtonCCB;
    TextView sumBB, sumCBB, sumOBB, sumCB, sumCCK, sumCCB;
    Button btnOrder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_product, container, false);

        minButtonBB = v.findViewById(R.id.minButton_bb);
        plusButtonBB = v.findViewById(R.id.plusButton_bb);
        sumBB = v.findViewById(R.id.sum_bb);

        minButtonCBB = v.findViewById(R.id.minButton_cbb);
        plusButtonCBB = v.findViewById(R.id.plusButton_cbb);
        sumCBB = v.findViewById(R.id.sum_cbb);

        minButtonOBB = v.findViewById(R.id.minButton_obb);
        plusButtonOBB = v.findViewById(R.id.plusButton_obb);
        sumOBB = v.findViewById(R.id.sum_obb);

        minButtonCB = v.findViewById(R.id.minButton_cb);
        plusButtonCB = v.findViewById(R.id.plusButton_cb);
        sumCB = v.findViewById(R.id.sum_cb);

        minButtonCCK = v.findViewById(R.id.minButton_cck);
        plusButtonCCK = v.findViewById(R.id.plusButton_cck);
        sumCCK = v.findViewById(R.id.sum_cck);

        minButtonCCB = v.findViewById(R.id.minButton_ccb);
        plusButtonCCB = v.findViewById(R.id.plusButton_ccb);
        sumCCB = v.findViewById(R.id.sum_ccb);

        btnOrder = v.findViewById(R.id.btn_order);

        //Bowl

        minButtonBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumBB.getText().toString());
                if(num != 0){
                    num--;
                    sumBB.setText(Integer.toString(num));
                }
            }
        });

        plusButtonBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumBB.getText().toString());
                if(num < 10){
                    num++;
                    sumBB.setText(Integer.toString(num));
                }
            }
        });

        minButtonCBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumCBB.getText().toString());
                if(num != 0){
                    num--;
                    sumCBB.setText(Integer.toString(num));
                }
            }
        });

        plusButtonCBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumCBB.getText().toString());
                if(num < 10){
                    num++;
                    sumCBB.setText(Integer.toString(num));
                }
            }
        });

        minButtonOBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumOBB.getText().toString());
                if(num != 0){
                    num--;
                    sumOBB.setText(Integer.toString(num));
                }
            }
        });

        plusButtonOBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumOBB.getText().toString());
                if(num < 10){
                    num++;
                    sumOBB.setText(Integer.toString(num));
                }
            }
        });

        //Japanese Curry

        minButtonCCK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumCCK.getText().toString());
                if(num != 0){
                    num--;
                    sumCCK.setText(Integer.toString(num));
                }
            }
        });

        plusButtonCCK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumCCK.getText().toString());
                if(num < 10){
                    num++;
                    sumCCK.setText(Integer.toString(num));
                }
            }
        });

        minButtonCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumCB.getText().toString());
                if(num != 0){
                    num--;
                    sumCB.setText(Integer.toString(num));
                }
            }
        });

        plusButtonCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumCB.getText().toString());
                if(num < 10){
                    num++;
                    sumCB.setText(Integer.toString(num));
                }
            }
        });

        minButtonCCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumCCB.getText().toString());
                if(num != 0){
                    num--;
                    sumCCB.setText(Integer.toString(num));
                }
            }
        });

        plusButtonCCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(sumCCB.getText().toString());
                if(num < 10){
                    num++;
                    sumCCB.setText(Integer.toString(num));
                }
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int orderBB = Integer.parseInt(sumBB.getText().toString());
                int orderCBB = Integer.parseInt(sumCBB.getText().toString());
                int orderOBB = Integer.parseInt(sumOBB.getText().toString());
                int orderCCK = Integer.parseInt(sumCCK.getText().toString());
                int orderCB = Integer.parseInt(sumCB.getText().toString());
                int orderCCB = Integer.parseInt(sumCCB.getText().toString());

                if (orderBB != 0 || orderCBB != 0 || orderOBB != 0 || orderCCK != 0 || orderCB != 0 || orderCCB != 0){
                    Intent intent = new Intent(getActivity(), PaymentActivity.class);
                    intent.putExtra("OrderBB", orderBB);
                    intent.putExtra("OrderCBB", orderCBB);
                    intent.putExtra("OrderOBB", orderOBB);
                    intent.putExtra("OrderCCK", orderCCK);
                    intent.putExtra("OrderCB", orderCB);
                    intent.putExtra("OrderCCB", orderCCB);

                    int sumItem = orderBB + orderCBB + orderOBB + orderCCK + orderCB + orderCCB;
                    DataHolder.getInstance().setSumItem(sumItem);

                    startActivity(intent);
                }
            }
        });

        return v;
    }
}