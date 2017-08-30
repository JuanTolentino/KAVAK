package carServices.endPoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import carServices.implementations.CarServiceImplementation;
import carServices.implementations.DeleteCarRequest;
import carServices.implementations.DeleteCarResponse;
import carServices.implementations.GetCarRequest;
import carServices.implementations.GetCarResponse;
import carServices.implementations.NewCarRequest;
import carServices.implementations.NewCarResponse;
import carServices.implementations.UpdateCarRequest;
import carServices.implementations.UpdateCarResponse;

	@Controller
	@RequestMapping("/carService")
	public class CarService {
		
		@Autowired
		CarServiceImplementation carImplementation;
		
		@RequestMapping(value = "/newCar")
		public @ResponseBody NewCarResponse newCar(@RequestBody NewCarRequest newCarRequest) {
			return carImplementation.newCar(newCarRequest);
		}
		
		@RequestMapping(value = "/deleteCar")
		public @ResponseBody DeleteCarResponse deleteCar(@RequestBody DeleteCarRequest deleteCarRequest) {
			return carImplementation.deleteCar(deleteCarRequest);
		}
		
		@RequestMapping(value = "/updateCar")
		public @ResponseBody UpdateCarResponse updateCar(@RequestBody UpdateCarRequest updateCarRequest) {
			return carImplementation.updateCar(updateCarRequest);
		}
		
		@RequestMapping(value = "/getCar")
		public @ResponseBody GetCarResponse getCar(@RequestBody GetCarRequest getCarRequest) {
			return carImplementation.getCar(getCarRequest);
		}

		
	}
	

