package com.scm;

public interface StockInterface {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAll(String stockSymbol,double stockPrice);
}
