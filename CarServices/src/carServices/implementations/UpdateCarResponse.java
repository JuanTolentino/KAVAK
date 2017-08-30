package carServices.implementations;

import carServices.domains.Car;
import carServices.domains.CarDetail;

public class UpdateCarResponse {
	
	private Car car;
	private CarDetail carDetail;
	private String mensaje;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
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
