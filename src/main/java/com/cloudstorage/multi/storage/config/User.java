package com.cloudstorage.multi.storage.config;

/**
 * get the data from
 * https://docs.github.com/en/rest/reference/users
 */
public class User {

    private  String id;
    private String email;
    private String login;
    private String repos_url;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", repos_url='" + repos_url + '\'' +
                '}';
    }
}
