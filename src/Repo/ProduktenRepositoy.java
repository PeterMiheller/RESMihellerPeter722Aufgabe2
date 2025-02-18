package Repo;

import Modelle.Produkte;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProduktenRepositoy {
    Map<String, Produkte> data= new HashMap<>();

    /**
     * Creates a new object in the repository.
     *
     * @param obj The object to create.
     */
    public void add(Produkte obj) {
        data.put(obj.getName(), obj);
    }

    /**
     * Deletes an object from the repository by its ID.
     *
     * @param name The unique identifier of the object to delete.
     */
    public void remove(String name) {
        data.remove(name);
    }

    /**
     * Updates an existing object in the repository.
     *
     * @param obj The object to update.
     */
    public void update(Produkte obj) {
        data.replace(obj.getName(), obj);
    }

    /**
     * Retrieves an object from the repository by its ID.
     *
     * @param name The unique identifier of the object to retrieve.
     * @return The object with the specified ID, or null if not found.
     */
    public Produkte get(String name) {
        return data.get(name);
    }

    /**
     * Retrieves all objects from the repository.
     *
     * @return A list of all objects in the repository.
     */
    public List<Produkte> getAll(){
        return data.values().stream().toList();
    }
}
