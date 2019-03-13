package com.epam.stns.languageRank.configuration;


import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import javax.annotation.PostConstruct;
import java.net.InetAddress;

@Configuration
public class ElasticSearchConfig {

    @Value("${elasticsearch.host}")
    private String esHost;

    @Value("${elasticsearch.port}")
    private int esPort;

    @Value("${elasticsearch.clusterName}")
    private String esClusterName;

    private TransportClient client;

    @PostConstruct
    public void initialize() throws Exception
    {
        Settings settings = Settings.builder()
                .put("cluster.name", esClusterName)
                .put("client.transport.sniff", true).build();

        client = new PreBuiltTransportClient(settings);

        String[] esHosts = esHost.trim().split(",");
        for (String host : esHosts) {
            client.addTransportAddress(new TransportAddress(InetAddress.getByName(host),
                    esPort));
        }

    }





    @Bean
    public Client client()
    {
        return client;
    }





    @Bean
    public ElasticsearchTemplate elasticsearchTemplate(Client client)
    {
        return new ElasticsearchTemplate(client);
    }


    public void destroy()
    {
        if (client != null) {
            client.close();
        }
    }

}
