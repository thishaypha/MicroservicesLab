package com.pt;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties(prefix="word-config")
@RefreshScope
public class LuckyWordController {
	
	String luckyWord;
	String preamble;
	String fullStatement;
	
	@PostConstruct
	void init() {
		fullStatement = "Testing RefreshScope-Howdy!";
	}
	
	@GetMapping("/lucky-word")
	public String showLuckyWord() {
		//return preamble + ": " + luckyWord;
		return fullStatement;
	}

	public String getLuckyWord() {
		return luckyWord;
	}

	public void setLuckyWord(String luckyWord) {
		this.luckyWord = luckyWord;
	}

	public String getPreamble() {
		return preamble;
	}

	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}
		
}
