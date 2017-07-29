package com.Customer;

/**
 * Created by Aniket on 7/27/2017.
 */
public class Customer{
    int custAccNo;
    String custName;
    double custBalance;

    public Customer(int custAccNo, String custName, double custBalance) {
        this.custAccNo = custAccNo;
        this.custName = custName;
        this.custBalance = custBalance;
    }

    public int getCustAccNo() {
        return custAccNo;
    }

    public void setCustAccNo(int custAccNo) {
        this.custAccNo = custAccNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public double getCustBalance() {
        return custBalance;
    }

    public void setCustBalance(double custBalance) {
        this.custBalance = custBalance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer {");
        sb.append("custAccNo=").append(custAccNo);
        sb.append(", custName='").append(custName).append('\'');
        sb.append(", custBalance=").append(custBalance);
        sb.append('}');
        return sb.toString();
    }

}
