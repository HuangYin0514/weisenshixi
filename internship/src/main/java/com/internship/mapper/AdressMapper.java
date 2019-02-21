package com.internship.mapper;

import com.internship.model.Adress;
import com.internship.model.AdressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdressMapper {
    int countByExample(AdressExample example);

    int deleteByExample(AdressExample example);

    int insert(Adress record);

    int insertSelective(Adress record);

    List<Adress> selectByExample(AdressExample example);

    int updateByExampleSelective(@Param("record") Adress record, @Param("example") AdressExample example);

    int updateByExample(@Param("record") Adress record, @Param("example") AdressExample example);
}