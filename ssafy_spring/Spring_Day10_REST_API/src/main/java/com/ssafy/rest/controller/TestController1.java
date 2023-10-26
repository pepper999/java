package com.ssafy.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.rest.model.dto.User;

@Controller
public class TestController1 {
	//서8 유호영 정답 ㅎ
//	http://localhost:8080/mvc/rest1/test1 : 404 뷰리졸버가 반환된 문자열을 가지고 View 를 찾으려고 해서...
	@GetMapping("/rest1/test1")
	public String test1() {
		return "hi rest";
	}
	
//	http://localhost:8080/mvc/rest1/test2 : @ResponseBody를 붙여서 JSP 화면으로 반환하는게 아니라 데이터 그자체를 반환
	@ResponseBody
	@GetMapping("/rest1/test2")
	public String test2() {
		return "hi rest";
	}
	
	
	//http://localhost:8080/mvc/rest1/test3
	@ResponseBody
	@GetMapping("/rest1/test3")
	public Map<String, String> test3() {
		//키 벨류 형태를 가지고 있는 맵을 반환
		Map<String, String> data = new HashMap<String, String>();
		
		data.put("id", "ssafy");
		data.put("password", "1234");
		data.put("name", "양띵균");
		
		return data; //jackson-databind 을 추가 해줬더니 map을 알아서 json으로 바꿔서 주더라...
	}
	
	//http://localhost:8080/mvc/rest1/test4 : 잭쓴이 DTO오 알아서 JSON으로 바꿔서 보내주는군 GOOD!
	@ResponseBody
	@GetMapping("/rest1/test4")
	public User test4() {
		User user = new User("ssafy", "1234", "양띵균");
		return user;
	}
	
	//http://localhost:8080/mvc/rest1/test5 : LIST 도 반환 해주나?
	@ResponseBody
	@GetMapping("/rest1/test5")
	public List<User> test5() {
		List<User> list = new ArrayList<>();
		list.add(new User("ssafy", "1234", "양띵균"));
		list.add(new User("hyunsoo", "3141592", "조현수"));
		list.add(new User("s4253541", "secret", "조용환"));
		list.add(new User("enugg", "1234", "김은지"));
		list.add(new User("dawon", "1008", "차다운"));
		
		return list;
	}
	
	
	
	
	
	
}
