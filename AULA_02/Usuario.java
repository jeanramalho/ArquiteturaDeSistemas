package AULA_02;

// Pode ser necessário implementar Serializable para objetos complexos
public class Usuario {

    // 1. Atributos Privados
    private Long id;
    private String nome;
    private String email;

    //2. Contrutor vazio  (necessário para Hinernate/JPA)
    public Usuario(){
    }

    // 3. Construtor com parâmetros
    public Usuario(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // 4. Getters e Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
