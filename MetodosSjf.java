/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sjf;


import java.util.ArrayList;

/**
 *
 * @author Brownie
 */
public class MetodosSjf {
    private ArrayList<ProcesoSjf> arregloProcesos;
    private int tiempoTranscurrido;
    private ProcesoSjf proceso;
    
    
    public MetodosSjf (){
        arregloProcesos = new ArrayList();
    }
    
    
    public void Menorb(){
        int menorRafaga = 1000;
        int index = 0;
        
        for (int i = 0; i < arregloProcesos.size(); i++) {
            if (arregloProcesos.get(i).getRafaga()<menorRafaga) {
                menorRafaga = arregloProcesos.get(i).getRafaga();
                index = i;
            }
            arregloProcesos.add(arregloProcesos.get(i));
        }
    }
    public void Menor(){
        int rafagaMenor = 100000;
        ProcesoSjf menor = null;
        int indexMenor = 0;
        for (int i = 0; i < arregloProcesos.size(); i++) {
            if ((arregloProcesos.get(i).getRafaga()) < rafagaMenor) {
                rafagaMenor = arregloProcesos.get(i).getRafaga();
                menor = arregloProcesos.get(i);
                indexMenor = i;
            }
        }
        arregloProcesos.add(0, menor);
        arregloProcesos.remove(indexMenor+1);
    }
    
 
    
    public void AgregarProceso(String nombre, int rafaga){
        getArregloProcesos().add(new ProcesoSjf(nombre, rafaga));
    }
    
    public int getSizeArray(){
        return getArregloProcesos().size();
    }
    
    public ProcesoSjf getProc(int index){
        return this.getArregloProcesos().get(index);
    }

    /**
     * @return the arregloProcesos
     */
    public ArrayList<ProcesoSjf> getArregloProcesos() {
        return arregloProcesos;
    }

    /**
     * @param arregloProcesos the arregloProcesos to set
     */
    public void setArregloProcesos(ArrayList<ProcesoSjf> arregloProcesos) {
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
    public ProcesoSjf getProceso() {
        return proceso;
    }

    /**
     * @param proceso the proceso to set
     */
    public void setProceso(ProcesoSjf proceso) {
        this.proceso = proceso;
    }
    
    
    
}
