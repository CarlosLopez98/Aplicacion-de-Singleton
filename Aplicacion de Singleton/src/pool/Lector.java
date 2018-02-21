/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool;

import java.util.Scanner;

/**
 *
 * @author Juancho
 */
public class Lector {
    Scanner sc = new Scanner(System.in);
    
    public int leerint (String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }
    public String leerstring (String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }
}
