package com.aseguradora.microbackpolizas.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aseguradora.microbackpolizas.beans.Poliza;
import com.aseguradora.microbackpolizas.beans.Tomador;
import com.aseguradora.microbackpolizas.beans.TomadorExample;
import com.aseguradora.microbackpolizas.mapper.CustomMapper;
import com.aseguradora.microbackpolizas.mapper.TomadorMapper;

@Repository
public class TomadorDAO {
		
	private static final String RESULTADO_OK = "OK";
	private static final String RESULTADO_KO = "KO";
	

	@Autowired private CustomMapper customMapper;

	public Tomador getTomadorByPoliza(Integer poliza) {
		Tomador tomador = new Tomador();
		
		try {
			tomador = customMapper.findTomadorByPoliza(poliza);

		} catch (Exception e) {
		}
		return 	tomador;
	}


	public Tomador updateTomador(Tomador tomador) {
		try {
		} catch (Exception e) {
		}
		return 	tomador;
	}
}
