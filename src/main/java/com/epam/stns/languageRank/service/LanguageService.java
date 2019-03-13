package com.epam.stns.languageRank.service;

import com.epam.stns.languageRank.es.document.Language;
import com.epam.stns.languageRank.es.repo.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public void saveLanguage(Language language)
    {
        languageRepository.save(language);
    }

    public List<Language> getAllLanguage()
    {
        Iterable it = languageRepository.findAll();
        List<Language> res = new ArrayList<>();
        for (Object language : it)
        {
            res.add((Language) language);
        }
        return res;
    }


}
