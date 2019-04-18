package dao;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

import entry.Hello;



@Component
public class HelloDao {
	
	public String say(){
		Hello hello = new Hello();
		hello.setName("����");
		hello.setAge(15);
		hello.setSex("��");
		return hello.toString(); 
	}
	
}
