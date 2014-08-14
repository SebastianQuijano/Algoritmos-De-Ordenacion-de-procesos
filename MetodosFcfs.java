/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FCFS;

import java.util.ArrayList;

/**
 *
 * @author Brownie
 */
public class MetodosFcfs {
    private ArrayList<ProcesoFcfs> arregloProcesos;
    private int tiempoTranscurrido;
    private ProcesoFcfs proceso;
    
    
    public MetodosFcfs (){
        arregloProcesos = new ArrayList();
    }
    
    public void AgregarProceso(String nombre, int rafaga){
        getArregloProcesos().add(new ProcesoFcfs(nombre, rafaga));
    }
    
    public int getSizeArray(){
        return getArregloProcesos().size();
    }
    
    public ProcesoFcfs getProc(int index){
        return this.getArregloProcesos().get(index);
    }

    /**
     * @return the arregloProcesos
     */
    public ArrayList<ProcesoFcfs> getArregloProcesos() {
        return arregloProcesos;
    }

    /**
     * @param arregloProcesos the arregloProcesos to set
     */
    public void setArregloProcesos(ArrayList<ProcesoFcfs> arregloProcesos) {
        this.arregloProcesos = arregloProcesos;
    }

    /**
     * @return the tiempoTranscurrido
     */
    public int getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }

    /**
     * @param tiempoTranscurrido the tiempoTranscurrido to set
     */
    public void setTiempoTranscurrido(int tiempoTranscurrido) {
        this.tiempoTranscurrido = tiempoTranscurrido;
    }

    /**
     * @return the proceso
     */
    public ProcesoFcfs getProceso() {
        return proceso;
    }

    /**
     * @param proceso the proceso to set
     */
    public void setProceso(ProcesoFcfs proceso) {
        this.proceso = proceso;
    }
    
    
    
}
