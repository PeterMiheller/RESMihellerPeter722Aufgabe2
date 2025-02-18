package Modelle;

/**
 * Represents an object in the system.
 */

public class Produkte {
    private String name;
    private double preis;
    private String universum;

    /**
     * Constructs a new object with the specified details.
     *
     * @param name       The name of the object.
     * @param preis      The value of the object.
     * @param universum Time of the object
     */
    public Produkte(String name, double preis, String universum) {
        this.name = name;
        this.preis = preis;
        this.universum = universum;
    }

    /**
     * Gets the name of the object.
     *
     * @return The name of the object.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name for the object.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of the object.
     *
     * @return The value of the object.
     */
    public double getPreis() {
        return preis;
    }

    /**
     * Sets the value for the object.
     *
     * @param preis The value to set.
     */
    public void setPreis(int preis) {
        this.preis = preis;
    }

    /**
     * Gets the season of the object.
     *
     * @return The season of the object.
     */
    public String getUniversum() {
        return universum;
    }



    /**
     * Sets the sewason for the object.
     *
     * @param universum The season to set.
     */
    public void setUniversum(String universum) {
        this.universum = universum;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation.
     */
    @Override
    public String toString() {
        return "EntitityByName{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", universe='" + universum + '\'' +
                '}';
    }
}
