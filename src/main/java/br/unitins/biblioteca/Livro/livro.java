package br.unitins.biblioteca.Livro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class livro {  // Nome da classe deve começar com letra maiúscula
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivro; // Modificador de acesso 'private' adicionado

    private String titulo;
    private String autor;
    private String editora;
    private int qtdPaginas;
}
