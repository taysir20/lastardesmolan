package beans.model;
// Generated 01-dic-2018 11:35:44 by Hibernate Tools 5.3.6.Final

/**
 * RelacionCoctelPlat generated by hbm2java
 */
public class RelacionCoctelPlat implements java.io.Serializable {

	private Integer coctelPlatPk;
	private int coctelFk;
	private int platosFk;

	public RelacionCoctelPlat() {
	}

	public RelacionCoctelPlat(int coctelFk, int platosFk) {
		this.coctelFk = coctelFk;
		this.platosFk = platosFk;
	}

	public Integer getCoctelPlatPk() {
		return this.coctelPlatPk;
	}

	public void setCoctelPlatPk(Integer coctelPlatPk) {
		this.coctelPlatPk = coctelPlatPk;
	}

	public int getCoctelFk() {
		return this.coctelFk;
	}

	public void setCoctelFk(int coctelFk) {
		this.coctelFk = coctelFk;
	}

	public int getPlatosFk() {
		return this.platosFk;
	}

	public void setPlatosFk(int platosFk) {
		this.platosFk = platosFk;
	}

}
