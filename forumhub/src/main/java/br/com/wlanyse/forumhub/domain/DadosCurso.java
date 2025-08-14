package br.com.wlanyse.forumhub.domain;

public record DadosCurso(Long id, String nome, String categoriaCurso) {

    public DadosCurso(Curso curso){
        this(curso.getId(), curso.getNome(), curso.getCategoria());
    }
}
