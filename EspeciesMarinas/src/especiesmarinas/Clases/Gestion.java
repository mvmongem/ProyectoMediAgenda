/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package especiesmarinas.Clases;

import especiesmarinas.Enumeradores.Clasificacion;
import javax.swing.JOptionPane;

/**
 *
 * @author monge
 */
public class Gestion {
    public static EspecieMarina[] especies = new EspecieMarina[20];
    public static int contador =0;
    
    
    public static void mostrar() {
        if(contador == 0) {
            JOptionPane.showMessageDialog(null, "No hay elementos para mostrar");
            return;
        }
        
        String info = "Tipos de Especies Marinas: \n\n";
        for(int i =0; i < contador; i++) {
            info  += especies[i].toString();
            info += "\n";
            info += "--- --- --- --- ---";
            info += "\n";
        }
        
        JOptionPane.showMessageDialog(null, info);
    }
    
    
    public static void agregar() {
        if(contador < especies.length) {
            
            int codigo = contador+1;
            String cientifico = JOptionPane.showInputDialog("Nombre Cientifico: ");
            String comun = JOptionPane.showInputDialog("Nombre común");
            double longitud = Double.parseDouble(JOptionPane.showInputDialog("Promedio de Longitud: "));
            
            Clasificacion categorias[] = Clasificacion.values();    
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la clasificación", "Clasificación",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            categorias, categorias[0]);
            
            Clasificacion categoria = categorias[seleccion];
            especies[contador++] = new EspecieMarina(
                codigo,
                cientifico,
                comun,
                longitud,
                categoria);
            JOptionPane.showMessageDialog(null, "Ha sido agregado exitosamente!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad maxima de Especies Marinas alcanzada");
        }
    }
    
    public static void buscar() {
         String opciones[] = {"Código", "Nombre Científico"};
     
        int seleccion = JOptionPane.showOptionDialog(null, "Busqueda por", "Busqueda",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            opciones, opciones[0]);
        
        EspecieMarina encontrado  = null;
        if (seleccion==0){
            int codigoABuscar = Integer.parseInt(JOptionPane.showInputDialog("Codigo de la especie marina: "));
                
            for(int i = 0; i < contador; i++) {
            if(especies[i].getCodigo() == codigoABuscar) {
                encontrado = especies[i];
                break;   
            }   
        }
        
        if(encontrado != null) {
            JOptionPane.showMessageDialog(null, encontrado.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Especie Marina no encontrada");
        }
    }else {
            String nombre = JOptionPane.showInputDialog("Nombre cientifico de la especie: ");
            for(int i = 0; i < contador; i++) {
            if(especies[i].getNombreCientifico().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, especies[i]);
                break;
            }else{
            JOptionPane.showMessageDialog(null, "No se encontro la especie con este nombre");
                break;}
            }
        }
    }
    
    public static void editar() {
        EspecieMarina encontrado  = null;
        int codigoABuscar = Integer.parseInt(JOptionPane.showInputDialog("Codigo de especie Marina"));
        
        for(int i = 0; i < contador; i++) {
            if(especies[i].getCodigo() == codigoABuscar) {
                encontrado = especies[i];
               
                String menu[] = {"Nombre científico", "Nombre común","Promedio longitud","Clasificación"};
                int opcion = JOptionPane.showOptionDialog(null,"¿Qué desea modificar?","Editar",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,null,menu,menu[0]);
                switch(opcion){
                    case 0:
                        especies[i].setNombreCientifico(JOptionPane.showInputDialog("Nuevo Nombre: "));
                        break;
                    case 1:
                        especies[i].setNombreComun(JOptionPane.showInputDialog("Nuevo Nombre común: "));
                        break;
                    case 2:
                        especies[i].setPromedioLongitud(Double.parseDouble(JOptionPane.showInputDialog("Nueva Longitud: ")));
                        break;
                    case 3:
                        Clasificacion categorias[] = Clasificacion.values();    
                        int clas = JOptionPane.showOptionDialog(null, "Seleccione clasificación","Clasificación",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,null,categorias,categorias[0]);

                        especies[i].setClasificacion(categorias[clas]);
                        break;
                        
                        
                }
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
 
            }else{
                JOptionPane.showMessageDialog(null, "Codigo de la espcie no encontrada!");
            }
        }
        
    }
    
}
