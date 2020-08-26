package idwall.desafio.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodrigo Catão Araujo on 06/02/2018.
 */
public class IdwallFormatter extends StringFormat {

    /**
     * Should format as described in the challenge
     *
     * @param text
     * @return
     */
    @Override
    public List<List<String>> format(String text) throws UnsupportedOperationException {
        if(text.isEmpty()){
            throw new UnsupportedOperationException("String vazia não pode ser formatada!");
        }

        /*
        *CAso o texto venha com outro tipo de separador o método não funcionará
         */
        String strSplit[] = text.split(" ");

        List<List<String>> textForm = new ArrayList<List<String>>();
        List<String> strLine = new ArrayList<>();
        int leng = strSplit.length;
        int j = 0;
        while (j < leng) {
            int tamanho = 0;
            strLine = new ArrayList<>();
            while (tamanho < 40 && j < leng) {
                if (tamanho + strSplit[j].length() <= 40) {
                    strLine.add(strSplit[j]);
                    tamanho += strSplit[j].length();
                    j++;
                    if (tamanho < 40) {
                        strLine.add(" ");
                        tamanho += 1;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            textForm.add(strLine);
        }
        return textForm;
    }

    @Override
    public List<List<String>> justify(List<List<String>> text) {
        List<List<String>> outputTextJustify = new ArrayList<>();
        List<String> line = new ArrayList<>();
        if (text.isEmpty()){
            throw new NullPointerException("A string está vazia!");
        }

        for(List<String> elem: text){
            int sizeLine = 0;
            for (String str: elem){
                sizeLine += str.length();
            }
            if (sizeLine < 40){
                line =  justifyLine(elem, sizeLine);
                outputTextJustify.add(line);
            }
            else {
                outputTextJustify.add(elem);
            }

        }
        return outputTextJustify;
    }

    public List<String> justifyLine(List<String> strLine, int sizeLine){
        int sizeDif = 40 - sizeLine;
        int j = 1;
        for (int i = 1; i <= sizeDif && j<=strLine.size(); i++) {
            if(j == strLine.size() - 1 && i< sizeDif){//Para evitar que adicione espaço em branco no inicio da linha
                j=1;
            }
            strLine.add(j, " ");
            j+=3;
        }
        return strLine;
    }

    @Override
    public void printOutput(List<List<String>> text){
        for (List<String> elem: text){
            for (String str: elem){
                System.out.print(str);
            }
            System.out.println();
        }
    }
}

