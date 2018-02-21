/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool;

/**
 *
 * @author Carlos
 */
public class Ambulancia {
    
    private int numero;
    private boolean estado;
    
    public Ambulancia(int n){
        numero = n;
        estado = true;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean e){
        estado = e;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int n){
        numero = n;
    }
}
