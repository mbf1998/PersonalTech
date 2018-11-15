package br.edu.ifpe.tads.pt.personaltech.model;

public class Aluno {

    private String dataNascimento;
    private String email;
    private String nivel;
    private String nome;
    private String sexo;
    private String telefone;


    public Aluno(){

    }

    public Aluno(String dataNascimento, String email, String nivel
            , String nome, String sexo, String telefone){
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.nivel = nivel;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
