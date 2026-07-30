/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

/**
 *
 * @author Steven
 */
public class Especialista {
    
    private int idEspecialista;
    private String nombre;
    private String especialidad;
    private String correo;

    public Especialista() {
    }

    public Especialista(int idEspecialista, String nombre, String especialidad, String correo) {
        this.idEspecialista = idEspecialista;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdEspecialista() {
        return idEspecialista;
    }

    public void setIdEspecialista(int idEspecialista) {
        this.idEspecialista = idEspecialista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "-- Especialista --\n"
                + "N. Especialista: " + this.idEspecialista + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Especialidad: " + this.especialidad + "\n"
                + "Correo: " + this.correo;
    }
    
    
    
}
