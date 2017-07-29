package com.Transaction;

import java.util.Date;

/**
 * Created by Aniket on 7/27/2017.
 */
public class Transaction {
    int transId;
    double transAmount;
    Date transDate;

    public Transaction(int transId, double transAmount, Date transDate) {
        this.transId = transId;
        this.transAmount = transAmount;
        this.transDate = transDate;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public double getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction {");
        sb.append("transId=").append(transId);
        sb.append(", transAmount=").append(transAmount);
        sb.append(", transDate=").append(transDate);
        sb.append('}');
        return sb.toString();
    }
}
