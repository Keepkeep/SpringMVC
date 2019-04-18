package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.HelloDao;

@Service
public class HelloService {
	@Autowired
	HelloDao helloDao;
	public String  say(){
		return  helloDao.say();
	}
}
