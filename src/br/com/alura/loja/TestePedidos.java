package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.pedido.GerarPedido;

public class TestePedidos {

	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
		gerador.executa();
	}
}
