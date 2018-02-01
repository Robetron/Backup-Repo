package model;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Actor extends Person implements Serializable{
	
	private static final long serialVersionUID = 1670749130243255792L;
	
	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

}
