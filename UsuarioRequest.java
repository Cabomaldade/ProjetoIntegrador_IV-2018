package br.edu.iftm.ppi.domain;


import java.io.Serializable;

public class UsuarioRequest implements Serializable {

    private String login;
    private String senha;

    public UsuarioRequest() {
    }

    public UsuarioRequest(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

