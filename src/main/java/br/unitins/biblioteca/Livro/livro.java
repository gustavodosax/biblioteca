package br.unitins.biblioteca.Livro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class livro {
    @Id
    Long idLivro;
    String titulo;
    String autor;
    String editora;
    int qtdPaginas;

}
