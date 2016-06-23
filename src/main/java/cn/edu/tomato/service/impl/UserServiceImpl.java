package cn.edu.tomato.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.tomato.mapper.user.UserMapper;
import cn.edu.tomato.model.User;
import cn.edu.tomato.service.interfaces.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;

	/* (non-Javadoc)
	 * @see cn.edu.tomato.service.interfaces.IUserService#saveUser(cn.edu.tomato.model.User)
	 */
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userMapper.saveUser(user);
	}
}
