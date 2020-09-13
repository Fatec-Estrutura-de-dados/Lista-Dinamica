package ListaLigada;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testeTemperatura();
		testeAluno();
		

		

	}

	private static void testeAluno() {
		
		 LinkedList<Aluno> node = new LinkedList<Aluno>();
			
	        //CONFERE SE A LISTA ESTA VAZIA.
	        if(node.isEmpty()) {
	        	System.out.println("Lista Vazia!!");
	        }else {
	        	System.out.println(" Não esta vazia ");
	        }
	        
	        //ADICIONA FINAL.
			node.adiciona(new Aluno(125487, "Jose Da Silva","Semestre - 04"));
			node.adiciona(new Aluno(125487, "Wanderlei dos Campos","Semestre - 06"));
			
			//Adiciona no Meio
			node.adionaMeio(new Aluno(125487, "Henrique Santos","Semestre - 06"));
	        
			System.out.println(node.toString());
	        //ADICIONA NO COMEÇO.
	        node.adiconaNocomeco(new Aluno(125487, "Carlos Andrade","Semestre - 6"));
	        
	       
			
			//Adiciona em posição na posição 3
			node.adiciona(3, new Aluno(125487, "Marlene Santos","Semestre - 4"));
			//remove final
			node.removeFinal();
			System.out.println(node.toString());
			//remove do inicio
			node.removeFirst();
			System.out.println(node.toString());
			node.adiciona(2, new Aluno(125487, "Henrique ","Semestre - 6"));
			//Remove no meio
			node.removeMeio();
			
			System.out.println(node.toString());	
			Aluno aluno  = node.removePosition(2).getElemento();
			System.out.println("Aluno "+aluno.toString());
			System.out.println(node.toString());
		
	}

	private static void testeTemperatura() {
		
        LinkedList<Temperatura> node = new LinkedList<Temperatura>();
		
        //CONFERE SE A LISTA ESTA VAZIA.
        if(node.isEmpty()) {
        	System.out.println("Lista Vazia!!");
        }else {
        	System.out.println(" Não esta vazia ");
        }
        
        //ADIONA NO COMEÇO.
        node.adiconaNocomeco(new Temperatura("98"));
        
        //ADICIONA FINAL.
		node.adiciona(new Temperatura("78"));
		node.adiciona(new Temperatura("100"));
		node.adiciona(new Temperatura("58"));
		
		//Adiciona em posição na posição 3
		node.adiciona(3, new Temperatura("879"));
		
		System.out.println(node.toString());
		//remove do inicio
		node.removeFirst();
		System.out.println(node.toString());
		node.adiciona(2, new Temperatura("58"));
		System.out.println(node.toString());	
		Temperatura temp  = node.removePosition(2).getElemento();
		System.out.println(node.toString());
	}

}
