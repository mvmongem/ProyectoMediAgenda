/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

/**
 *
 * @author monge
 */
public class ExpedienteClinico {
    private int idExpediente;
    private Paciente paciente;
    private String enfermedades;
    private String antecedentes;
    private String observaciones;

    public ExpedienteClinico() {
    }

    public ExpedienteClinico(int idExpediente, Paciente paciente, String enfermedades, String antecedentes, String observaciones) {
        this.idExpediente = idExpediente;
        this.paciente = paciente;
        this.enfermedades = enfermedades;
        this.antecedentes = antecedentes;
        this.observaciones = observaciones;
    }

    public int getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Id del Expediente: " + this.idExpediente + "\n Paciente: " + this.paciente + "\n Enfermedades: " + this.enfermedades + "\n Antecedentes: " + this.antecedentes + "\n observaciones: " + this.observaciones + '}';
    }
     
    
}
