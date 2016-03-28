package com.mvc.rest.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.googlecode.ehcache.annotations.TriggersRemove;
import com.mvc.rest.entity.Car;


public interface CarDao {
	int deleteByPrimaryKey(String id);
    int insert(Car record);
    int insertSelective(Car record);
    Car selectByPrimaryKey(String id);
    @TriggersRemove(cacheName="baseCache",removeAll=true)
    int updateByPrimaryKeySelective(Car record);
    int updateByPrimaryKey(Car record);
    @Cacheable(value="baseCache")  
    List<Car> getCarList();
}