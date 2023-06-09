package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GerarPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	
	public GerarPedido(String cliente, BigDecimal valorOrcamento, int quantidade) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidade;
	}
	
	public void executa() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
		
		Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);
		
		System.out.println("Salvando no BD");
		System.out.println("Enviar e-mail com dados do novo pedido");
	}
	
}
