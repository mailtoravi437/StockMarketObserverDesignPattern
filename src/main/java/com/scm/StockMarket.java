package com.scm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket implements StockInterface{
    Map<String,Double> stockPriceMap;
    List<Observer> observerList;

    StockMarket(){
        this.stockPriceMap = new HashMap<>();
        this.observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void setStockPrice(String stockSymbol,double price){
        stockPriceMap.put(stockSymbol,price);
        notifyAll(stockSymbol,price);
    }

    @Override
    public void notifyAll(String stockSymbol, double stockPrice) {
        for(Observer observer : observerList){
            observer.update(stockSymbol,stockPrice);
        }
    }
}
