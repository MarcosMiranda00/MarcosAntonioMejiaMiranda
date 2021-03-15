package com.marcos.negocio;

import com.marcos.entidades.Loguin;

public class clsLoguin {
	
	public int acceso(Loguin log) {				
		
		int acceso = 0;
		if(log.getUser().equals("marcos") && log.getPass().equals("123")) {
			
		acceso = 1;	
			
		}
		
		return acceso;
		
	}

}
