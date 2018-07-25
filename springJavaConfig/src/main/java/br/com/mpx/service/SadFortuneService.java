package br.com.mpx.service;

import br.com.mpx.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is a sad day";
	}

}
