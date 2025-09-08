/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g20;

import java.util.Scanner;

/**
 *
 * @author Nehuen
 */
public class OrniVerde extends Castor implements MamaPata {
    

    private String nombre;

    public OrniVerde(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println(nombre + " va a tocar el organo. presiona tecla para continuar");
        sc.nextLine(); //ESPERA QUE PRESIONE ENTER
        System.out.println("Do-Re-Mi");
        System.out.println("Fa-Sol-La-Si");
    }

    //METODO DE ORNIVERDE
    public void tocarGuitorgan() {
        System.out.println(nombre + " toca el Guitorgan");

        tocarGuitarra();

        tocarOrgano();

        System.out.println("cuac cuac ");
    }
}
