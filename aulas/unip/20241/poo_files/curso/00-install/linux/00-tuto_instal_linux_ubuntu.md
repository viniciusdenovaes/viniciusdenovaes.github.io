# Como instalar java no linux (ubuntu 18.04)

Para programar em java você precisa do Java Development Kit (JDK).

A versão mais atualizada pode ser encontrada no link http://www.oracle.com/technetwork/java/javase/downloads.
(No momento da escrita neste tutorial, a versão mais nova era a 11)

### Passo a passo

Para instalar o Java no Linux, siga os seguintes passos (as imagens do tutorial foram feitas no Ubuntu 18.04):

 - Baixe o JDK no link www.oracle.com/technetwork/java/javase/downloads
 ![Busca no google pelo jdk](../images/java11InstSearch.png)

 - Escolha a versão do Java, é recomendável pegar a versão mais nova, ela possibilita compilar o seu programa usando qualquer versão anterior
 ![Link para a versão Java 11](../images/java11InstDown.png)

 - Aceite o termo de uso e escolha o tipo de arquivo, aqui escolhemos o "tar.gz" para o Linux
 ![Link para a versão Java 11](../images/java11InstFlavorLinux.png)

 - Aceite o termo de uso e escolha o tipo de arquivo, aqui escolhemos o "tar.gz" para o Linux
 ![Link para a versão Java 11](../images/java11InstFlavorLinux.png)

 - Agora colocamos o programa na pasta `/usr/local/lib/`, para isto vamos abrir o terminal (`ctrl\+alt\+t`) e vamos entrar no modo "super user" com o comando `sudo su`

~~~ shell_session
vinicius@vinicius-ubuntu:~$ sudo su
[sudo] password for vinicius:
~~~

 - Vamos até a pasta `/usr/local/lib/` com o comando `cd /usr/local/lib/`
~~~ shell_session
root@vinicius-ubuntu:/home/vinicius# cd /usr/local/lib/
root@vinicius-ubuntu:/usr/local/lib# ls
python2.7  python3.6
~~~

 - Vamos mover o arquivo baixado para a pasta com o comando `mv /home/vinicius/Downloads/jdk-11.0.1_linux-x64_bin.tar.gz .`
~~~ shell_session
root@vinicius-ubuntu:/usr/local/lib# mv /home/vinicius/Downloads/jdk-11.0.1_linux-x64_bin.tar.gz .
~~~

 -  Vamos extrair aqui o arquivo com o comando `tar -xzvf jdk-11.0.1_linux-x64_bin.tar.gz`
~~~ shell_session
root@vinicius-ubuntu:/usr/local/lib# tar -xzvf jdk-11.0.1_linux-x64_bin.tar.gz
jdk-11.0.1/README.html
jdk-11.0.1/bin/jaotc
jdk-11.0.1/bin/jar
 .
 .
 .
jdk-11.0.1/lib/src.zip
jdk-11.0.1/lib/tzdb.dat
jdk-11.0.1/release
~~~

 - Agora verificamos que foi criada a pasta "jdk-11.0.1" com o comando `ls`
~~~ shell_session
root@vinicius-ubuntu:/usr/local/lib# ls
jdk-11.0.1/  jdk-11.0.1_linux-x64_bin.tar.gz  python2.7/  python3.6/
root@vinicius-ubuntu:/usr/local/lib# exit
exit
vinicius@vinicius-ubuntu:~$
~~~

 - Agora precisamos adicionar o caminho dos arquivos binários do Java aos programas que seu sistema irá procurar:
 -- Na pasta home do seu usuário, abra o arquivo `.bashrc` com qualquer editor de texto (recomendo usar Kate (`sudo apt install kate`))
 -- No final do arquivo adicione uma linha:
~~~ shell
export PATH=/usr/local/lib/jdk-11.0.1/bin:$PATH
~~~

 - Para verificar a instalação vá ao terminal e verifique a versão instalado do Java
 (caso o terminal já esteja aberto, você precisará fechar e abrir de novo para que ele atualize com a modificação do `.bashrc`)
 -- A versão do compilador `javac` com o comando `javac -version`
~~~ shell_session
vinicius@vinicius-ubuntu:~$ javac -version
javac 11.0.1
~~~
 -- A versão do `java` com o comando `java -version`
~~~ shell_session
vinicius@vinicius-ubuntu:~$ java -version
java version "11.0.1" 2018-10-16 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)
~~~


### Informação extra

Pode ser que você se depare com outras versões mais antigas, a tabela abaixo explica cada nomenclatura.

|Nome                    | Acrônimo | Explicação |
|---                     |:---:     |:---        |
Java Development Kit     | JDK | Software para programadores que querem escrever programas em Java |
Java Runtime Environment | JRE | Software para o susuário final que quer rodar um programa em Java |
Standard Edition         | SE  | Plataforma Java para ser usada em computador e aplicações mais simples |
Enterprise Edition       | EE  | Plataforma Java para ser usada em computador ou aplicações mais complexas |
Micro Edition            | ME  | Plataforma Java para ser usada em celulares e dispositivos portáteis |
Java 2                   | J2  | Um termo desatualizado que descreve as versões Java de 1998 a 2006 |
Software Development Kit | SDK | Um termo desatualizado que descreve JDK de 1998 a 2006 |
Update                   | u   | Termo para indicar que algum bug foi consertado |
NetBeans                 | --  | Um ambiente de desenvolvimento da Oracle|
