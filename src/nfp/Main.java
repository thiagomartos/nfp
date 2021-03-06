/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago Martos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            lerTxt("\\etc\\Exemplo_mod 1.txt");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void lerTxt(String arquivo) throws FileNotFoundException, IOException {
        List destino = new ArrayList();
        char c;
        int s;
        FileReader stream = new FileReader(System.getProperty("user.dir") + arquivo);
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
    }

}
