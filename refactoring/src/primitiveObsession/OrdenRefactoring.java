/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveObsession;

/**
 *
 * @author Alex Macas
 */
public class OrdenRefactoring {
    private Customer customer;
    private int cantidad;
    private double precio;
    public OrdenRefactoring(Customer customer){
        this.customer=customer;
    }
    public String getNameCustomer(){
        return customer.getName();
    }
}
