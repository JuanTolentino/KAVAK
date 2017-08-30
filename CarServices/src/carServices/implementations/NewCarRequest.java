package carServices.implementations;

import carServices.domains.Car;
import carServices.domains.CarDetail;

public class NewCarRequest {
	
	private Car car;
	private CarDetail carDetail;

	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public CarDetail getCarDetail() {
		return carDetail;
	}

	public void setCarDetail(CarDetail carDetail) {
		this.carDetail = carDetail;
	}
	
}
