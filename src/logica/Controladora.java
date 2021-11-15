
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void altaMascota(Mascota mascota){
        controlPersistencia.crearMascota(mascota);
    }
    
    public void bajaMascota(Mascota mascota){
        controlPersistencia.eliminarMascota(mascota);
    }
    
    public List<Mascota> traerMascotas(){
        return controlPersistencia.obtenerMascotas();
    }
    
    public void modificarMascota(Mascota mascota){
        controlPersistencia.modificarMascota(mascota);
    }
    
    public Mascota buscarMascota(Mascota mascota){
        return controlPersistencia.buscarMascota(mascota);
    }

    public void altaMascota(String nombre, String color,String raza,String obs,String nombreDuenio,String celDuenio,int especial, int alergico) {
        
        Mascota m = new Mascota();
        m.setNombre(nombre);
        m.setColor(color);       
        m.setRaza(raza);
        m.setCelularDuenio(celDuenio);
        m.setNombreDuenio(nombreDuenio);
        m.setObservaciones(obs);
        m.setAlergico(alergico != 0);
        m.setEspecial(especial != 0);
        
        controlPersistencia.crearMascota(m);
    }
}
