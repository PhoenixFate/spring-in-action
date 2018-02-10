package com.habuma.restfun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	Dessert dessert;
	@Bean
	@Conditional(MagicExistsConditon.class)
	public MagicBean magicBean(){
		return new MagicBean();
	}
	
	@Autowired
	@Qualifier("iceCream")
	public void setDessert(Dessert dessert){
		this.dessert=dessert;
	}
}
