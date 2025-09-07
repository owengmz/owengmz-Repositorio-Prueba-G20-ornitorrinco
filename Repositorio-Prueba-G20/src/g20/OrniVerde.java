package grupo20_git.ornitorrincos;

import java.util.Scanner;

/**
 *
 * @author Federico Galan, Heber Gomez
 */
// Clase OrniVerde - Representa un ornitorrinco verde con habilidades musicales
public class OrniVerde extends Castor implements MamaPata {

    // Atributos principales del OrniVerde
    private String nombre;
    private double picoLongitud;
    private double patasLongitud;

    // Constructor de la clase
    public OrniVerde(String nombre, double picoLongitud, double patasLongitud, 
                     double longitudCola, double velocidad) {
        super(longitudCola, velocidad);
        this.nombre = nombre;
        this.picoLongitud = picoLongitud;
        this.patasLongitud = patasLongitud;
    }

    // Getter para obtener el nombre del OrniVerde
    public String getNombre() {
        return nombre;
    }

    @Override
    public void tocarOrgano() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Presiona Enter para tocar el órgano...");
        scanner.nextLine();
        System.out.println("♪ Do-Re-Mi-Fa-Sol-La-Le-Li-Lo-Lu ♪");
    }

    // Método que combina tocar guitarra y órgano
    public void tocarGuitorgan() {
        System.out.println(nombre + " está tocando el Guitorgan...");
        tocarGuitarra();
        tocarOrgano();
        System.out.println("¡Tocada finalizada, cuac cuac!");
    }
}

