package edu.man.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.man.bean.login.LoginBean;
import edu.man.repository.login.LoginRepository;

@Service
public class LoginServiceImpl {

	@Autowired
	LoginRepository loginRepository;
	
	public void addUser(LoginBean bean) {
		loginRepository.save(bean);
	}
}
