package cn.itcast.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.ssh.dao.PersonDao;
import cn.itcast.ssh.domin.Person;
import cn.itcast.ssh.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Resource
	private PersonDao personDao;
	
	@Override
	public List<Person> findAll() {
		return personDao.findAll();
	}

}
