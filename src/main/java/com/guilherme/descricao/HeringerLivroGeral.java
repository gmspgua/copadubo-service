package com.guilherme.descricao;

import java.math.BigDecimal;

public class HeringerLivroGeral extends Utils implements Parser{

	@Override
	public String splitLivro(String dados) {
		String livro = dados.substring(8,  21);
		return livro;
	}

	@Override
	public String splitDescricao(String dados) {
		String descricao = dados.substring(0,  8);
		return descricao;
	}

	@Override
	public BigDecimal splitProducao(String dados) {
		String producao = dados.substring(26,  dados.length()).trim();
		return convertStringToBigdecimal(producao);
	}
	
	@Override
	public String splitPosicao(String dados) {
		return getPosition(dados);
	}

}
