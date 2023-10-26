package com.ssafy.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.rest.model.dto.User;

@RestController
@RequestMapping("/rest2")
public class TestController2 {
//	http://localhost:8080/mvc/rest2/test1 : 이제는  @ResponseBody 붙어 있는거라 똑같으니... 
	@GetMapping("/test1")
	public String test1() {
		return "hi rest";
	}

//	http://localhost:8080/mvc/rest2/test2 : 
	@GetMapping("/test2")
	public String test2() {
		return "hi rest";
	}

	// http://localhost:8080/mvc/rest2/test3
	@GetMapping("/test3")
	public Map<String, String> test3() {
		// 키 벨류 형태를 가지고 있는 맵을 반환
		Map<String, String> data = new HashMap<String, String>();

		data.put("id", "ssafy");
		data.put("password", "1234");
		data.put("name", "양띵균");

		return data; // jackson-databind 을 추가 해줬더니 map을 알아서 json으로 바꿔서 주더라...
	}

	// http://localhost:8080/mvc/rest2/test4 : 잭쓴이 DTO오 알아서 JSON으로 바꿔서 보내주는군 GOOD!
	@GetMapping("/test4")
	public User test4() {
		User user = new User("ssafy", "1234", "양띵균");
		return user;
	}

	// http://localhost:8080/mvc/rest2/test5 : LIST 도 반환 해주나?
	@GetMapping("/test5")
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
