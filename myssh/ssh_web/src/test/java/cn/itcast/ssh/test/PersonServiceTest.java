package cn.itcast.ssh.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.ssh.domin.Person;
import cn.itcast.ssh.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonServiceTest {

	@Resource
	private PersonService personService;
	//0.0.1-SNAPSHOT
	@Test
	public void testName() throws Exception {
		System.out.println(personService);
		// class com.sun.proxy.$Proxy38 说明代理对象生成成功
		System.out.println(personService.getClass());
		
		// 测试
		List<Person> list = personService.findAll();
		System.out.println(list);
	}
}
