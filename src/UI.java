

import Modelle.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The main console application class that provides a command-line interface for interacting with the system.
 */
public class UI {
    private final Service service;
    /**
     * Constructs a new UI with the given Service.
     *
     * @param service The controller that handles the business logic for the system.
     */
    public UI(Service service) {
        this.service = service;
    }

    /**
     * Starts the console application, displaying a menu and handling user input.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.print("""
                    Select an option:

                    1. Add Caracter
                    2. Remove Caracter
                    3. Get Caracter by Id
                    4. Update Caracter
                    5. Get all Caracter
                    6. Add Product
                    7. Remove Product
                    8. Get Product by Name
                    9. Update Product
                    10. Get all Product
                    11. Filter Characters nach Region
                    12. Filter Characters nach Produkt gekauft in ein Region
                    13. Sort Produkte von Charactere

                    0. Exit
                    """);

            String option = scanner.nextLine();

            switch (option) {
                case "0":
                    continueLoop = false;
                    break;
                case "1":
                    service.addById(addEntityById(scanner));
                    break;
                case "2":
                    service.removeByID(readObjectId(scanner));
                    break;
                case "3":
                    service.getObjectById(readObjectId(scanner));
                    break;
                case "4":
                    service.updateObjectById(updateEntityById(scanner));
                    break;
                case "5":
                    service.getAndShowAllObjectsById();
                    break;
                case "6":
                    service.addByName(addEntityByName(scanner));
                    break;
                case "7":
                    service.removeByName(readObjectName(scanner));
                    break;
                case "8":
                    service.getObjectByName(readObjectName(scanner));
                    break;
                case "9":
                    service.updateObjectByName(updateObjectBName(scanner));
                    break;
                case "10":
                    service.getAndShowAllObjectsByName();
                    break;
                case "11":
                    service.filterObjectByGivenCriteria(scanner.nextLine());
                    break;
                case "12":
                    service.viewObjectsByGivenCriteria(scanner.nextLine());
                    break;
                case "13":
                    Charaktere object = service.findObjectById(readObjectId(scanner));
                    service.sortProducts(object,readSorter(scanner));
                    break;




                default:
            }
        }
    }
    /**
     * Creates a new object by collecting details from user input.
     *
     * @param scanner The Scanner object used to read user input.
     * @return A new object populated with the provided data.
     */
    public Charaktere addEntityById(Scanner scanner){
        int id = readObjectId(scanner);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the region: ");
        String ort = scanner.nextLine();
        List<Produkte> data = new ArrayList<>();
        while (true){
            System.out.println("Enter the list elements: ");
            String object = scanner.nextLine();
            if(object.isEmpty()){
                break;
            }
            else {
                data.add(service.findObjectByName(object));
            }
        }
        return new Charaktere(id,name,ort,data);

    }
    /**
     * Updates an existing object by collecting updated details from user input.
     *
     * @param scanner The Scanner object used to read user input.
     * @return An updated object instance populated with the new data.
     */
    public Charaktere updateEntityById(Scanner scanner) {
        int id = readObjectId(scanner);
        System.out.println("Enter the new  name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the new  region: ");
        String ort = scanner.nextLine();
        List<Produkte> data = new ArrayList<>();
        while (true) {
            System.out.println("Enter new list of objects (leave empty to finish): ");
            String object = scanner.nextLine();
            if (object.isEmpty()) {
                break;
            } else {
                data.add(service.findObjectByName(object));
            }
        }
        return new Charaktere(id, name, ort, data);
    }
    /**
     * Creates a new object by collecting details from user input.
     *
     * @param scanner The Scanner object used to read user input.
     * @return A new object instance populated with the provided data.
     */
    public Produkte addEntityByName(Scanner scanner) {
        String name = readObjectName(scanner);
        System.out.println("Enter object preis: ");
        int preis = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter object universe: ");
        String universe = scanner.nextLine();
        return new Produkte(name,preis,universe);
    }
    /**
     * Updates an existing object by collecting updated details from user input.
     *
     * @param scanner The Scanner object used to read user input.
     * @return An updated Produkt instance populated with the new data.
     */
    public Produkte updateObjectBName(Scanner scanner) {
        String name = readObjectName(scanner);
        System.out.println("Enter new object preis: ");
        int preis = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new object universe: ");
        String universe = scanner.nextLine();
        return new Produkte(name, preis, universe);
    }

    /**
     * Reads an object sorter type from the user input.
     *
     * @param scanner The Scanner object used to read user input.
     * @return The object sorter type entered by the user.
     */
    public String readSorter(Scanner scanner){
        System.out.println("Enter aufsteigend oder absteigend: ");
        return scanner.nextLine();
    }
    /**
     * Reads an object ID from the user input.
     *
     * @param scanner The Scanner object used to read user input.
     * @return The object ID entered by the user.
     */
    public Integer readObjectId(Scanner scanner) {
        System.out.println("Enter object id: ");
        return Integer.parseInt(scanner.nextLine());
    }
    /**
     * Reads an object name from the user input.
     *
     * @param scanner The Scanner object used to read user input.
     * @return The object name entered by the user.
     */
    public String readObjectName(Scanner scanner) {
        System.out.println("Enter object name: ");
        return scanner.nextLine();
    }
}
