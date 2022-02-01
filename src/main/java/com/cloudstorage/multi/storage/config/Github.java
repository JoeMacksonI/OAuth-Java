package com.cloudstorage.multi.storage.config;

import org.springframework.http.ResponseEntity;

public class Github extends ApiBinding{

    private static final String GITHUB_BASE_URL = "https://api.github.com";
    public Github(String accessToken) {
        super(accessToken);
    }

    public void getUser() {
        ResponseEntity responseEntity = restTemplate.getForEntity(GITHUB_BASE_URL + "/user", User.class);
        System.out.println(responseEntity.getStatusCode());
        Object obj = responseEntity.getBody();
        System.out.println(obj);
    }

    /*public List<Post> getFeed() {
        return restTemplate.getForObject(GRAPH_API_BASE_URL + "/me/feed", Feed.class).getData();
    }*/
}
