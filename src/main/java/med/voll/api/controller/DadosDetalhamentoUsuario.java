package med.voll.api.controller;

import med.voll.api.domain.usuario.Usuario;

public record DadosDetalhamentoUsuario (Long id, String login){
    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getLogin());
    }
}
