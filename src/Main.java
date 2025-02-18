//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import Modelle.Charaktere;
import Modelle.Produkte;
import Repo.CharakereRepository;
import Repo.ProduktenRepositoy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharakereRepository charaktere = new CharakereRepository();
        ProduktenRepositoy produkte = new ProduktenRepositoy();

        Produkte p1 = new Produkte("Mjolnir", 500.0, "Asgard");
        produkte.add(p1);
        Produkte p2 = new Produkte("Vibranium-Schild", 700.0, "Wakanda");
        produkte.add(p2);
        Produkte p3 = new Produkte("Infinity Gauntlet", 10000.0, "Titan");
        produkte.add(p3);
        Produkte p4 = new Produkte("Web-Shooter", 250.0, "Terra");
        produkte.add(p4);
        Produkte p5 = new Produkte("Arc-Reaktor", 1500.0, "Terra");
        produkte.add(p5);
        Produkte p6 = new Produkte("Norn Stones", 1200.0, "Asgard");
        produkte.add(p6);
        Produkte p7 = new Produkte("Quantum Suit", 3000.0, "Terra");
        produkte.add(p7);
        Produkte p8 = new Produkte("X-Gene Serum", 850.0, "X-Mansion");
        produkte.add(p8);
        Produkte p9 = new Produkte("Cosmic Cube", 9000.0, "Multiverse");
        produkte.add(p9);
        Produkte p10 = new Produkte("Darkhold", 2000.0, "Multiverse");
        produkte.add(p10);


        Charaktere c1 = new Charaktere(1, "Thor", "Asgard",new ArrayList<> (Arrays.asList(p1,p6,p10)));


        Charaktere c2 = new Charaktere(2, "Black Panther", "Wakanda",new ArrayList<> (Arrays.asList(p2,p8)));


        Charaktere c3 = new Charaktere(3, "Iron Man", "Terra",new ArrayList<> (Arrays.asList(p5,p7,p4)));


        Charaktere c4 = new Charaktere(4, "Spider-Man", "Terra", new ArrayList<> (Arrays.asList(p4,p9)));

        Charaktere c5 = new Charaktere(5, "Doctor Strange", "Multiverse",new ArrayList<> (Arrays.asList(p10,p9,p3)));


        charaktere.add(c1);
        charaktere.add(c2);
        charaktere.add(c3);
        charaktere.add(c4);
        charaktere.add(c5);

        Service service = new Service(charaktere, produkte);
        UI ui = new UI(service);
        ui.start();
    }
}