/**
 * 
 */
package com.mvc.rest.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.mvc.rest.dao.CarDao;
import com.mvc.rest.entity.Car;

/**
 * @ClassName: CarService
 * @Description: TODO
 * @author zhangxian
 * @createDate 2016年3月21日
 * @copyright: Copyright® 2016 POSTEL
 */
@Service("carService")
public class CarService {
	@Resource(name = "carDao")
	private CarDao carDao;

	public void saveCarService() {
		Car car = new Car();
		car.setCarId("1211111");
		car.setBak("22");
		car.setCarNo("88989");
		car.setCarStatusId("1");
		car.setDriver("2");
		car.setUserId("11");
		carDao.insert(car);
		carDao.insert(car);
	}
	
	public List<Car> getCars()
	{
		return carDao.getCarList();
	}
}
