package cn.itcast.ssh.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import cn.itcast.ssh.dao.PersonDao;
import cn.itcast.ssh.domin.Person;

@Repository
public class PersonDaoImpl  extends HibernateDaoSupport implements PersonDao{
	//根据方法的参数类型，去ioc容器中找SessionFactory类型的对象注入到方法参数
	@Resource
	public void setSf(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<Person> findAll() {
		return getHibernateTemplate().loadAll(Person.class);
	}
	
	
}
