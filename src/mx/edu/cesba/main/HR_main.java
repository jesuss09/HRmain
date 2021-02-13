
package mx.edu.cesba.main;


import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

/**
 *
 * @author jjesus
 */
public class HR_main{

    
    public static void main(String[] args){
        
        //creacion de objetos
        Employee e1 = new Employee (); // sintasix para crear un objeto en java
        Employee e2 = new Employee ();
        
        e1.id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de empleado"));
        e1.firstName = JOptionPane.showInputDialog("Ingrese el Nombre");
        e1.lastName = JOptionPane.showInputDialog("ingrese el apellido");
        e1.age = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        e1.email = JOptionPane.showInputDialog("ingrese el correo electronico");
        e1.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("ingese numero de telefono"));
        e1.salary = Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario"));
        e1.hiredate =  JOptionPane.showInputDialog("ingese la fecha de contrtatacion");
        
        
        e2.id = Integer.parseInt(JOptionPane.showInputDialog("ingreseel numero de empleado"));
        e2.firstName = JOptionPane.showInputDialog ("Ingrese  el Nombre");
        e2.lastName = JOptionPane.showInputDialog("ingrese el apellido");
        e2.age = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        e2.email = JOptionPane.showInputDialog("ingese el correo electronico");
        e2.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("ingese numero de telefono"));
        e2.salary = Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario"));
        e2.hiredate = JOptionPane.showInputDialog("ingrese la fecha de contratacion");
        
        e1.getDetails();
        System.out.println("------------------------");
        e2.getDetails();
        
       
    }
    
}
