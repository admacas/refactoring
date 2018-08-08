/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateCode;

/**
 *
 * @author Alex Macas
 */
public class SendRefactoring {
    private double total;
    private boolean isValido(){return false;}
    private void send(){}
    public void calcular(double precio){
        if(isValido()){
           total=precio*0.36;
        }else{
            total=precio*0.56;
        }
        send();
    }
}
