# Menu Funcional

Nesta aula vamos ver um programa que gera um menu para o usuário final à partir do terminal, 
dando acesso à um programa que trata **dados persistentes**.

> **Dados persistentes** são dados que permanecem guardados após o termino do programa. Podendo ser recuperados na próxima vez que o programa iniciar.

O programa vai tratar da entidade `Pato`, cada `Pato` tem um `nome` e uma `idade`.

O programa vai dar a possibilidade do usuário adicionar um `Pato` ao sistema, e listar todos os `Patos` do sistema.

O programa inteiro está disponível no [link](https://github.com/viniciusdenovaes/UnipLpoo/tree/main/Aula08_Menu/src)

À seguir vamos ver a estrutura do projeto e cada classe do programa.

## Estrutura do Projeto:

O projeto está dividido em pacotes, cada um com uma **responsabilidade**:

- `entidade`: neste pacote ficarão as entidades tratadas pelo programa, neste caso a classe `Pato`
- `view`: as classes responsáveis por se comunicar com o usuário, tanto mostrar informações, quanto pedir informações.
- `dao`: Acrônimo de Data-Access-Object, este pacote é responsável por se comunicar com os dados persistentes. Convertendo dados persistentes em objetos e vice-versa.
- `controller`: Classe central do programa, responsável por fazer a comunicação entre o `view` e o resto do programa (neste caso somento o `dao`)
- **Importante**: para o programa funcionar o projeto deve ter uma pasta chamada `files` com um arquivo `patos.csv` na pasta raiz do programa. O arquivo `patos.csv` deve estar no formato **correto** ou completamente vazio, sem nenhuma linha em branco.

## Classes do programa

#### Pato

Classe que funciona como uma estrutura para guardar os dados de um pato.

```java
public class Pato {
	private String nome;
	private int idade;
	public Pato(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {return nome;}
	public int getIdade() {return idade;}
	@Override
	public String toString() {
		return "Pato [nome=" + nome + ", idade=" + idade + "]";
	}
}
```

#### Dao

Como visto na aula sobre `IO`, temos que usar classes específicas para ler e escrever em um arquivo

O método `loadPatos` recebe o nome do arquivo e retorna uma lista de patos que estão no `csv`.

O método `savePatos` recebe uma lista de patos e o nome do arquivo e 
**reescreve** o arquivo `csv` com os dados da lista de patos.

```java

public class Dao {

	public List<Pato> loadPatos(String path){
		List<Pato> patos = new ArrayList<Pato>();
		try (InputStream is = new FileInputStream(path);
				InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
				BufferedReader br = new BufferedReader(isr);
				){
			String linha;
			while((linha = br.readLine()) != null){
				String[] palavras = linha.split(",");
				String nome = palavras[0];
				int idade = Integer.parseInt(palavras[1]);
				patos.add(new Pato(nome, idade));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		return patos;
	}

	public void savePatos(String path, List<Pato> patos) {
		try(OutputStream os = new FileOutputStream(path/*, true*/);
				OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
				PrintWriter pw = new PrintWriter(osw, true);
				){
			for(Pato p: patos){
				pw.println(p.getNome()+","+p.getIdade());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

```

#### View

A classe `View` é responsável por `mostrarPatos` para o usuário final, assim como receber `nome` e `idade` de um pato, caso o usuário queira adicionar um pato no sistema.

A classe tem uma função específica para pedir o `nome` e uma outra para pedir `idade` para o usuário. A função que pede a `idade` tem um controle de erros que impede que a `idade` informada não seja um inteiro, ou seja um inteiro negativo.

```java
package view;
public class View {
	
	public void mostraPatos(List<Pato> patos) {
		System.out.println("Mostrando todos os Patos");
		for(Pato p: patos) {
			System.out.println(p);
		}
	}
	
	public Pato lePato() {
		System.out.println("Entre com os dados do Pato:");
		String nome = leNome();
		int idade = leIdade();
		
		return new Pato(nome, idade);
	}
	
	private String leNome() {
		System.out.println("Entre com o nome do pato");
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		return nome;
	}
	
	private int leIdade() {
		System.out.println("Entre com a idade do pato");
		Scanner in = new Scanner(System.in);
		String idadeTexto = in.nextLine();
		int idade;
		try {
			idade = Integer.parseInt(idadeTexto);
			if(idade<0) {
				throw new IllegalArgumentException();
			}else {
				return idade;
			}
		}catch (Exception e) {
			System.out.println("Idade invalida: " + idadeTexto);
			System.out.println("Tente novamente");
			return leIdade();
		}
	}

}

```

#### Controller

Finalmente, a classe `Controller` cria um menu para o usuário.
1. Usa um `enum` para listar no código todas as possibilidades do menu.
1. Usa `do while` para repetir o menu enquanto a opção for diferente de `SAIR`.
1. Tem uma função para mostrar o menu, mapear um inteiro escolhido em uma das opções e retornar uma opção válida.

```java
package controller;
public class Controller {
	
	private enum Opcoes {MOSTRAR_PATOS, LE_PATOS, SAIR}
	static final String PATH = "files/patos.csv";
	View view = new View();
	Dao dao = new Dao();
	
	public void init() {
		
		Opcoes opcao = null;
		
		List<Pato> patos;
		do {
			opcao = pegaOpcao();
			switch (opcao) {
			case MOSTRAR_PATOS: 
				patos = dao.loadPatos(PATH);
				view.mostraPatos(patos);
				break;
			case LE_PATOS: 
				Pato pato = view.lePato();
				patos = dao.loadPatos(PATH);
				patos.add(pato);
				dao.savePatos(PATH, patos);
				break;
			case SAIR:
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		} while(opcao != Opcoes.SAIR); 
	}
	
	Opcoes pegaOpcao() {
		System.out.println("Entre com a opção desejada");
		System.out.println("1 - Para mostrar patos");
		System.out.println("2 - para entrar com um novo Pato");
		System.out.println("0 - para sair");
		
		Scanner in = new Scanner(System.in);
		String opcaoPalavra = in.nextLine();
		int opcaoInt = -1;
		try {
			opcaoInt = Integer.parseInt(opcaoPalavra);
			switch (opcaoInt) {
			case 1:
				return Opcoes.MOSTRAR_PATOS;
			case 2:
				return Opcoes.LE_PATOS;
			case 0:
				return Opcoes.SAIR;
			default:
				throw new IllegalArgumentException();
			}
		}catch (NumberFormatException e) {
			System.out.println("Opcao invalida: " + opcaoPalavra);
			System.out.println("Opcao deve ser um numero inteiro");
			System.out.println("Tente Novamente");
			return pegaOpcao();
		}catch (IllegalArgumentException e) {
			System.out.println("Opcao invalida: " + opcaoInt);
			System.out.println("Tente Novamente");
			return pegaOpcao();
		}
	}

}
```
