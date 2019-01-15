package com.bridgelabz.objectorientedprograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
    //////////////////////////
    private String date;
	private String transaction;
	private String time;
	public String getDate() {
		return date;
	}
	public void setDate(Date date2) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println();  
		   date=dtf.format(now);
		     
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}


}


