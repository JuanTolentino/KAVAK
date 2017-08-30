package carServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import carServices.domains.Car;
import carServices.domains.CarDetail;


@Repository
public interface CarDetailRepository extends JpaRepository<CarDetail, Long>,
		JpaSpecificationExecutor<CarDetail> {

	@Query("SELECT carD FROM CarDetail carD WHERE carD.coAuto = ?1")
	CarDetail findCarDetailByCoAuto(String coAuto);

}

