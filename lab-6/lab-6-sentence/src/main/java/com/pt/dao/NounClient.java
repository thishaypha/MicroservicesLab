package com.pt.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pt.domain.Word;

@FeignClient("NOUN")
public interface NounClient {
	
	@GetMapping("/")
	public Word getWord();

}
