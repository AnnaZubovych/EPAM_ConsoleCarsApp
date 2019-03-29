package net.ukr.annnz;

import net.ukr.annnz.entity.Car;
import net.ukr.annnz.repository.CarsRepository;
import net.ukr.annnz.service.CarsService;
import net.ukr.annnz.ui.ConsoleUI;

public class ConsoleCarsApp {
    public static void main(String[] args) {
        Car[] cars = new Car[8];
        cars[0] = new Car(11L, "LEXUS", "NX200", 2017, "BLACK", 14500,
                "AA5209BC");
        cars[1] = new Car(12L, "LEXUS", "IS300", 2019, "WHITE", 18000,
                "AA8754DC");
        cars[2] = new Car(13L, "MERCEDES-BENZ", "AMG GT", 2015, "ORANGE",
                16000, "AA8956YT");
        cars[3] = new Car(14L, "MERCEDES-BENZ", "SL", 2018, "GREY",
                16500, "AA1245NS");
        cars[4] = new Car(14L, "FERRARI", "F8TRIBUTO", 2016, "RED",
                22000, "AA8585LO");
        cars[5] = new Car(14L, "FERRARI", "GTC4LUSSO", 2016, "GREEN",
                20500, "AA5555MN");
        cars[6] = new Car(14L, "FIAT", "ABARTH500", 2017, "PURPLE",
                15000, "AA4725PR");
        cars[7] = new Car(14L, "FIAT", "500X", 2019, "BLUE", 14000,
                "AA5489OI");

        CarsRepository repository = new CarsRepository(cars);
        CarsService service = new CarsService(repository);
        ConsoleUI ui = new ConsoleUI(service);

        ui.run();

    }
}
