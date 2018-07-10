package com.pt.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pt.domain.Word;

@FeignClient("VERB")
public interface VerbClient {
	
	@GetMapping("/")
	public Word getWord();

}
