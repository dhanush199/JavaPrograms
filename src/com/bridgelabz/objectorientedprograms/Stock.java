package com.bridgelabz.objectorientedprograms;

public class Stock {
    private String stockName;
    private double numberOfShare;
    private double sharePrice;

    public Stock() {
        stockName = null;
        numberOfShare = 0;
        sharePrice = 0.0;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(double numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

}


