/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;

/**
 *
 * @author Estudiante
 */
   import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
    
    Empresa LosCoches=new Empresa();
    AutoCompacto a1= new AutoCompacto(5,1234,"renault",2012,23000000,"BOH 303");
    Vagoneta v1=new Vagoneta(8,4321,"Chevrolet",2014,45000000,"RCX 168");
 LosCoches.registrar(a1);
 LosCoches.registrar(v1);
  HashMap<String,Auto>autos=LosCoches.listarAutos();
  for(Auto auto:autos.values()){
      System.out.println(auto.placa);
      System.out.println(auto.marca);
  }
    
    }
}
