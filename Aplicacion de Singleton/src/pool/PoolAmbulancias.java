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
public class PoolAmbulancias {
    private final int numeroAmbulancias;
    private static PoolAmbulancias instancia;
    private Ambulancia[] ambulancias;
    
    private PoolAmbulancias(){
        numeroAmbulancias = 5;
        ambulancias = new Ambulancia[numeroAmbulancias];
        
        for(int i=0; i<numeroAmbulancias; i++){
            ambulancias[i] = new Ambulancia(i+1);
        }
    }
    
    public static PoolAmbulancias getInstancia(){
        if(instancia == null){
            instancia = new PoolAmbulancias();
        }
        return instancia;
    }
    
    public Ambulancia getAmbulancia(){
        for(int i=0; i<numeroAmbulancias; i++){
            if(ambulancias[i].getEstado()){
                System.out.println("Asignando Ambulancia "+ambulancias[i].getNumero());
                ambulancias[i].setEstado(false);
                return ambulancias[i];
            }
        }
        
        return null;
    }
}
