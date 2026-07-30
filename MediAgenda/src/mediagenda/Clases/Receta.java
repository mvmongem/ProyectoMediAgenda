/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

/**
 *
 * @author Steven
 */
public class Receta {
    
    private int idReceta;
    private int idConsulta;
    private String medicamento;
    private String dosis;
    private String indicaciones;

    public Receta() {
    }

    public Receta(int idReceta, int idConsulta, String medicamento, String dosis, String indicaciones) {
        this.idReceta = idReceta;
        this.idConsulta = idConsulta;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    public String generarReceta(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "--- RECETA MEDICA ---\n"
                + "N. Receta: " + this.idReceta + "\n"
                + "N. Consulta: " + this.idConsulta + "\n"
                + "Medicamento: " + this.medicamento + "\n"
                + "Dosis: " + this.dosis + "\n"
                + "Indicaciones: " + this.indicaciones;
    }
    
    


    
}
