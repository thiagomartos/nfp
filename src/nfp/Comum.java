/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago Martos
 */
public class Comum {

    public static List<String> lerArquivo(String caminho) throws FileNotFoundException, IOException {
        List<String> destino = new ArrayList();
        char c;
        int s;
        FileReader stream = new FileReader(caminho);
        StringBuffer buffer = new StringBuffer();
        try {
            while ((s = stream.read()) != -1) {
                c = (char) s;
                if (c == '\n') {
                    destino.add(new String(buffer));
                    buffer.delete(0, buffer.length());
                } else {
                    buffer.append(c);
                }
            }
            destino.add(new String(buffer));
        } finally {
            stream.close();
        }

        return destino;
    }

}
