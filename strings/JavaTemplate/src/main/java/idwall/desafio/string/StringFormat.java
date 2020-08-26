package idwall.desafio.string;

import java.util.List;

/**
 * Created by Rodrigo Catão Araujo on 06/02/2018.
 */
public abstract class StringFormat {

    private Integer limit;

    public StringFormat() {
        this.limit = 40;
    }


    /**
     * It receives a text and should return it formatted
     *
     * @param text
     * @return
     */
    public abstract void printOutput(List<List<String>> text);

    public abstract List<List<String>> format(String text) throws UnsupportedOperationException;

    public abstract List<List<String>> justify(List<List<String>> outputText);
}
