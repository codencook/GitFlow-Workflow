package com.Repositories;

import com.Customer.Customer;
import com.Customer.CustomerI;

import java.util.ArrayList;

/**
 * Created by Aniket on 7/29/2017.
 */
public class Customers implements CustomerI {

    ArrayList<Customer> custList = new ArrayList<Customer>();
    @Override
    public void AddNewCustomer(Customer custObj) {


    }
}
