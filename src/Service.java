import Modelle.*;
import Repo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A service class that provides the business logic for the system.
 */
public class Service {
    private final CharakereRepository objectByIdRepo;
    private final ProduktenRepositoy objectByNameRepo;

    /**
     * Constructs a new Service with the given repositories.
     *
     * @param objectByIdRepo   The repository for objects that are determinate by unique identifier.
     * @param objectByNameRepo The repository for objects that are determinate by Name.
     */
    public Service(CharakereRepository objectByIdRepo, ProduktenRepositoy objectByNameRepo) {
        this.objectByIdRepo = objectByIdRepo;
        this.objectByNameRepo = objectByNameRepo;
    }

    /**
     * Adds a new object to the system.
     *
     * @param object The object to add.
     */
    public void addById(Charaktere object) {
        objectByIdRepo.add(object);
    }

    /**
     * Adds a new object to the system.
     *
     * @param object The object to add.
     */
    public void addByName(Produkte object) {
        objectByNameRepo.add(object);
    }

    /**
     * Deletes an object from the system.
     *
     * @param id The unique identifier of the object to delete.
     */
    public void removeByID(int id) {
        objectByIdRepo.remove(id);
    }

    /**
     * Deletes an object from the system.
     *
     * @param name The name of the object to delete.
     */
    public void removeByName(String name) {
        objectByNameRepo.remove(name);
    }

    /**
     * Displays an object by its unique identifier
     *
     * @param id The unique identifier of the object to display.
     */
    public void getObjectById(int id) {
        System.out.println(objectByIdRepo.get(id));
    }

    /**
     * Displays an object by its name
     *
     * @param name The name of the object to display.
     */
    public void getObjectByName(String name) {
        System.out.println(objectByNameRepo.get(name));
    }

    /**
     * Updates an existing object in the system.
     *
     * @param object The object with updated information.
     */
    public void updateObjectById(Charaktere object) {
        Charaktere existingObject = objectByIdRepo.get(object.getId());
        existingObject.setName(object.getName());
        existingObject.setOrt(object.getOrt());
        existingObject.setObjectList(object.getObjectList());
        objectByIdRepo.update(existingObject);
    }

    /**
     * Updates an existing object in the system.
     *
     * @param object The object with updated information.
     */
    public void updateObjectByName(Produkte object) {
        Produkte existingObject = objectByNameRepo.get(object.getName());
        existingObject.setName(object.getName());
        existingObject.setUniversum(object.getUniversum());
        existingObject.setPreis(object.getPreis());
        objectByNameRepo.update(existingObject);
    }

    /**
     * Retrieves a list of objects.
     *
     * @return A list of all available objects.
     */
    public List<Charaktere> getAllObjectsById() {
        return objectByIdRepo.getAll();
    }

    /**
     * Retrieves a list of objects.
     *
     * @return A list of all available objects.
     */
    public List<Produkte> getAllObjectsByName() {
        return objectByNameRepo.getAll();
    }

    /**
     * Retrieves all objects.
     */
    public void getAndShowAllObjectsById() {
        List<Charaktere> data = objectByIdRepo.getAll();
        for (Charaktere object : data) {
            System.out.println(object);
        }
    }

    /**
     * Retrieves all objects.
     */
    public void getAndShowAllObjectsByName() {
        List<Produkte> data = objectByNameRepo.getAll();
        for (Produkte object : data) {
            System.out.println(object);
        }
    }


    /**
     * Finds an object by its name.
     *
     * @param name The name of the object to find.
     * @return The object if found.
     */
    public Produkte findObjectByName(String name) {
        return objectByNameRepo.get(name);
    }

    /**
     * Finds an object by its id.
     *
     * @param id The id of the object to find.
     * @return The object if found.
     */
    public Charaktere findObjectById(int id) {
        return objectByIdRepo.get(id);
    }
}