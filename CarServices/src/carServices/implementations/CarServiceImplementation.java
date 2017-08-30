package carServices.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import carServices.domains.Car;
import carServices.domains.CarDetail;
import carServices.repositories.CarDetailRepository;
import carServices.repositories.CarRepository;
@Controller
public class CarServiceImplementation {
	
	@Autowired
	CarRepository carRepo;
	@Autowired
	CarDetailRepository carDetailRepo;
	
	public NewCarResponse newCar(NewCarRequest newCar){
		NewCarResponse response = new NewCarResponse();

		try{
			Car car = new Car();
			
			if(newCar.getCar() != null || newCar.getCarDetail() != null){
				if(newCar.getCar().getCoAuto().equals(newCar.getCarDetail().getCoAuto())){
					car = carRepo.findCarByCoAuto(newCar.getCar().getCoAuto());
					if(car == null){
						carRepo.save(newCar.getCar());
						carDetailRepo.save(newCar.getCarDetail());
						response.setMensaje("Auto insertado exitosamente");
					}else{
						response.setMensaje("Código de auto ya existe");
					}
				}else{
					response.setMensaje("Data Inconsistente, no existe relacion entre auto y auto detalle por el campo coAuto");
				}
			}else{
				response.setMensaje("Petición Imcompleta");
			}
		}catch (Exception e){
			response.setMensaje("Falló insertar auto");
		}

		return response;
	}
	
	public UpdateCarResponse updateCar(UpdateCarRequest updateCar){
		UpdateCarResponse response = new UpdateCarResponse();

		try{
			Car car = new Car();
			CarDetail carDetail = new CarDetail();
			
			if(updateCar.getCar() != null || updateCar.getCarDetail() != null){
				if(updateCar.getCar().getCoAuto().equals(updateCar.getCarDetail().getCoAuto())){
					car = carRepo.findCarByCoAuto(updateCar.getCar().getCoAuto());
					car.setColor(updateCar.getCar().getColor());
					car.setKm(updateCar.getCar().getKm());
					car.setMarca(updateCar.getCar().getMarca());
					car.setModelo(updateCar.getCar().getModelo());
					car.setAnio(updateCar.getCar().getAnio());
					carDetail = carDetailRepo.findCarDetailByCoAuto(updateCar.getCarDetail().getCoAuto());
					carDetail.setConsumo(updateCar.getCarDetail().getConsumo()); 
					carDetail.setMotor(updateCar.getCarDetail().getMotor());
					carDetail.setTipoCombustible(updateCar.getCarDetail().getTipoCombustible());
					carDetail.setTransmision(updateCar.getCarDetail().getTransmision());
						carRepo.save(car);
						carDetailRepo.save(carDetail);
						response.setCar(car);
						response.setCarDetail(carDetail);
						response.setMensaje("Auto modificado exitosamente");
				}else{
					response.setMensaje("Data Inconsistente, no existe relacion entre auto y auto detalle por el campo coAuto");
				}
			}else{
				response.setMensaje("Petición Imcompleta");
			}
		}catch (Exception e){
			response.setMensaje("Falló modificar auto");
		}

		return response;
	}
	
	
	
	public DeleteCarResponse deleteCar(DeleteCarRequest deleteCar){
		DeleteCarResponse response = new DeleteCarResponse();
		try{
			Car car = new Car();
			CarDetail carDetail = new CarDetail();	
			if(deleteCar.getCoAuto() != null){
					car = carRepo.findCarByCoAuto(deleteCar.getCoAuto());
					carDetail = carDetailRepo.findCarDetailByCoAuto(deleteCar.getCoAuto());
						carRepo.delete(car);
						carDetailRepo.delete(carDetail);
						response.setCar(car);
						response.setCarDetail(carDetail);
						response.setMensaje("Auto eliminado exitosamente");
				}else{
					response.setMensaje("Petición Imcompleta");
				}
		}catch (Exception e){
			response.setMensaje("Falló eliminar auto");
		}

		return response;
	}
	
	
	public GetCarResponse getCar(GetCarRequest getCar){
		GetCarResponse response = new GetCarResponse();
		try{
			Car car = new Car();
			CarDetail carDetail = new CarDetail();	
			if(getCar.getCoAuto() != null){
					car = carRepo.findCarByCoAuto(getCar.getCoAuto());
					carDetail = carDetailRepo.findCarDetailByCoAuto(getCar.getCoAuto());
						response.setCar(car);
						response.setCarDetail(carDetail);
						response.setMensaje("Auto consultado exitosamente");
				}else{
					response.setMensaje("Petición Imcompleta");
				}
		}catch (Exception e){
			response.setMensaje("Falló consultar auto");
		}

		return response;
	}
	
	
	
}
