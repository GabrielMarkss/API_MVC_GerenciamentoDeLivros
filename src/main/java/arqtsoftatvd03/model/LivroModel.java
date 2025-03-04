package arqtsoftatvd03.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_livros")
public class LivroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    private String autor;

    private Integer anoPub;

    public LivroModel(String titulo, String autor, Integer anoPub) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
    }

    public LivroModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(Integer anoPub) {
        this.anoPub = anoPub;
    }
}