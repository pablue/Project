package cn.edu.xyc.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.xyc.dm.model.Teacher;
import cn.edu.xyc.dm.service.TeacherService;

@Scope("prototype")
@Controller("loginAction")
public class LoginAction extends ActionSupport {
	@Resource(name = "teacherService")
	protected TeacherService teacherService;

	private String username;
	private String password;

	public String login() {
		System.out.println("username:" + username);
		System.out.println("password:" + password);
		Teacher teacher = teacherService.login(username, password);
		if(teacher==null){
			return ERROR;
		}
		System.out.println(teacher.getTname());
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
