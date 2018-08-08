/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatement;

/**
 *
 * @author Alex Macas
 */
public class CarSwitchStatement {
    //atributos correspondientes
    public double getSpeed(String type){
        switch(type){
            case "TOYOTA":
                return getbaseSpeed();
            case "NIZAN":
                return getbaseSpeed()-10;
            default:
                throw new RuntimeException("No exite dicho vehiculo");
        }
    }
    private double getbaseSpeed(){
        return 150;
    }
}
