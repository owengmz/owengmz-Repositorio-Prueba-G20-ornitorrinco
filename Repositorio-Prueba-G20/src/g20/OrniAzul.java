package g20;

/**
 *
 * @author Heber Gomez
 */
public class OrniAzul extends Castor{

    private double propulsion;
    private String nombre;

    public OrniAzul (String nombre, double propulsion, double longitudCola, double velocidad) {
        super(longitudCola, velocidad);
        this.nombre = nombre;
        if (propulsion < 5 || propulsion > 10) {
            this.propulsion = 10;
        }
        else {
            this.propulsion = propulsion;
        }
    }

    public double getPropulsion () {
        return propulsion;
    }

    @Override
    public void nadar () {
        double velocidadTotal = velocidad + propulsion;
        System.out.println(nombre + " nadando a " + velocidadTotal
            + " km/h (velocidad base: " + velocidad + " + propulsion: "
            + propulsion + ")");
    }

    public String getNombre () {
        return nombre;
    }
}
