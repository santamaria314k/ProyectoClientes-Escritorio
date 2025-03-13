package Models;


public class Contacto {
    private int idContac;
    private String nombresContac;
    private String apellidosContac;
    private String correoContac;
    private int telefonoContac;
    private String cargoContac;
    private String departamentoContac;
   

public Contacto (String nombresContac, String apellidosContac, String correoContac, int telefonoContac, String cargoContac, String departamentoContac){

    this.idContac = idContac;
    this.nombresContac = nombresContac;
    this.apellidosContac = apellidosContac;
    this.correoContac = correoContac;
    this.telefonoContac = telefonoContac;
    this.cargoContac = cargoContac;
    this.departamentoContac = departamentoContac;
}

    public int getIdContac() {
        return idContac;
    }

    public void setIdContac(int idContac) {
        this.idContac = idContac;
    }

    public String getNombresContac() {
        return nombresContac;
    }

    public void setNombresContac (String nombresContac) {
        this.nombresContac = nombresContac;
    }

    public String getApellidosContac() {
        return apellidosContac;
    }

    public void setApellidosContac (String apellidosContac) {
        this.apellidosContac = apellidosContac;
    }

    public String getCorreoContac() {
        return correoContac;
    }

    public void setCorreoContac(String correoContac) {
        this.correoContac = correoContac;
    }

    public int getTelefonoContac() {
        return telefonoContac;
    }

    public void setTelefonoContac(int telefonoContac) {
        this.telefonoContac = telefonoContac;
    }
    public String getCargoContac() {
        return cargoContac;
    }

    public void setCargoContac(String cargoContac) {
        this.cargoContac = cargoContac;
    }    
    public String getDepartamentoContac() {
        return departamentoContac;
    }

    public void setDepartamentoContac(String departamentoContac) {
        this.departamentoContac = departamentoContac;
    }    
    
}