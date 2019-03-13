package com.epam.stns.languageRank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories(basePackages = "com.epam.stns.languageRank.es.repo")
@SpringBootApplication
public class LanguageRankApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanguageRankApplication.class, args);
	}

}
