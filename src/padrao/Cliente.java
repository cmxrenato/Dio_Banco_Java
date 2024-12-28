package padrao;

import java.util.HashMap;

public class Cliente extends Conta {
	protected String nome;
	protected int identidade;
	
	

	public Cliente(String nome, int identidade){
		this.nome = nome;
		this.identidade = identidade;
		super.agencia = SEQUENCIAL_3++;
		super.numeroContaCorrente = SEQUENCIAL++;
		super.numeroContaPoupanca = SEQUENCIAL_2++;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public int getNumeroContaPoupanca() {
		return numeroContaPoupanca;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	
	public void imprimirExtrato() {
		System.out.println("");
		System.out.println("Cliente: "+getNome());
		System.out.println("Agencia: "+this.agencia);
		System.out.println("Número da Conta Corrente: "+this.numeroContaCorrente);
		System.out.println("Saldo da Corrente: "+this.saldoCC);
		System.out.println("Número da Conta Poupança: "+this.numeroContaPoupanca);
		System.out.println("Saldo da Poupança: "+this.saldoCP);
	}

	@Override
	 public void transferirEntrePessoas_CC(HashMap<Integer, Cliente> clientes, int id, double valor) {
        Cliente clienteDestino = clientes.get(id);
        if (clienteDestino != null && this.saldoCC >= valor) {
            this.saldoCC -= valor;
            clienteDestino.saldoCC += valor;
            System.out.println("Transferência de R$" + valor + " de " + this.nome + " para " + clienteDestino.getNome());
        } else {
            System.out.println("Erro na transferência. Verifique os valores e a existência do cliente.");
        }
    }


	

	
	
	
	
}
