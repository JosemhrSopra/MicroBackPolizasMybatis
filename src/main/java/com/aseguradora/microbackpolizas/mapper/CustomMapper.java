package com.aseguradora.microbackpolizas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.aseguradora.microbackpolizas.beans.Poliza;
import com.aseguradora.microbackpolizas.beans.Tomador;

@Mapper
public interface CustomMapper {
	
	@Select("SELECT * FROM poliza.poliza")
	List<Poliza> findAllPolizas();
	
	List<Poliza> findAllPolizas2();
	
	Tomador findTomadorByPoliza(@Param("poliza") Integer poliza);
}