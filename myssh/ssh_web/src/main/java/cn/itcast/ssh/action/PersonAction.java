package cn.itcast.ssh.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.ssh.domin.Person;
import cn.itcast.ssh.service.PersonService;

@Controller
@Scope("prototype")
public class PersonAction extends ActionSupport{

	// 注入service
	@Resource
	private PersonService personService;
	
	
	// 测试方法：列表展示
	public String list(){
		List<Person> list = personService.findAll();
		ActionContext.getContext().put("list", list);
		return "list";
	}
	
}
