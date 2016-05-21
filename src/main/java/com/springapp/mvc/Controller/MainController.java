package com.springapp.mvc.Controller;

import com.springapp.mvc.Model.User;
import com.springapp.mvc.Service.IUserService;
import com.springapp.mvc.Service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	private IUserService service = new UserServiceImpl();
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index( User user) {
		return "index";
	}

	@RequestMapping(value ="/toJson",method=RequestMethod.POST)
	@ResponseBody
	public User toJson(User user){
		service.addUser(user); //一起测试了
		return service.findUserById(2);
	}

}