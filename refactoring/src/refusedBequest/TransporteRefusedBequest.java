/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refusedBequest;

/**
 *
 * @author Alex Macas
 */
public class TransporteRefusedBequest {
    public void drive(){}
}

class Car extends TransporteRefusedBequest{
    //llama al metodo drive para conducir el vehiculo
}
class Plane extends TransporteRefusedBequest{
    //aqui el metodo drive no serviria para que el plane despeque
}
