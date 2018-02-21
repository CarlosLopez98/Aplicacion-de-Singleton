/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool;

/**
 *
 * @author Juancho
 */
public class Consola {
    boolean validar;
    int des;
    Lector l;
    PoolAmbulancias admin;
    public Consola() {
        validar=true;
        des=0;
        l = new Lector();
        admin = new PoolAmbulancias();
        arrancar();
    }
    
    public void arrancar(){
        while(validar){
            System.out.println("¿que desea hacer?");
            System.out.println("1. listar ambulancias");
            System.out.println("2. enviar una ambulancia");
            System.out.println("3. recibir una ambulancia");
            des=l.leerint("digite el numero correspondiente a su opcion");
            switch(des){
                case 1:
                    admin.listar(1);
                    break;
                case 2:
                    admin.enviar();
                    break;
                case 3:
                    admin.listar(3);
                    des=l.leerint("digite el numero de la ambulancia que desea recibir");
                    admin.recibir(des);
                    break;
            }
        }
    }
}

