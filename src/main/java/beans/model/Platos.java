package beans.model;
// Generated 01-dic-2018 11:35:44 by Hibernate Tools 5.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Platos generated by hbm2java
 */
public class Platos implements java.io.Serializable {

	private Integer platosPk;
	private String nombre;
	private String borrado;
	private Date fechaAlta;
	private Date fechaBaja;
	private int usuarioFk;
	private int tipoPlatoFk;
	private Set relacionPlatosIngredienteses = new HashSet(0);

	public Platos() {
	}

	public Platos(String nombre, String borrado, Date fechaAlta, int usuarioFk, int tipoPlatoFk) {
		this.nombre = nombre;
		this.borrado = borrado;
		this.fechaAlta = fechaAlta;
		this.usuarioFk = usuarioFk;
		this.tipoPlatoFk = tipoPlatoFk;
	}

	public Platos(String nombre, String borrado, Date fechaAlta, Date fechaBaja, int usuarioFk, int tipoPlatoFk,
			Set relacionPlatosIngredienteses) {
		this.nombre = nombre;
		this.borrado = borrado;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.usuarioFk = usuarioFk;
		this.tipoPlatoFk = tipoPlatoFk;
		this.relacionPlatosIngredienteses = relacionPlatosIngredienteses;
	}

	public Integer getPlatosPk() {
		return this.platosPk;
	}

	public void setPlatosPk(Integer platosPk) {
		this.platosPk = platosPk;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBorrado() {
		return this.borrado;
	}

	public void setBorrado(String borrado) {
		this.borrado = borrado;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public int getUsuarioFk() {
		return this.usuarioFk;
	}

	public void setUsuarioFk(int usuarioFk) {
		this.usuarioFk = usuarioFk;
	}

	public int getTipoPlatoFk() {
		return this.tipoPlatoFk;
	}

	public void setTipoPlatoFk(int tipoPlatoFk) {
		this.tipoPlatoFk = tipoPlatoFk;
	}

	public Set getRelacionPlatosIngredienteses() {
		return this.relacionPlatosIngredienteses;
	}

	public void setRelacionPlatosIngredienteses(Set relacionPlatosIngredienteses) {
		this.relacionPlatosIngredienteses = relacionPlatosIngredienteses;
	}

}
