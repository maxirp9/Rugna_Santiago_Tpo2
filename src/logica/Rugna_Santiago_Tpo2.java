package logica;

import gui.Principal;
import logica.Controladora;
import logica.Mascota;
import persistencia.ControladoraPersistencia;

public class Rugna_Santiago_Tpo2 {

    public static void main(String[] args) {
        
        //ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
        Controladora control = new Controladora();
        Mascota m = new Mascota(0,"nombre", "raza", "color", false, false, "nombreDuenio", "celularDuenio","observaciones");
        
        //control.modificarMascota(m);
        //control.altaMascota(m);
        
        //System.out.println(control.traerMascotas());
        
        Principal principal = new Principal(control);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
    }
    
}
