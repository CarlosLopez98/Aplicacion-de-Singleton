/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juancho
 */
public class PoolAmbulancias {
    private int min;
    private int max;
    List <Ambulancia> lista;
    
    public PoolAmbulancias() {

        min=1;
        max=10;
        lista = new ArrayList<>();
        for (int i = 0; i < min; i++) {
            lista.add(new Ambulancia(i+1));
        }
    }
    
    public void listar(int n){
        //System.out.println("pool.AdministradorPool.listar() "+lista.size());
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).isEstado() ){
                if(n==1 || n==2){
                     System.out.println("ambulancia "+lista.get(i).getId()+" disponible");
                }
            }else{
                if(n==1 || n==3){
                System.out.println("ambulancia "+lista.get(i).getId()+" ocupada");
                }
            }
        }
    }
    
    public void enviar(){
        boolean validar=false;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).isEstado()){
                lista.get(i).setEstado(false);
                System.out.println("se envio la ambulancia "+(i+1));
                validar=true;
                break;
            }
        }
        if(validar==false){
            if(lista.size()<max){
                crear();
                enviar();
            }else{
                System.out.println("no hay ambulancias disponibles");
            }
        }
       
    }
    public void crear(){
        lista.add(new Ambulancia(lista.size()+1));
    }
    
    public void recibir(int n){
        if(lista.get(n-1).isEstado()==false){
            lista.get(n-1).setEstado(true);
            System.out.println("ambulancia "+n+" recibida");
        }else{
            System.out.println("la ambulancia esta disponible, no se puede recibir");
        }
    }
    
}
