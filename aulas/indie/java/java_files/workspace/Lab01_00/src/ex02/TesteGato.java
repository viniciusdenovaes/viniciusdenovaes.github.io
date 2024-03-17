package ex02;

public class TesteGato {
	
	public static void main(String[] args) {
		
		Gato gato01 = new Gato("Brutus", 5.5);
        gato01.idade = 2;
        printGato(gato01);
        
        Gato gato02 = new Gato("ligeirinho", 7.5);
        gato02.idade = 4;
        printGato(gato02);
        
        Gato gato03 = new Gato("alfredo", 9.5);
        gato03.idade = 9;
        printGato(gato03);
	}
	
	public static void printGato(Gato gato) {
		System.out.println("Nome: " + gato.nome);
		System.out.println("Idade: " + gato.idade);
		System.out.println("Peso: " + gato.peso);
	}

}
