package pilhaString;

public class Pilha {
	
	No topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean vazia() {
		if (topo == null)
			return true;
		else 
			return false;
		}



	public void push(String a) {
		No elemento = new No();
		elemento.dado = a;
		if (vazia() == true)
			topo = elemento;
		else {
			elemento.proximo = topo;
			topo = elemento;
		}
			
	}

	public String pop() throws Exception {
		if (vazia() == true)
			throw new Exception("Não há elementos para remover");
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public String topo() throws Exception {
		if (vazia() == true)
			throw new Exception("Não há elementos na pilha");
		String valor = topo.dado;
		return valor;
	}

	public int tamanho() {
		int cont = 0;
		if (vazia() == false) {
			No auxiliar =  topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				cont ++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

}
