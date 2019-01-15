package com.bridgelabz.objectorientedprograms;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	//private String time;
	
	public void setDate() {
		
		this.date = null;  
	}
	public String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println();  
		   date=dtf.format(now);
		   return date;
	}
	public String getTransaction() {
		transaction="Completed";
		return transaction;
	}
	public void setTransaction() {
		this.transaction = transaction;
	}


}


