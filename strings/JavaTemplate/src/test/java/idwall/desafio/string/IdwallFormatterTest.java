package idwall.desafio.string;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class IdwallFormatterTest {

    @Test
    public void formatStringNull(){
        String text = "";
        final StringFormat sf = new IdwallFormatter();

        try {
            List<List<String>> str = sf.format(text);
            fail("Uma exceção deveria ter sido lançada!");
        }catch (Exception e){
            assertEquals("String vazia não pode ser formatada!", e.getMessage());
        }
    }

    @Test
    public void formatStringCorrect(){
        String text = "Esse livro se encaixa no gênero Afrofuturismo. A primeira vez que ouvi esse termo foi no @blogparenteses e na semana " +
                "passada acompanhei o evento O Futuro é Preto organizado pelo pessoal do IG @ofuturoepreto. No evento eu pude entender a " +
                "respeito do que é afrofuturismo e fui apresentada à vários nomes de autoras e autores que escrevem essa temática." +
                "Não vou saber aqui explicar de forma simplificada sobre o que é o tema, então indico que procurem os dos IG’s citados " +
                "para entender do assunto, mas o nome já é bem explicativo. A história se passa num futuro, daqueles que vemos em filmes " +
                "com carros voadores e tecnologias futuristas. O personagem principal é o João Arolê ele reside na cidade de Ketu Três a " +
                "Cidade das Alturas. Ainda criança ele se descobre um Emí eje, pessoas que possuem poderes ancestrais e nosso personagem é " +
                "levado para um treinamento para que faça parte do Esquadrão Secreto de Supressão. O livro emprega vários termos ligado á " +
                "cultura ancestral da Terra Mãe, a ciência é totalmente baseada nesses conhecimentos, os mais velhos são cultuados, " +
                "principalmente as matriarcas que são as grandes CEO’s. Todos os personagens possuem a pele melaninada, termo usado pelo " +
                "próprio autor, de todos os tons e quanto mais escura a pela da pessoa mais alto ela esta na hierarquia social. Nesse livro" +
                " a negritude é exaltada em todo seu esplendor. Antes desse mundo existia o Mundo Original, mas apareceram alienígenas que " +
                "sequestraram, torturaram, mataram e levaram, cativas, para o Mundo Novo, os povos desse Mundo Original. Mas eles comemoram " +
                "todos os anos a Libertação Láurea que foi quando os poderes ancestrais despertaram nos descendentes do Mundo Original e eles " +
                "conseguiriam vencer os alienígenas e conseguiram a liberdade. Achei essa parte sensacional. A escrita do Fábio é muito " +
                "fluída, tem algumas passagens onde o ritmo da leitura é igual à forma com que o personagem está agindo, se está correndo, " +
                "se está ansioso, achei isso muito interessante. Há duas linhas narrativas, uma contanto a infância de João Arolê e outra " +
                "narrando os dias atuais e essas duas linhas vão avançando até convergirem. O livro tem muita ação, tem muita coisa " +
                "acontecendo em nenhum momento fica monótono, mesmo quando ele está apenas descrevendo o ambiente. Redescobri meu amor pela " +
                "ficção científica com esse livro";

        final StringFormat sf = new IdwallFormatter();
        List<List<String>> strFormat = sf.format(text);

        assertEquals(12, strFormat.get(0).size());
        assertTrue(!strFormat.isEmpty());

        //sf.printOutput(strFormat);
    }

    @Test
    public void stringFormatTextShort(){
        String text = "Esse livro se encaixa";
        final StringFormat sf = new IdwallFormatter();
        List<List<String>> strFormat = sf.format(text);

        assertEquals(8, strFormat.get(0).size());
        assertTrue(!strFormat.isEmpty());
    }

}
