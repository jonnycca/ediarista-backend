package br.com.ediarista.dto;

import java.util.Objects;

public class DiaristaForm {

    private String nome;

    private String telefone;

    private String cpf;

    public DiaristaForm() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiaristaForm that = (DiaristaForm) o;
        return Objects.equals(nome, that.nome) && Objects.equals(telefone, that.telefone) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, cpf);
    }

    @Override
    public String toString() {
        return "DiaristaForm{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
