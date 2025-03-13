package Controllers;



/**



import Models.Contacto;
import Services.Contacto;

public class ContactoController {
    
    public ContactoService contactoService;
    
    public ContactoController (){
        this.contactoService = new ContactoService();
    }
    
    public void InsertarContacto(Contacto nuevoContacto) {
        contactoService.CrearContacto(nuevoContacto);
    }
    
    public void MostrarDatosContacto(){
        contactoService.Imprimir();
    }
    public void EliminarRegistroContacto(int id){
        contactoService.EliminarContacto(id);
    }
    public void ModificarContacto(int idContac, int seleccion, String info,int edad){
        
        contactoService.ModificarContacto(idContac, seleccion, info,edad);
    }
    
    /** public ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }
    
    public void InsertarCliente(Cliente nuevoCliente){
        clienteService.CrearCliente(nuevoCliente);
    }
    
    public void MostrarDatosCliente(){
        clienteService.Imprimir();
    }
    
    public void EliminarRegistroCliente(int id){
        clienteService.EliminarCliente(id);
    }
    
    public void ModificarCliente(int id, int seleccion, String info,int edad){
        
        clienteService.ModificarCliente(id, seleccion, info,edad);
    }
   
    
}
 **/