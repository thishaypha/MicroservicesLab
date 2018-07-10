package com.pt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pt.dao.AdjectiveClient;
import com.pt.dao.ArticleClient;
import com.pt.dao.NounClient;
import com.pt.dao.SubjectClient;
import com.pt.dao.VerbClient;
import com.pt.domain.Word;

@Service
public class WordServiceImpl implements WordService {

	@Autowired VerbClient verbClient;
	@Autowired SubjectClient subjectClient;
	@Autowired ArticleClient articleClient;
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired NounClient nounClient;
	
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public Word getSubject() {
		return subjectClient.getWord();
	}
	
	@Override
	public Word getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	public Word getArticle() {
		return articleClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public Word getNoun() {
		return nounClient.getWord();
	}	
	
	public Word getFallbackAdjective() {
		return new Word("ADJFLB");
	}
	
	public Word getFallbackSubject() {
		return new Word("Someone");
	}
	
	public Word getFallbackNoun() {
		return new Word("something");
	}
}