package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class HumanBody {
	
	private Heart heart;
	
	

	
	//@Autowired
	public HumanBody(Heart heart) {
		super();
		this.heart = heart;
	}
	
	





	public Heart getHeart() {
		return heart;
	}






	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}


	public void Humanlive() {
		if(heart != null) {
			heart.HumanLive();
		}
	}
	
	

}
