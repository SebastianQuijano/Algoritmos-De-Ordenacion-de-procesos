/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RoundRobin;


import java.util.ArrayList;

/**
 *
 * @author Brownie
 */
public class MetodosRr {
    private ArrayList<ProcesoRr> arregloProcesos;
    private int tiempoTranscurrido;
    private ProcesoRr proceso;
    public int quantum;
    
    
    public MetodosRr (){
        arregloProcesos = new ArrayList();
        quantum = 4;
    }
    
    public void AgregarProceso(String nombre, int rafaga){
        getArregloProcesos().add(new ProcesoRr(nombre, rafaga));
    }
    
    public int getSizeArray(){
        return getArregloProcesos().size();
    }
    
    public ProcesoRr getProc(int index){
        return this.getArregloProcesos().get(index);
    }

    public void setQuantum(int quantum){
        this.quantum = quantum;
    }
    
    public int getQuantum(){
        return quantum;
    }
    /**
     * @return the arregloProcesos
     */
    public ArrayList<ProcesoRr> getArregloProcesos() {
        return arregloProcesos;
    }

    /**
     * @param arregloProcesos the arregloProcesos to set
     */
    public void setArregloProcesos(ArrayList<ProcesoRr> arregloProcesos) {
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
    public ProcesoRr getProceso() {
        return proceso;
    }

    /**
     * @param proceso the proceso to set
     */
    public void setProceso(ProcesoRr proceso) {
        this.proceso = proceso;
    }
    
    
    
}
