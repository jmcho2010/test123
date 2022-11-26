package com.email.pra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	private MailService mailService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		mailService.sendMail();
		return "이메일 서비스 시작전 테스트";
	}
	
}
