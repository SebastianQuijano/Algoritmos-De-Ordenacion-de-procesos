/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Multinivel;


import java.util.ArrayList;

/**
 *
 * @author Brownie
 */
public class MetodosMn {
    private ArrayList<ProcesoMn> nivel1;
    private ArrayList<ProcesoMn> nivel2;
    private ArrayList<ProcesoMn> nivel3;
    private int tiempoTranscurrido;
    private ProcesoMn proceso;
    private int quantum;
    
    
    public MetodosMn (){
        nivel1 = new ArrayList();
        nivel2 = new ArrayList();
        nivel3 = new ArrayList();
        quantum = 4;
    }
    
    public void AgregarProceso1(String nombre, int rafaga, int prioridad){
    getNivel1().add(new ProcesoMn(nombre, rafaga, prioridad));
    }
    public void AgregarProceso2(String nombre, int rafaga, int prioridad){
    getNivel2().add(new ProcesoMn(nombre, rafaga, prioridad));
    }
    public void AgregarProceso3(String nombre, int rafaga, int prioridad){
    getNivel3().add(new ProcesoMn(nombre, rafaga, prioridad));
    }
    
    public int getSizeArray(){
        return getArregloProcesos().size();
    }
    
    public ProcesoMn getProc(int index){
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
    public ArrayList<ProcesoMn> getArregloProcesos() {
        return getNivel1();
    }

    /**
     * @param arregloProcesos the arregloProcesos to set
     */
    public void setArregloProcesos(ArrayList<ProcesoMn> arregloProcesos) {
        this.setNivel1(arregloProcesos);
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
    public ProcesoMn getProceso() {
        return proceso;
    }

    /**
     * @param proceso the proceso to set
     */
    public void setProceso(ProcesoMn proceso) {
        this.proceso = proceso;
    }

    /**
     * @return the nivel1
     */
    public ArrayList<ProcesoMn> getNivel1() {
        return nivel1;
    }

    /**
     * @param nivel1 the nivel1 to set
     */
    public void setNivel1(ArrayList<ProcesoMn> nivel1) {
        this.nivel1 = nivel1;
    }

    /**
     * @return the nivel2
     */
    public ArrayList<ProcesoMn> getNivel2() {
        return nivel2;
    }

    /**
     * @param nivel2 the nivel2 to set
     */
    public void setNivel2(ArrayList<ProcesoMn> nivel2) {
        this.nivel2 = nivel2;
    }

    /**
     * @return the nivel3
     */
    public ArrayList<ProcesoMn> getNivel3() {
        return nivel3;
    }

    /**
     * @param nivel3 the nivel3 to set
     */
    public void setNivel3(ArrayList<ProcesoMn> nivel3) {
        this.nivel3 = nivel3;
    }
    
    
    
}
