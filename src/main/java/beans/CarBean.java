package beans;


import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
public class CarBean {

	@Autowired
	CarDao carDao;
	private String ejem="hola";

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	public List<String> fetchCarDetails() {

		return carDao.getCarDetails();
	}

	public String getEjem() {
		return ejem;
	}

	public void setEjem(String ejem) {
		this.ejem = ejem;
	}
	
	

}
