package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCliente;
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean especial;
    private String nombreDuenio;
    private String celularDuenio;
    private String observaciones;

    public Mascota(int idCliente, String nombre, String raza, String color, boolean alergico, boolean especial, String nombreDuenio, String celularDuenio, String observaciones) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.especial = especial;
        this.nombreDuenio = nombreDuenio;
        this.celularDuenio = celularDuenio;
        this.observaciones = observaciones;
    }

    public Mascota() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public boolean isEspecial() {
        return especial;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public String getCelularDuenio() {
        return celularDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mascota{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", raza=" + raza + '}';
    }
    
}
