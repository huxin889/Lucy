package cn.edu.tomato.controller.user;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.tomato.model.User;
import cn.edu.tomato.service.interfaces.IUserService;

@Controller
@RequestMapping ("/user")
public class UserController {
	private final static Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;
	
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/saveUser")
	public String saveUser (User user){
		String page = "";
		try{
			userService.saveUser(user);
			page = "success";
		}catch(Exception e){
			e.printStackTrace();
			log.error(e.getMessage());
			page = "fail";
		}
		return page;
	}
}
