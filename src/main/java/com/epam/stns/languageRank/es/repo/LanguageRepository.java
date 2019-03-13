package com.epam.stns.languageRank.es.repo;

import com.epam.stns.languageRank.es.document.Language;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface LanguageRepository extends ElasticsearchRepository<Language, String> {
}
