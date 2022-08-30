package com.example.mathservice;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomerController {
    private List<Customer> customers;

    public CustomerController() {
        this.customers = new ArrayList<Customer>();
        this.customers.add(new Customer("1000","First",10,true));
        this.customers.add(new Customer("1001","Mew",20,false));
        this.customers.add(new Customer("1002","New",16,false));
        this.customers.add(new Customer("1003","Step",25,true));
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customers;
    }

    @RequestMapping(value = "/customerbyid/{id}", method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable("id") String ID){
        for (int i =0;i<this.customers.size();i++){
            if (customers.get(i).getID().equals(ID)){
                return customers.get(i);
            }
        }
        return null;
    }

    @RequestMapping(value = "/customerbyname/{name}", method = RequestMethod.GET)
    public Customer getCustomerByName(@PathVariable("name") String n){
        for (int i =0;i<this.customers.size();i++){
            if (customers.get(i).getName().equals(n)){
                return customers.get(i);
            }
        }
        return null;
    }
    @RequestMapping(value = "/customerDelByid/{id}", method = RequestMethod.DELETE)
    public boolean delCustomerByID(@PathVariable("id") String ID){
        for (int i =0;i<this.customers.size();i++){
            if (customers.get(i).getID().equals(ID)){
                return customers.remove(customers.get(i));
            }
        }
        return false;
    }
    @RequestMapping(value = "/customerDelByname/{name}", method = RequestMethod.DELETE)
    public boolean delCustomerByName(@PathVariable("name") String name){
        for (int i =0;i<this.customers.size();i++){
            if (customers.get(i).getName().equals(name)){
                return customers.remove(customers.get(i));
            }
        }
        return false;
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("id") String ID,@RequestParam("name") String n,@RequestParam("sex") String s,@RequestParam("age") int a){
        boolean checkedSex = (s.equals("Male") || s.equals("male"));
        customers.add(new Customer(ID, n, a, checkedSex));
        return true;
    }

    @RequestMapping(value = "/addCustomer2", method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam("id") String ID,@RequestParam("name") String n,@RequestParam("sex") String s,@RequestParam("age") int a){
        boolean checkedSex = (s.equals("Male") || s.equals("male"));
        customers.add(new Customer(ID, n, a, checkedSex));
        return true;
    }
}
