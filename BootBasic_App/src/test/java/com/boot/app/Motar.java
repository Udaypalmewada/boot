package com.boot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motar{
	@Autowired
   private FuleTank fuletank;

	@Override
	public String toString() {
		return "Motar [fuletank=" + fuletank + "]";
	}


}
