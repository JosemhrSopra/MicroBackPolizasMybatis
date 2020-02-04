package com.aseguradora.microbackpolizas.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aseguradora.microbackpolizas.beans.Poliza;
import com.aseguradora.microbackpolizas.beans.PolizaExample;
import com.aseguradora.microbackpolizas.mapper.CustomMapper;
import com.aseguradora.microbackpolizas.mapper.PolizaMapper;

@Repository
public class PolizaDAO {
		
	private static final String RESULTADO_OK = "OK";
	private static final String RESULTADO_KO = "KO";
	
	@Autowired private PolizaMapper polizaMapper;
	@Autowired private CustomMapper customMapper;

	public List<Poliza> getListPolizas() {
		List<Poliza> listPolizas = new ArrayList<>();
		
		try {
			
			listPolizas = customMapper.findAllPolizas();
			
		} catch (Exception e) {
		}
		
		return listPolizas;
	}

	public Poliza getPolizaById(Integer idPoliza) {
		Poliza poliza = new Poliza();
		
		try {
			poliza = polizaMapper.selectByPrimaryKey(idPoliza);
			
		} catch (Exception e) {
		}
		
		return poliza;
	}
}
