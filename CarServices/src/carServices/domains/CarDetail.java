package carServices.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "autos_detalle")
public class CarDetail {
	private String coDetalle;
	private String motor;
	private String transmision;
	private String coAuto;
	private Long idDetalle;
	private String consumo;
	private String tipoCombustible;

	
	@Id
	@Column(name = "id_detalle")
	@SequenceGenerator(name = "carSeqId", sequenceName = "autos_detalle_id_detalle_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carSeqId")
	public Long getIdDetalle() {
		return idDetalle;
	}
	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}
	
	@Column(name = "co_detalle")
	public String getCoDetalle() {
		return coDetalle;
	}
	public void setCoDetalle(String coDetalle) {
		this.coDetalle = coDetalle;
	}
	
	@Column(name = "motor")
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	@Column(name = "transmision")
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	
	@Column(name = "co_auto")
	public String getCoAuto() {
		return coAuto;
	}
	public void setCoAuto(String coAuto) {
		this.coAuto = coAuto;
	}

	@Column(name = "consumo")
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	
	@Column(name = "tipo_combustible")
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

}
