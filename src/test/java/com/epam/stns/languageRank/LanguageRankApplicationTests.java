package com.epam.stns.languageRank;


import com.epam.stns.languageRank.es.document.Language;
import com.epam.stns.languageRank.service.LanguageService;
import com.epam.stns.languageRank.service.resttemp.RestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LanguageRankApplicationTests {

	@Autowired
	ApplicationContext ioc;

	@Autowired
	RestService restService;

	@Test
	public void testAddLanguage()
	{
		LanguageService languageService = (LanguageService)ioc.getBean("languageService");
		Language language = new Language();
		language.setId("3");
		language.setName("donet");
		language.setUsecounts(Long.valueOf(1900));
		languageService.saveLanguage(language);
	}

	@Test
	public void testRestService() throws URISyntaxException {
		restService.getUser();
	}

}
