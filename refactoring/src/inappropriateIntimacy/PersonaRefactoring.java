/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inappropriateIntimacy;

/**
 *
 * @author Alex Macas
 */
public class PersonaRefactoring {
    private String name;
    private Telephone tele;
    public String getTelephone(){
        return tele.getTelephone();
    }
}
class Telephone{
    private String officeareaCode;
    private int officeNumber;
    private String numberTelephone;
    public String getTelephone(){
        return numberTelephone;
    }
}
