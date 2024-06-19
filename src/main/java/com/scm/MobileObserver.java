package com.scm;

public class MobileObserver implements Observer{
    StockInterface stockInterface;
    MobileObserver(StockInterface stockInterface){
        this.stockInterface = stockInterface;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("Stock "+stockSymbol+" Price "+stockPrice);
    }
}
