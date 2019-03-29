package net.ukr.annnz.entity;

public class Car {
    private final Long carId;
    private final String carModel;
    private final String carBrand;
    private final Integer carYear;
    private final String carColour;
    private final Integer carPrice;
    private final String carRegistersNumb;

    public Car(Long carId, String carModel, String carBrand, Integer carYear, String carColour, Integer carPrice, String carRegistersNumb) {
        this.carId = carId;
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.carYear = carYear;
        this.carColour = carColour;
        this.carPrice = carPrice;
        this.carRegistersNumb = carRegistersNumb;
    }

    public Long getCarId() {
        return carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public String getCarColour() {
        return carColour;
    }

    public Integer getCarPrice() {
        return carPrice;
    }

    public String getCarRegistersNumb() {
        return carRegistersNumb;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carModel='" + carModel + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carYear=" + carYear +
                ", carColour='" + carColour + '\'' +
                ", carPrice=" + carPrice +
                ", carRegistersNumb=" + carRegistersNumb +
                '}';
    }
}
