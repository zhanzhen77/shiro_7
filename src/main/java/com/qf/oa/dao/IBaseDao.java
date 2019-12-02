package com.qf.oa.dao;

public interface IBaseDao<T> {
    int deleteByPrimaryKey(Long id);
    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
}
