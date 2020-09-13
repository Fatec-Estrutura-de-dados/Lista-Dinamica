package ListaLigada;

public class LinkedList<T> {

	private Node<T> primeira = null;
	private Node<T> ultimo = null;
	private int size;

	//Adiciona no começo
	public void adiconaNocomeco(T obj) {

		Node<T> nova = new Node<T>(obj, primeira);

		this.primeira = nova;
		if (this.size == 0) {
			this.ultimo = this.primeira;
		}
		this.size++;
	}

	//adiciona 
	public void adiciona(T obj) {

		if (this.size == 0) {
			adiconaNocomeco(obj);
			return;
		}
		Node<T> cel = new Node<T>(obj, null);
		this.ultimo.setProximo(cel);
		this.ultimo = cel;

		this.size++;
	}

	//adiciona no meio
	public void adionaMeio(T elemento) {	
		
		if(this.size == 1 || this.isEmpty()) {
			 this.adiconaNocomeco(elemento);
			 return;
		}
		int posicao  = (this.size/2)+1;
		this.adiciona(posicao, elemento);
	}
	
	//Adiciona em uma determinada posição
	public void adiciona(int posicao, T elementes) {
       
		int posiAtual =1; 
		Node<T> atual = primeira;
		Node<T> ant = atual;
        
        if(posicao == 1) {
          adiconaNocomeco(elementes);
          return;
        }
        
		while(posiAtual<posicao-1) {
			ant = atual;
			atual = atual.getProximo();
			posiAtual++;
		}
		
		Node<T> ant1 = ant.getProximo();
		Node<T> cel = new Node<T>(elementes, ant1);
		ant.setProximo(cel);
		this.size++;
	}

	//Retorna o valor de uma determinada posição..
	private Node<T> pegaCelula(int posicao) {
		// TODO Auto-generated method stub
		Node<T> atual = this.primeira;
		for(int i=1;i<posicao;i++) {
			atual =atual.getProximo();
		}
		return atual;
	}

	//Remove em uma deteminada posição
	public Node<T> removePosition(int posicao) {
		if(this.isEmpty())throw new IllegalArgumentException("Erro ao remover lista vazia");		
		int posiAtual = 1;
		Node<T> atual =this.primeira;
		Node<T> ant = null;
		if(posicao == 1) {
			return removeFirst();
		}
		
		while(posiAtual<posicao) {
			ant = atual;
			atual = atual.getProximo();
			posiAtual++;
		}
		
	    Node<T> value = ant.getProximo();
		ant.setProximo(ant.getProximo().getProximo());
		size--;
		return value;
	}
	
	//Remove final
	public void removeFinal() {
		
		if(this.size==0) {
			throw new IllegalArgumentException("Erro ao remover lista vazia");			
		}else if(this.size==1) {
			this.removeFirst();
			return;
		}
		int posiAtual = 1;
		Node<T> atual =this.primeira;
		Node<T> ant = null;
		
		while(atual.getProximo()!=null) {
			ant = atual;
			atual = atual.getProximo();
			posiAtual++;
		}
		
		ant.setProximo(atual.getProximo());
		size--;
	}
	
	//Remove o primeiro elemento
	public Node<T> removeFirst() {
	   
		//valida se tem informação a ser removida...
		if(this.size == 0) {
			throw new IllegalArgumentException("Erro ao remover lista vazia");			
		}	
		Node<T> value = this.primeira;
		this.primeira = this.primeira.getProximo();		
		this.size--;
		if(this.size==0) {
			this.ultimo  =null;
		}
		size--;
		return value;
	}
	
	public void removeMeio(){
		
		if(this.size == 1) {
			
			this.removeFirst();
			return;
		}else if(this.isEmpty()){
			
			throw new IllegalArgumentException("Erro ao remover lista vazia");		
		}
		int posicao  = (this.size/2)+1;
		this. removePosition(posicao);
		
	}
	//Mostra as informaçoes
	public String toString() {

		if (this.size == 0) {
			return "[]";
		}

		Node<T> atual = primeira;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < this.size; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size == 0;
		
	}

	 
}
