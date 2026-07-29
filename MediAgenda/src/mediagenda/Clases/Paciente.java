/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

/**
 *
 * @author monge
 */
public class Paciente {
    private int idPaciente;
    private String nombre;
    private String fechaNacimiento;
    private String cedula;
    private String correo;

    public Paciente() {
    }
    

    public Paciente(int idPaciente, String nombre, String fechaNacimiento, String cedula, String correo) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.correo = correo;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Paciente: " + this.idPaciente + "\n Nombre: " + this.nombre + "\n Fecha de Nacimiento: " + this.fechaNacimiento + "\n Cedula: " + this.cedula + "\n Correo: " + this.correo + '}';
    }
    
}
