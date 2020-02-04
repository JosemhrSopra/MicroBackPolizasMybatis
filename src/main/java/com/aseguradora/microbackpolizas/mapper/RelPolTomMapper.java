package com.aseguradora.microbackpolizas.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.aseguradora.microbackpolizas.beans.RelPolTomExample;
import com.aseguradora.microbackpolizas.beans.RelPolTomKey;

public interface RelPolTomMapper {
    long countByExample(RelPolTomExample example);

    int deleteByExample(RelPolTomExample example);

    int deleteByPrimaryKey(RelPolTomKey key);

    int insert(RelPolTomKey record);

    int insertSelective(RelPolTomKey record);

    List<RelPolTomKey> selectByExample(RelPolTomExample example);

    int updateByExampleSelective(@Param("record") RelPolTomKey record, @Param("example") RelPolTomExample example);

    int updateByExample(@Param("record") RelPolTomKey record, @Param("example") RelPolTomExample example);
}