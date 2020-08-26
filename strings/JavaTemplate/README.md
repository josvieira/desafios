<h1>Manipulando String</h1>

##Objetivo
    
    Desenvolver um plugin que aceitará no máximo 40 caracteres por linha, em um texto.
    Implemente uma função que receba:
    1. um texto qualquer
    2. um limite de comprimento
    
    Ser capaz de gerar os outputs dos desafios abaixo:
    1 - texto possuir, no máximo, 40 caracteres por linha. As palavras não podem ser quebradas no meio.
    2 - texto deve estar **justificado**.


###Tecnologias Utilizadas

- Java SE 8;
- JUnit 4;
- Docker 19.03.12

###Tecnologia necessária para execução do plugin

- Docker instalado

###Como executar o programa

- Baixe a imagem docker do plugin com o comendo: docker pull josienevieira/desafioid:latest

- Rode a imagem docker pelo terminal do seu computador com o comando: docker run -it josienevieira/desafioid 

É possível passar parametros na execução da imagem, após difgitar o comando para rodar a imagem basta colocar a string que desejar formatar, um valor inteiro e um boolean responsável por definir se o texto deverá ser justificado ou não, como no exemplo abaixo:
 
 - docker run -it josienevieira/desafioid "Esse livro se encaixa no gênero Afrofuturismo. A primeira vez que ouvi esse termo"  false

Nesse link tem um texto para usar a fim de textar o plugin.



##Dificuldades

<p>Inicialmete precisei pensar na lógica que usaria para formatar a string, e também pesquisar o uso da tecnologia Docker que até então nunca havia utilizado</p>

###Melhorias

- O plugin não está funcionando 100%, pois mesmo colocando tentando junstificar o texto com " " espaços em branco algumas linhas não alcançam o total de 40 caracteres
- o código pode ser melhorado visual e esteticamente falando, pois existem features novas do java que podem ser utilizadas ao invés de lançar mão dos loops tradicinais e condicionais if/else;
- a cobertura de testes pode ser melhor desenvolvida, foram criados apenas testes unitários para um dos métodos dos três que foram criados.
- A imagem docker pode ser melhorada pois ao executar uma vez o comando run, não permanecemos no terminal do docker, retornando para o terminal local, sendo necessário executar o comando run novamente passando parametros diferentes dos que estão por default no código.
- Utilizar qualquer tamanho de linha e não o tamanho fizado em 40, essa é a mais tranquila para implementar, batando passar mais um parametro para o método. 