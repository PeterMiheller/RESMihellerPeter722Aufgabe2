package Modelle;

import java.util.List;

public class Charaktere {
    private int id;
    private String name;
    private String ort;
    private List<Produkte> objectList;

    /**
     * Constructs a new object with the specified details.
     *
     * @param id           The unique identifier for the object.
     * @param name          The name of the object.
     * @param ort           The location of the object.
     * @param objectList             List of products.
     *
     */
    public Charaktere(int id, String name, String ort, List<Produkte> objectList) {
        this.id = id;
        this.name = name;
        this.ort = ort;
        this.objectList = objectList;
    }

    /**
     * Gets the unique identifier of the object.
     *
     * @return The id of the object.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the object.
     *
     * @param id The unique identifier to set.
     */
    public void setId(int id) {
        this.id = id;
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
     * Sets the name of the object.
     *
     * @param name The name of the object to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the location of the object.
     *
     * @return The name of the object.
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the location of the object.
     *
     * @param ort The location of the object to set.
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * Gets the list of the objects.
     *
     * @return The list of the objects.
     */
    public List<Produkte> getObjectList() {
        return objectList;
    }



/**
     * Sets the list of the objects.
     *
     * @param objectList The location of the object to set.
     */
public void setObjectList(List<Produkte> objectList) {
    this.objectList = objectList;
}

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation.
     */
    @Override
    public String toString() {
        return "EntityById{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ort='" + ort + '\'' +
                ", produkte=" + objectList +
                '}';
    }
}
