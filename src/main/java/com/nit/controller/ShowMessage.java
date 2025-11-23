package com.nit.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class ShowMessage {
	
	@GetMapping("/show")
	public ResponseEntity<String> showMessage(){
		LocalDateTime ldt = LocalDateTime.now();
		
		int hour = ldt.getHour();
		String msg;
		
		if(hour<12) {
			msg = "Good Morning";
		}
		else if(hour<16) {
			msg = "Good AfterNoon";
		}
		else if(hour<20) {
			msg = "Good Evening";
		}else {
			msg = "Good Night";
		}
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
