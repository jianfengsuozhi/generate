package com.maosheng.demo1.dao;

import com.maosheng.demo.model.Scm_Brand;

public interface Scm_BrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(Scm_Brand record);

    int insertSelective(Scm_Brand record);

    Scm_Brand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(Scm_Brand record);

    int updateByPrimaryKey(Scm_Brand record);
}