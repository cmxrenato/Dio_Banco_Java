
package padrao;


public abstract class Conta implements IConta {
	
	
	protected static int SEQUENCIAL = 1;
	protected static int SEQUENCIAL_2 = 100;
	protected static int SEQUENCIAL_3 = 300;
	protected int agencia;
	protected int numeroContaCorrente;
	protected int numeroContaPoupanca;
	protected double saldoCC;
	protected double saldoCP;
	protected Cliente cliente;
	/*
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		
		
	}*/
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroCC() {
		return numeroContaCorrente;
	}
	public int getNumeroPoupanca() {
		return numeroContaPoupanca;
	}
	public double getSaldoCC() {
		return saldoCC;
	}
	public double getSaldoCP() {
		return saldoCP;
	}
	@Override
	public void sacarCC(double valor) {
		// TODO Auto-generated method stub
		saldoCC -= valor;
		
	}
	@Override
	public void depositarCC(double valor) {
		// TODO Auto-generated method stub
		saldoCC += valor;
		
	}
	public void sacarCP(double valor) {
		// TODO Auto-generated method stub
		saldoCP -= valor;
		
	}
	@Override
	public void depositarCP(double valor) {
		// TODO Auto-generated method stub
		saldoCP += valor;
		
	}
	@Override
	public void transferirCC_CP(double valor) {
		// TODO Auto-generated method stub
		this.sacarCC(valor);
		this.depositarCP(valor);
	}
	public void transferirCP_CC(double valor) {
		// TODO Auto-generated method stub
		this.sacarCP(valor);
		this.depositarCC(valor);
		
	}
	
	
	
	

}
	 
	  
	
   
