package br.com.triadworks.issuetracker.controller;

import br.com.triadworks.issuetracker.model.Usuario;

public class UsuarioWeb {

	private Usuario usuario;
	
	public void loga(Usuario usuario) {
		this.usuario = usuario;
	}

	public void logout() {
		this.usuario = null;
	}
	
	public boolean isLogado() {
		return this.usuario != null;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
}