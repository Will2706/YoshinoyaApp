package com.example.yoshinoya;

public class DataHolder {
    private static final DataHolder instance = new DataHolder();

    public static DataHolder getInstance(){
        return instance;
    }

    private Double totalPayment;
    public Double getTotalPayment(){
        return totalPayment;
    }

    private int sumItem;
    public int getSumItem(){
        return sumItem;
    }

    public void setTotalPayment(Double totalPayment){
        this.totalPayment = totalPayment;
    }

    public void setSumItem(int sumItem){
        this.sumItem = sumItem;
    }

}
