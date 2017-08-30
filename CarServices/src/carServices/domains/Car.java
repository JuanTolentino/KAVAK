package carServices.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "autos")
public class Car {
	private String marca;
	private String modelo;
	private String anio;
	private String km;
	private String coAuto;
	private Long idAutos;
	private String color;
	
	@Id
	@Column(name = "id_autos")
	@SequenceGenerator(name = "carSeqId", sequenceName = "autos_id_autos_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carSeqId")
	public Long getIdAutos() {
		return idAutos;
	}
	public void setIdAutos(Long idAutos) {
		this.idAutos = idAutos;
	}
	
	@Column(name = "marca")
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Column(name = "modelo")
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Column(name = "anio")
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	@Column(name = "km")
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	
	@Column(name = "co_auto")
	public String getCoAuto() {
		return coAuto;
	}
	public void setCoAuto(String coAuto) {
		this.coAuto = coAuto;
	}
	
	@Column(name = "color")
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
