package com.epam.stns.languageRank.controller;

import com.epam.stns.languageRank.es.document.Language;
import com.epam.stns.languageRank.model.User;
import com.epam.stns.languageRank.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @RequestMapping(value = "/allLanguages")
    public List<Language> getAllLanguages()
    {
        return languageService.getAllLanguage();
    }

    @RequestMapping(value = "/getUser")
    public User getUser()
    {
        User user = new User();
        user.setId("00001");
        user.setName("zhanshan");
        return user;
    }

}
