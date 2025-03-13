package Models;

import java.util.Date;

public class Campaña {
    private String nombreCampaña;
    private String descripcionCampaña;
    private String alcanceCampaña;
    private String statusCampaña;
    private Date fechainiCampaña;
    private Date fechafnlCampaña;
    
 public Campaña (String nombreCampaña, String descripcionCampaña, String alcanceCampaña, String statusCampaña, Date fechainiCampaña, Date fechafnlCampaña){
    
    this.nombreCampaña = nombreCampaña;
    this.descripcionCampaña = descripcionCampaña;
    this.alcanceCampaña = alcanceCampaña;
    this.statusCampaña = statusCampaña;
    this.fechainiCampaña = fechainiCampaña;
    this.fechafnlCampaña = fechafnlCampaña;
    
    }

    public String getNombreCampaña() {
        return nombreCampaña;
    }

    public void setNombreCampaña (String nombreCampaña) {
        this.nombreCampaña = nombreCampaña;
    }

    public String getDescripcionCampaña() {
        return descripcionCampaña;
    }

    public void setDescripcionCampaña (String descripcionCampaña) {
        this.descripcionCampaña = descripcionCampaña;
    }

    public String getAlcanceCampaña() {
        return alcanceCampaña;
    }

    public void setAlcanceCampaña (String alcanceCampaña) {
        this.alcanceCampaña = alcanceCampaña;
    }
   
    public String getStatusCampaña() {
        return statusCampaña;
    }

    public void setStatusCampaña (String statusCampaña) {
        this.statusCampaña = statusCampaña;
    }
    
    public Date getFechaIniCampaña() {
        return fechainiCampaña;
    }

    public void setFechaIniCampaña (Date fechainiCampaña) {
        this.fechainiCampaña = fechainiCampaña;
    }
    
    public Date getFechaFnlCampaña() {
        return fechafnlCampaña;
    }

    public void setFechaFnlCampaña (Date fechafnlCampaña) {
        this.fechafnlCampaña = fechafnlCampaña;
    }
    
}
