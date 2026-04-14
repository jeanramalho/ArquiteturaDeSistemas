package AULA_03;

import javax.xml.namespace.QName;

public class Polimorfismo {

    static class Usuario {
        String nome;
        String email;
        private String password;

        public Usuario(String nome, String email, String senha) {

            this.nome = nome;
            this.email = email;
            this.password = senha;
        }
    }

    public Boolean autenticator(String senhaPassada) {
        return this.password.equals(senhaPassada);
    }

    class Estoquista extends Usuario {
        public Estoquista(String nome, String email, String senha) {
            super(nome, email, senha);

        }
    }

}
