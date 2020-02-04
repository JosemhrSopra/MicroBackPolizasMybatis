package com.aseguradora.microbackpolizas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.aseguradora.microbackpolizas.beans.Tomador;
import com.aseguradora.microbackpolizas.beans.TomadorExample;

@Mapper
public interface TomadorMapper {
    long countByExample(TomadorExample example);

    int deleteByExample(TomadorExample example);

    int deleteByPrimaryKey(Integer idtomador);

    int insert(Tomador record);

    int insertSelective(Tomador record);

    List<Tomador> selectByExample(TomadorExample example);

    Tomador selectByPrimaryKey(Integer idtomador);

    int updateByExampleSelective(@Param("record") Tomador record, @Param("example") TomadorExample example);

    int updateByExample(@Param("record") Tomador record, @Param("example") TomadorExample example);

    int updateByPrimaryKeySelective(Tomador record);

    int updateByPrimaryKey(Tomador record);
}