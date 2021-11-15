package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    
    //metodo para alta
    public void crearMascota(Mascota mascota){
        try {
            mascotaJPA.create(mascota);
        } catch (Exception e) {
            System.out.println("No se pudo crear la mascota");
        }
        
    }
    
    //metodo para baja
    public void eliminarMascota(Mascota mascota){
        try {
            mascotaJPA.destroy(mascota.getIdCliente());
        } catch (NonexistentEntityException ex) {
            System.out.println("No se pudo eliminar la mascota");
        }
    }
    
    //metodo para lectura
    public List<Mascota> obtenerMascotas(){
        return mascotaJPA.findMascotaEntities();
    }
    
    //metodo para modificacion
    public void modificarMascota(Mascota mascota){
        try {
            mascotaJPA.edit(mascota);
        } catch (Exception ex) {
            System.out.println("No se puede editar");
        }
    }
    
    //metodo para busqueda
    public Mascota buscarMascota(Mascota mascota){
        return mascotaJPA.findMascota(mascota.getIdCliente());
    }
}
