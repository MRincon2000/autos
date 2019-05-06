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
public class Empresa {
    private HashMap<String, Auto> autos;
 
public Empresa(){
    this.autos=new HashMap<>();
}
 public void registrar(Auto auto1){
     this.autos.put(auto1.getPlaca(), auto1);
 } 
 public HashMap listarAutos(){
     return this.autos;
 }
}
