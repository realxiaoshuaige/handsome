package cn.itcast.ssh.dao;

import java.util.List;

import cn.itcast.ssh.domin.Person;


public interface PersonDao {
	public List<Person> findAll();
}
