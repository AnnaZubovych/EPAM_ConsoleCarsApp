package net.ukr.annnz.ui;

import net.ukr.annnz.entity.Car;
import net.ukr.annnz.service.CarsService;

import java.util.Scanner;

public class ConsoleUI {

    private CarsService carsService;
    private Scanner sc;

    public ConsoleUI(CarsService carsService) {
        this.carsService = carsService;
        this.sc = new Scanner(System.in);
    }

    public void run() {
        int option = 0;
        boolean isSelected = false;

        while (!isSelected) {
            System.out.println("Please, choose an option:");
            System.out.println("1: To select cars by brands.");
            System.out.println("2: To select cars by models that were used some years.");
            System.out.println("3: To select cars by year and the price more expensive than some value.");
            option = sc.nextInt();

            if (option > 0) isSelected = true;

        }

        switch (option) {
            case 1:
                carsByBrand();
                break;
            case 2:
                carsByModelAndYear();
                break;
            case 3:
                carsByYearAndPrice();
                break;
            default:
                System.out.println("Please, select an option from presented!");

        }
    }

    private void carsByBrand() {
        System.out.println("Please, type a brand:");
        String carBrand = sc.next();
        Car car = carsService.findByCarBrand(carBrand);
        System.out.println(car);
    }

    private void carsByModelAndYear() {
        System.out.println("Please, type a model:");
        String carModel = sc.next();
        System.out.println("Please, type a year in use of the car:");
        int carYear = sc.nextInt();
        Car car = carsService.findByModelAndYear(carModel, carYear);
        System.out.println(car);
    }

    private void carsByYearAndPrice() {
        System.out.println("Please, type a year of the car:");
        int carYear = sc.nextInt();
        System.out.println("Please, type your price:");
        int carPrice = sc.nextInt();
        Car car = carsService.findByYearAndPrice(carYear, carPrice);
        System.out.println(car);
    }
}


