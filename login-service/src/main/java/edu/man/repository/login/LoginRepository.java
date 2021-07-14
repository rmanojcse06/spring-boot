package edu.man.repository.login;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.man.bean.login.LoginBean;

@Repository
public interface LoginRepository extends CrudRepository<LoginBean, Integer>{

}
