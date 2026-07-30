/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

/**
 *
 * @author aovar
 */
public class Consulta {
    
    private int idConsulta;
    private Cita cita;
    private ExpedienteClinico expediente;
    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    
    public Consulta(int idConsulta, Cita cita, ExpedienteClinico expediente, String motivoConsulta, String diagnostico, String tratamiento) {
        this.idConsulta = idConsulta;
        this.cita = cita;
        this.expediente = expediente;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    
    public int getIdConsulta() {
        return idConsulta;
    }
    
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }
    
    public Cita getCita() {
        return cita;
    }
    
    public void setCita(Cita cita) {
        this.cita = cita;
    }
    
    public ExpedienteClinico getExpediente() {
        return expediente;
    }
    
    public void setExpediente(ExpedienteClinico expediente) {
        this.expediente = expediente;
    }
    
    public String getMotivoConsulta() {
        return motivoConsulta;
    }
    
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public String getTratamiento() {
        return tratamiento;
    }
    
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
    
    public void registrarConsulta() {
        this.cita.setEstado(EstadoCita.Atendido);
        System.out.println("Consulta registrada exitosamente. ID: " + this.idConsulta
                + " - ID de la Cita: " + this.cita.getIdCita()
                + " - Motivo: " + this.motivoConsulta
                + " - Diagnostico: " + this.diagnostico
                + " - Tratamiento: " + this.tratamiento);
    }
    
    
    @Override
    public String toString() {
        return " DETALLES DE LA CONSULTA \n"
                + "ID de la Consulta: " + this.idConsulta + "\n"
                + "ID de la Cita Asociada: " + this.cita.getIdCita() + "\n"
                + "Motivo: " + this.motivoConsulta + "\n"
                + "Diagnóstico: " + this.diagnostico + "\n"
                + "Tratamiento: " + this.tratamiento;
    }
    
}
