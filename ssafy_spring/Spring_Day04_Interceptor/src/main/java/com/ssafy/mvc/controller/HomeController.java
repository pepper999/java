package com.ssafy.mvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//regist 라고 하는 Get요청이 들어왔을 때 regist.jsp로 보내고 싶다.
	@GetMapping("regist")
	public String registForm() {
		//로그인 유무를 파악을 하고 했으면 진행 안했으면 돌아가 .....
		return "regist";
	}
	
	@PostMapping("regist")
	public String regist() {
		//예시로
		//서비스를 호출해서 등록을 하겠다.... 
		return "index";
	}
	
	
	@GetMapping("login")
	public String loginForm() {
		return "login";
	}
	
	
	@PostMapping("login")
	public String login(HttpSession session, String id,  String pw) {
		//user 관련 service를 호출해서 직접 내 사용자가 맞는지 쳌 필요
		
		
		if(id.equals("ssafy") && pw.equals("1234")) {
			session.setAttribute("id", id);
			return "redirect:/";
		}
		
		//아니라면 로그인페이지로 다시가라 
		return "redirect:/login";
	}
	
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("id");
//		session.invalidate(); 
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
