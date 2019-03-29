package net.ukr.annnz.service;

import net.ukr.annnz.entity.Car;
import net.ukr.annnz.repository.CarsRepository;

import java.time.LocalDateTime;


public class CarsService {
    int useYear;
    Integer carYear = LocalDateTime.now().getYear() - useYear;
    private CarsRepository carsRepository;

    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public Car findByCarId(Long carId) {
        return carsRepository.findByCarId(carId);
    }

    public Car findByCarModel(String carModel) {
        return carsRepository.findByCarModel(carModel);
    }

    public Car findByCarBrand(String carBrand) {
        return carsRepository.findByCarBrand(carBrand);
    }

    public Car findByCarYear(Integer carYear) {
        return carsRepository.findByCarYear(carYear);
    }

    public Car findByModelAndYear(String carModel, Integer carYear) {
        return carsRepository.findByModelAndYear(carModel, carYear);
    }

    public Car findByYearAndPrice(Integer carYear, Integer carPrice){
        return carsRepository.findByYearAndPrice(carYear,carPrice);
    }
}
