package com.driver;

import com.Customer.Customer;
import com.Transaction.Transaction;

import java.util.Date;

/**
 * Created by Aniket on 7/27/2017.
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println(" *** GitFlow Workflow Branching *** ");
        Customer custObj1=new Customer(111,"Jack",500.0);
        System.out.println(custObj1);
        Date todaysDate = new Date();
        Transaction transObj1=new Transaction(123456,1200,todaysDate);
        System.out.println(transObj1);


    }
}
