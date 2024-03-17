package ex01;

public class TesteGato {
	
	public static void main(String[] args) {
		
		Gato gato01 = new Gato();
        gato01.nome = "Brutus";
        gato01.idade = 2;
        gato01.peso = 5.5;
        printGato(gato01);
        
        Gato gato02 = new Gato();
        gato02.nome = "ligeirinho";
        gato02.idade = 4;
        gato02.peso = 7.5;
        printGato(gato02);
        
        Gato gato03 = new Gato();
        gato03.nome = "alfredo";
        gato03.idade = 9;
        gato03.peso = 9.5;
        printGato(gato03);
	}
	
	public static void printGato(Gato gato) {
		System.out.println("Nome: " + gato.nome);
		System.out.println("Idade: " + gato.idade);
		System.out.println("Peso: " + gato.peso);
	}

}
