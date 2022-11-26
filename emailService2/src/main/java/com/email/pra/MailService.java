package com.email.pra;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


// CI/CD
// DEVOPS
// DOCKER / Kubernetics(쿠버네티스)
// 코딩테스트 준비
@Service
public class MailService {

	@Autowired
	private JavaMailSender mailSend;
	
	public void sendMail() {
		// TODO Auto-generated method stub
		
		// 수신 대상을 담을 ArrayList 생성		
		ArrayList<String> toUserList = new ArrayList<>();
		
		// 수신대상 추가
		toUserList.add("asdfghcjm@naver.com");
		
		// 수신대상 개수 확인
		int toUserSize = toUserList.size();
		
		// SimpleMailMessage (단순 텍스트 구성 메일 메세지 생성할때 이용)
		SimpleMailMessage simpleMessage = new SimpleMailMessage();

		//수신자 설정
		simpleMessage.setTo((String[]) toUserList.toArray(new String[toUserSize]));
		
		// 메일제목
		simpleMessage.setSubject("SMTP 사용 예제입니다.");
		
		//메일 내용
		simpleMessage.setText("내용 예시입니다.");
		
		// 메일발송
		mailSend.send(simpleMessage);
		
	}
}
