/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Consola {
    public Scanner sc;
    public String lugar;
    
    public Ambulancia ambulanciaUno;
    public Ambulancia ambulanciaDos;
    public Ambulancia ambulanciaTres;
    public Ambulancia ambulanciaCuatro;
    public Ambulancia ambulanciaCinco;
    public Ambulancia ambulanciaSeis;
    
    public PoolAmbulancias pool;
    
    public Consola(){
        sc = new Scanner(System.in);
        
        pool = PoolAmbulancias.getInstancia();
        
        System.out.println("Bienvenido al servicio de ambulancias");
        
        
    }
}

