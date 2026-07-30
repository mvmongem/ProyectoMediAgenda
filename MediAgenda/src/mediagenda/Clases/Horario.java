/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

/**
 *
 * @author Steven
 */
public class Horario {
    
    private int idHorario;
    private Especialista especialista;
    private String diaSemana;
    private String horaInicio;
    private String horaFin;
    private boolean disponible;

    public Horario() {
    }

    public Horario(int idHorario, Especialista especialista, String diaSemana, String horaInicio, String horaFin, boolean disponible) {
        this.idHorario = idHorario;
        this.especialista = especialista;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    public String obtenerEstado(){
        if (this.disponible) {
            return "Disponible";
        }
        return "No disponible";
    }

    @Override
    public String toString() {
        return "--- HORARIO ---\n"
            + "N. Horario: " + this.idHorario + "\n"
            + "Especialista: " + this.especialista.getNombre() + "\n"
            + "Dia: " + this.diaSemana + "\n"
            + "Hora Inicio: " + this.horaInicio + "\n"
            + "Hora Fin: " + this.horaFin + "\n"
            + "Estado: " + obtenerEstado();
    }
    
    
    
}
