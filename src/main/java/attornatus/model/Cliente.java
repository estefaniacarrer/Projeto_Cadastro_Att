package attornatus.model;


import javax.persistence.*;
import java.time.LocalDate;

import org.hibernate.annotations.DynamicUpdate;

import java.util.Objects;

@Entity
@DynamicUpdate
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nome;
    private LocalDate dtNascimento;
    @Embedded
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nome, LocalDate dtNascimento, Endereco endereco) {

        this.idCliente = idCliente;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
    }

    public Long getIdCliente() {

        return idCliente;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public LocalDate getDtNascimento() {

        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {

        this.dtNascimento = dtNascimento;
    }
    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente.equals(cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente);
    }
}
