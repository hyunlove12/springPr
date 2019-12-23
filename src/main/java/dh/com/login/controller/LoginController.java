package dh.com.login.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dh.com.login.service.LoginService;
import dh.com.login.service.LoginVO;

@Controller
@RequestMapping("/login/*")
public class LoginController {

	@Autowired
	LoginService service;
	
	@RequestMapping("/login.do")
	public void test(){
		
	}
	
	@RequestMapping("/userList.do")
	public String userList(ModelMap model) {
		System.out.println("호출!");
		ArrayList<LoginVO> list = new ArrayList<LoginVO>();
		list = service.userList();
		model.addAttribute("list", list);
		System.out.println("완료");
		return  "est/login/login";
	}
	
	
}
