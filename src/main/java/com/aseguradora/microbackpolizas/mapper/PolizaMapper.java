package com.aseguradora.microbackpolizas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.aseguradora.microbackpolizas.beans.Poliza;
import com.aseguradora.microbackpolizas.beans.PolizaExample;

@Mapper
public interface PolizaMapper {
	
    long countByExample(PolizaExample example);

    int deleteByExample(PolizaExample example);

    int deleteByPrimaryKey(Integer idpoliza);

    int insert(Poliza record);

    int insertSelective(Poliza record);

    List<Poliza> selectByExample(PolizaExample example);

    Poliza selectByPrimaryKey(Integer idpoliza);

    int updateByExampleSelective(@Param("record") Poliza record, @Param("example") PolizaExample example);

    int updateByExample(@Param("record") Poliza record, @Param("example") PolizaExample example);

    int updateByPrimaryKeySelective(Poliza record);

    int updateByPrimaryKey(Poliza record);
}