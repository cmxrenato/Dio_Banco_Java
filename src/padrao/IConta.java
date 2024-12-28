package padrao;

import java.util.HashMap;

public interface IConta {
	 void sacarCC(double valor); 
		//Não faz sentido escrever a palavra public
	 //porque toda interface é pública.
	
	 void depositarCC(double valor);
	 
	 
	 void imprimirExtrato();

	void depositarCP(double valor);
	
	

	

	void transferirCP_CC(double valor);

	void transferirCC_CP(double valor);

	void transferirEntrePessoas_CC(HashMap<Integer, Cliente> clientes, int id, double valor);

	
	 
		
	
}
