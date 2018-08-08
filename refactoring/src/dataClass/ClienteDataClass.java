/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataClass;

/**
 *
 * @author Alex Macas
 */
public class ClienteDataClass {
    public String nombre;
    public String Apellido;
    public String direccion;

    public ClienteDataClass(String nombre, String Apellido, String direccion) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.direccion = direccion;
    }
}
class Empresa{
    public ClienteDataClass cliente;
    public String getNombre(){
        return cliente.nombre;
    }
}