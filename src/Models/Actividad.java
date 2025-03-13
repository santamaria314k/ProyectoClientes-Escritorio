package Models;

import java.util.Date;

public class Actividad {
    private String tituloAct;
    private String tipoAct;
    private String asignadoaAct;
    private String priorityAct;
    private String statusAct;
    private Date fechainiAct;
    private Date fechafnlAct;
 
    
 public Actividad (String tituloAct, String tipoAct, String asignadoaAct, String priorityAct, String statusAct, Date fechainiAct, Date fechafnlAct){
    this.tituloAct = tituloAct;
    this.tipoAct = tipoAct;
    this.asignadoaAct = asignadoaAct;
    this.priorityAct = priorityAct;
    this.statusAct = statusAct;
    this.fechainiAct = fechainiAct;
    this.fechafnlAct = fechafnlAct;
          
    }
 
    public String getTituloAct() {
        return tituloAct;
    }

    public void setTituloAct (String tituloAct) {
        this.tituloAct = tituloAct;
    }
    
    public String getTipoAct() {
        return tipoAct;
    }

    public void setTipoAct (String tipoAct) {
        this.tipoAct = tipoAct;
    }
    
    public String getAsignadoaAct() {
        return asignadoaAct;
    }

    public void setAsignadoaAct (String asignadoaAct) {
        this.asignadoaAct = asignadoaAct;
    }
    
    public String getPriorityAct() {
        return priorityAct;
    }

    public void setPriorityAct (String priorityAct) {
        this.priorityAct = priorityAct;
    }
    
    public String getStatusAct() {
        return statusAct;
    }

    public void setStatusAct (String statusAct) {
        this.statusAct = statusAct;
    }
    
    public Date getFechainiAct() {
        return fechainiAct;
    }

    public void setFechainiAct (Date fechainiAct) {
        this.fechainiAct = fechainiAct;
    }
    
    public Date getFechafnlAct() {
        return fechafnlAct;
    }

    public void setFechafnlAct (Date fechafnlAct) {
        this.fechafnlAct = fechafnlAct;
    }
 
}
