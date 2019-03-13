package com.epam.stns.languageRank.service.resttemp;

import com.epam.stns.languageRank.es.document.Language;
import com.epam.stns.languageRank.model.User;
import org.apache.commons.codec.language.bm.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import java.util.List;

@Service
public class RestService {

    @Autowired
    private RestTemplate restTemplate;

    private static String GET_URL = "http://localhost:8080/getUser";

    @GetMapping("getUser")
    public void getUser() throws URISyntaxException
    {
        User user = restTemplate.getForObject(GET_URL, User.class);
        System.out.println(user.getId());
        System.out.println(user.getName());
    }


}
