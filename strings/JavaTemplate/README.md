<h1>Manipulando String</h1>

<h2>Objetivo</h2>
    
    Desenvolver um plugin que aceitará no máximo 40 caracteres por linha, em um texto.
    Implemente uma função que receba:
    1. um texto qualquer
    2. um limite de comprimento
    
    Ser capaz de gerar os outputs dos desafios abaixo:
    1 - texto possuir, no máximo, 40 caracteres por linha. As palavras não podem ser quebradas no meio.
    2 - texto deve estar **justificado**.


<h2>Tecnologias Utilizadas</h2>

- Java SE 8;
- JUnit 4;
- Docker 19.03.12

<h2>Tecnologia necessária para execução do plugin</h2>

- Docker instalado

<h2>Como executar o programa</h2>

- Baixe a imagem docker do plugin com o comando: docker pull josienevieira/desafioid:latest

- Rode a imagem docker pelo terminal do seu computador com o comando: docker run -it josienevieira/desafioid 
Dessa forma o plugin executara com dados default que já estão no código.

É possível passar parametros na execução da imagem, após digitar o comando para rodar a imagem basta colocar a string que deseja formatar, um valor inteiro e um boolean responsável por definir se o texto deverá ser justificado ou não, como no exemplo abaixo:
 
 - docker run -it josienevieira/desafioid "Esse livro se encaixa no gênero Afrofuturismo. A primeira vez que ouvi esse termo" 40 false

É possível rodar a imagem e permancer no terminal do docker, basta digitar o seguinte comando: 
 1. docker run -ti --entrypoint /bin/sh josienevieira/desafioid. 
 A aparencia do terminal vai mudar ficará com algo do tipo: 
   - /app # 
  basta usar o comando ls e verificar que o app.jar está lá para ser executado.
 2. Digite *java -jar app.jar* e será executado o plugin com os dados deafault. Pode também passar arqumentos depois do comando, como a string que deseja formatar;
 3. Para sair do terminal basta executar o comando *exit*
 
Depois do exit é possivel perceber que voltamos para o terminal local, caso queira executar o *container* gerado basta executar o comando *docker ps -a* para listar os processos, identificar o ID do container que acabou de ser gerado e executar o comando:
 - *docker exec -ti <Container_ID> /bin/sh* 
    Esse comando apenas funcionará se o container estiver com o status Up, caso contrário precisar dar o comando *docker start <Container_ID>*
    
**OBS.: Ao executar o plugin dentro do terminal do docker é preciso tomar cuidado com strings muito grandes**

Nesse [link](https://github.com/josvieira/desafios/blob/master/strings/JavaTemplate/texto_para_teste) tem um texto para usar a fim de textar o plugin.



<h2>Dificuldades</h2>

 - Inicialmete precisei pensar na lógica que usaria para formatar a string, e também pesquisar o uso da tecnologia Docker que até então nunca havia utilizado
 - :heavy_check_mark:Ao executar uma vez o comando run, não permanecemos no terminal do docker, retornando para o terminal local, sendo necessário executar o comando run novamente passando parametros diferentes dos que estão por default no código;

<h2>Melhorias</h2>

- :warning: O plugin não está funcionando 100%, pois algumas linhas não alcançam o total de 40 caracteres;
- :warning: o código pode ser melhorado visual e esteticamente falando, pois existem features novas do java que podem ser utilizadas ao invés de lançar mão dos loops tradicinais e condicionais if/else;
- :warning: a cobertura de testes pode ser melhor desenvolvida, foram criados testes unitários para um dos métodos dos três que foram criados;
- :warning: Ao executar o plugin no terminal do docker ele dá um erro se a string for muito grande, a maior string que conseguir passar, como parâmetro foi com 840 caracteres,que é o segundo texto [que se encontra no exemplo](https://github.com/josvieira/desafios/blob/master/strings/JavaTemplate/texto_para_teste).
- :warning: Utilizar qualquer tamanho de linha e não o tamanho fizado em 40, batando passar mais um parametro para o método.

<h2>Aprendizados</h2>
- Aprendi a respeito da tecnologia Docker e conceitos de containers;  
