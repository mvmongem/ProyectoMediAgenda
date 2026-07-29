/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package especiesmarinas.Clases;

import especiesmarinas.Enumeradores.Clasificacion;

/**
 *
 * @author monge
 */
public class EspecieMarina {
    private int codigo;
    private String nombreCientifico;
    private String nombreComun;
    private double promedioLongitud;
    private Clasificacion clasificacion;

    public EspecieMarina() {
    }

    public EspecieMarina(int codigo, String nombreCientifico, String nombreComun, double promedioLongitud, Clasificacion clasificacion) {
        this.codigo = codigo;
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.promedioLongitud = promedioLongitud;
        this.clasificacion = clasificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public double getPromedioLongitud() {
        return promedioLongitud;
    }

    public void setPromedioLongitud(double promedioLongitud) {
        this.promedioLongitud = promedioLongitud;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo +"\n"+ "Nombre Cientifico: " + this.nombreCientifico + "\n"+" Nombre Común: " + this.nombreComun + "\n" +"Promedio de Longitud: " + this.promedioLongitud + "\n"+"Clasificacion: " + this.clasificacion;
    }
    
    
    
}
