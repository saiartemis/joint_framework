/**
 * 
 */
package com.mvc.test.service;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.mvc.rest.service.CarService;
import com.mvc.rest.util.EncryptUtils;

/**
 * @ClassName: ServiceTest
 * @Description: TODO
 * @author zhangxian
 * @createDate 2016年3月21日
 * @copyright: Copyright® 2016 POSTEL
 */
@ContextConfiguration(locations = { "classpath:spring-content.xml" })
public class ServiceTest extends AbstractTransactionalJUnit4SpringContextTests{
	@Resource(name="carService")
	private CarService carService;
	//@Test
	public void testCarService()
	{
		/*System.out.println("112");
		carService.saveCarService();*/
		carService.getCars().size();
	}
	
	public void testCarService2()
	{
		carService.getCars().size();
	}
	@Test
	public void testLogin()
	{
		Subject currentUser = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(
				"admin", EncryptUtils.encryptMD5("admin"));
		token.setRememberMe(true);
		try {
			currentUser.login(token);
		} catch (AuthenticationException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
