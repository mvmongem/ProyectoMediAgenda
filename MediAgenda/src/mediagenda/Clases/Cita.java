/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

/**
 *
 * @author aovar
 */
public class Cita {
    
    private int idCita;
    private Paciente paciente;
    private Especialista especialista;
    private String fecha;
    private String hora;
    private EstadoCita estado;
    private String motivo;
    
    public Cita(int idCita, Paciente paciente, Especialista especialista,String fecha, String hora, String motivo) {
        this.idCita = idCita;
        this.paciente = paciente;
        this.especialista = especialista;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = EstadoCita.Pendiente;
    }
    
    public int getIdCita() {
        return idCita;
    }
    
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Especialista getEspecialista() {
        return especialista;
    }
    
    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public EstadoCita getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public void agendarCita() {
        this.estado = EstadoCita.Pendiente;
        System.out.println("Cita agendada exitosamente. ID: " + this.idCita
                + " - Paciente: " +this.paciente.getNombre()
                + " - Especialista a cargo: " + this.especialista.getNombre()
                + " - Fecha: " + this.fecha + " " + this.hora   
                + " - Estado de la cita: " + this.estado);
    }
    
    public void cancelarCita() {
        this.estado = EstadoCita.Cancelado;
        System.out.println("Cita cancelada exitosamente. ID: " + this.idCita + " - Estado: " + this.estado);
    }
    
    @Override
    public String toString() {
        return " DATOS DE LA CITA \n"
                + "ID de la Cita: " + this.idCita + "\n"
                + "Paciente: " + this.paciente.getNombre() + "\n"
                + "Especialista a cargo: " + this.especialista.getNombre() + "\n"
                + "Fecha y Hora de la cita: " + this.fecha + " a las " + this.hora + "\n"
                + "Motivo: " + this.motivo + "\n"
                + "Estado actual: " + this.estado;
    }
    
}
