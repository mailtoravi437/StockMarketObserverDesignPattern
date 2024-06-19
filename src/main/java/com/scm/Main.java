package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        StockMarket stockMarket = new StockMarket();
        Observer mobileObserver = new MobileObserver(stockMarket);
        stockMarket.registerObserver(mobileObserver);

        stockMarket.setStockPrice("TATA Motors",1000);
    }
}