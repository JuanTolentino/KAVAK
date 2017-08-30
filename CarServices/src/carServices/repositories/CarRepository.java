package carServices.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import carServices.domains.Car;


@Repository
public interface CarRepository extends JpaRepository<Car, Long>,
		JpaSpecificationExecutor<Car> {

	@Query("SELECT car FROM Car car WHERE car.coAuto = ?1")
	Car findCarByCoAuto(String coAuto);

}

