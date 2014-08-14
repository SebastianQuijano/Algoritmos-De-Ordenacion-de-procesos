package Sjf;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brownie
 */
public class ProcesoSjf {
 
    private String nombre;
    private int rafaga;
    
    
    
    public ProcesoSjf(String nombre, int rafaga) {
        this.rafaga = rafaga;
        this. nombre = nombre;
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the rafaga
     */
    public int getRafaga() {
        return rafaga;
    }

    /**
     * @param rafaga the rafaga to set
     */
    public void setRafaga(int rafaga) {
        this.rafaga = rafaga;
    }
    
}

