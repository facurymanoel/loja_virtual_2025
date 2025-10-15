package com.devs.lojavirtual.enums;

public enum TipoEndereco {

	COBRANCA("Cobrança"), 
	Entrega("Entrega");

	private String descricao;

	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.descricao;
	}

}
