/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Heber Gomez
 */
public class G20 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            
            // 1. Crear instancias de los ornitorrincos
            System.out.println("=== CREACION DE ORNITORRINCOS ===");
            // Datos para OrniVerde (con tu nombre)
            System.out.println("\nCreando OrniVerde):");
            OrniVerde orniVerde = new OrniVerde("Locaso", 25.0, 8.0, 6.8, 7.5);
            
            // Datos para OrniAzul Blue
            System.out.println("\nCreando OrniAzul Blue:");
            System.out.print("Ingrese propulsion para Blue (5-10 km/s): ");
            double propulsionBlue = scanner.nextDouble();
            OrniAzul blue = new OrniAzul("Blue", propulsionBlue, 25.0, 8.0);
            
            //(String nombre,double propulsion, double longitudCola, double velocidad) 
            // Datos para OrniAzul Blui
            System.out.println("\nCreando OrniAzul Blui:");
            System.out.print("Ingrese propulsion para Blui (5-10 km/s): ");
            double propulsionBlui = scanner.nextDouble();
            OrniAzul blui = new OrniAzul("Blui", propulsionBlui, 25.0, 8.0);
            
            // 2. Arreglo de tamaño 3
            Castor[] hermanosOrni = new Castor[3];
            try {
                hermanosOrni[0] = blue;
                hermanosOrni[1] = orniVerde; // ORNIVERDE EN POSICION 1 
                hermanosOrni[2] = blui;
                System.out.println("\n=== HABILIDADES DE LOS ORNITORRINCOS ===");
                // Ejecutar todas las habilidades de cada ornitorrinco
                for (int i = 0; i < hermanosOrni.length; i ++) {
                    System.out.println("\n--- " + getNombreOrni(hermanosOrni[i])
                        + " ---");
                    
                    // Habilidad de nado
                    hermanosOrni[i].nadar();
                    
                    // Habilidades musicales
                    if (hermanosOrni[i] instanceof OrniVerde) {
                        OrniVerde ov = (OrniVerde) hermanosOrni[i];
                        ov.tocarGuitorgan();
                    }
                    else if (hermanosOrni[i] instanceof OrniAzul) {
                        hermanosOrni[i].tocarGuitarra();
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(
                    "Error: Indice fuera de los limites del arreglo");
            } finally {
                System.out.println(
                    "\nlos ornitohermanos estan juntos al fin.....");
            }
            
            // 3. Pasar a List los 2 mejores nadadores (solo OrniAzul)
            List<OrniAzul> mejoresNadadores = new ArrayList<>();
            for (Castor orni : hermanosOrni) {
                if (orni instanceof OrniAzul) {
                    mejoresNadadores.add((OrniAzul) orni);
                }
            }
            
            // 4. Ordenar por propulsión de forma ascendente
            Collections.sort(mejoresNadadores, new Comparator<OrniAzul>() {
                @Override
                public int compare (OrniAzul o1, OrniAzul o2) {
                    return Double.
                        compare(o1.getPropulsion(), o2.getPropulsion());
                }
            });
            System.out.println(
                "\n=== MEJORES NADADORES ORDENADOS POR PROPULSION ===");
            Iterator<OrniAzul> iterator = mejoresNadadores.iterator();
            while (iterator.hasNext()) {
                OrniAzul nadador = iterator.next();
                System.out.println(nadador.getNombre() + " - Propulsion: "
                    + nadador.getPropulsion() + " km/s");
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    //METODO AUXILIAR PARA OBTENER EL NOMBRE DEL ORNITORRINCO
    private static String getNombreOrni (Castor orni) {
        if (orni instanceof OrniVerde) {
            return ((OrniVerde) orni).getNombre();
        }
        else if (orni instanceof OrniAzul) {
            return ((OrniAzul) orni).getNombre();
        }
        return "Ornitorrinco";
    }
}
