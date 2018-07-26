package br.com.mpx.service;

import org.springframework.stereotype.Component;

import br.com.mpx.interfaces.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
