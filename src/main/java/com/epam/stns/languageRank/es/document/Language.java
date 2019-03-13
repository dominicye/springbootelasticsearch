package com.epam.stns.languageRank.es.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "gitinfo", type = "language", shards = 5 , replicas = 1)
public class Language {

    @Id
    private String id;

    private String name;

    private Long usecounts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUsecounts() {
        return usecounts;
    }

    public void setUsecounts(Long usecounts) {
        this.usecounts = usecounts;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", usecounts=" + usecounts +
                '}';
    }
}
