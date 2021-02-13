/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresorces;

import mx.edu.cesba.model.Employee;

/**
 *
 * @author jjesus
 */
public class Humanresorces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //creacion de objetos
        Employee e1 = new Employee (); // sintasix para crear un objeto en java
        Employee e2 = new Employee ();
        
        e1.id = 1;
        e1.firstName = "tiburcio";
        e1.lastName = "Smith";
        e1.age =  20;
        e1.email = "tiburcio.cesba.edu.mx";
        e1.phoneNumber = 123456709;
        e1.salary = 30000.25;
        e1.hiredate = "02-02-21";
        
        
        e2.id = 2;
        e2.firstName = ("Felipa");
        e2.lastName = "Perez";
        e2.age = 30;
        e2.email = "felipa.cesba.edu.mx";
        e2.phoneNumber = 256478987;
        e2.salary = 33000.33;
        e2.hiredate = "01-01-21";
        
        e1.getDetails();
        System.out.println("------------------------");
        e2.getDetails();
        
        
    }
    
}
