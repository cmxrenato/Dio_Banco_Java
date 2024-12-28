package padrao;

import java.util.HashMap;



public class BancoMain {
	
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			HashMap<Integer, Cliente> clientes = new HashMap<>();
			
			
			
			clientes.put(1234,new Cliente("Renato", 1234));
			clientes.put(2345,new Cliente("Maria",2345));
			clientes.put(3453,new Cliente("João",3453));
			clientes.put(2234,new Cliente("José",2234));
			clientes.put(3347,new Cliente("Sebastião",3347));
			clientes.put(8876,new Cliente("Joaquim",8876));
			
			clientes.get(1234).depositarCC(300);
			
			clientes.get(1234).transferirEntrePessoas_CC(clientes, 3453, 65.0);
			
			for(Cliente cliente : clientes.values()) {
				
				cliente.imprimirExtrato();
			}
			
			
			
			
			
			
		}
		
		


		
	}


