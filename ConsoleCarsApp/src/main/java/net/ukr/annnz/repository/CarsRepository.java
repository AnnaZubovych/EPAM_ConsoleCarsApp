package net.ukr.annnz.repository;

import net.ukr.annnz.entity.Car;


public class CarsRepository {
    private Car[] cars;

    public CarsRepository(Car[] cars) {
        this.cars = cars;
    }

    public Car findByCarId(Long carId) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public Car findByCarModel(String carModel) {
        for (Car car : cars) {
            if (car.getCarModel().equals(carModel)) {
                return car;
            }
        }
        return null;
    }

    public Car findByCarBrand(String carBrand) {
        for (Car car : cars) {
            if (car.getCarBrand().equals(carBrand)) {
                return car;
            }
        }
        return null;
    }

    public Car findByCarYear(Integer carYear) {
        for (Car car : cars) {
            if (car.getCarYear().equals(carYear)) {
                return car;
            }
        }
        return null;
    }

    public Car findByModelAndYear(String carModel, Integer carYear){
        for (Car car: cars) {
            if(car.getCarModel().equals(carModel)&&car.getCarYear().equals(carYear)){
                return car;
            }
        }
        return null;
    }

    public Car findByYearAndPrice(Integer carYear, Integer carPrice){
        for (Car car:cars) {
            if(car.getCarYear().equals(carYear)&&car.getCarPrice().equals(carPrice)){
                return car;
            }
        }
        return null;
    }


}
