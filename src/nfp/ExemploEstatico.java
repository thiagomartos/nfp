/*
 * Pacote: nfp
 * Classe: ExemploEstatico.java
 * Criado em 17/02/2019 12:55:18 por Thiago Martos
 * 
 */
package nfp;

import java.util.ArrayList;
import java.util.List;
import nfp.model.*;

/**
 *
 * @author Thiago Martos
 */
public class ExemploEstatico {

    public static void main(String[] args) {
        Arquivo arq = arquivoRatificacao();
        arq = arquivoCancelamento();
    }

    private static Arquivo arquivoRatificacao() {
        Cabecalho cab = new Cabecalho(
                "00000000000000", "10/10/2007", "17/10/2007"
        );
        List<Identificacao> ident = new ArrayList<>();
        ident.add(new Identificacao(
                "I", "", "Venda a Consumidor Final", "0", "20956", "10/10/2007 10:00:00", "10/10/2007 10:00:00", "1", "5102", "000000000000", "000000000000",
                "00000000000000", "Casa F", "R São Manoel", "176", "apto 18", "Centro", "São Paulo", "SP", "10100000", "Brasil", "5550723", ""
        ));
        List<Itens> itens = new ArrayList<>();
        itens.add(new Itens(
                "Produto 0", "Pinga tipo 0", "12345678", "caixa", "1,0000", "5,0000", "5,00", "010", "18,00", "6,00", "10,00"
        ));
        itens.add(new Itens(
                "Produto 1", "Pinga tipo 1", "12345678", "caixa", "1,0000", "5,0000", "5,00", "010", "18,00", "6,00", "10,00"
        ));
        itens.add(new Itens(
                "Produto 2", "Pinga tipo 2", "12345678", "caixa", "1,0000", "5,0000", "5,00", "010", "18,00", "6,00", "10,00"
        ));
        itens.add(new Itens(
                "Produto 3", "Pinga tipo 3", "12345678", "caixa", "1,0000", "5,0000", "5,00", "010", "18,00", "6,00", "10,00"
        ));
        itens.add(new Itens(
                "Produto 4", "Pinga tipo 4", "12345678", "caixa", "1,0000", "5,0000", "5,00", "010", "18,00", "6,00", "10,00"
        ));
        List<Valores> valores = new ArrayList<>();
        valores.add(new Valores(
                "69,01", "1234,56", "45,78", "123,45", "100,10", "20,02", "10,01", "30,00", "5,00", "1,00", "106,13", "234,00", "6,00", "154,00"
        ));
        Transporte transp = new Transporte(
                "0", "00000000000000", "Transportadora Xing Ling", "000000000000", "Av. da Lentidao, 321", "Sao Paulo", "SP", "ABC1234", "SP", "123456789012345", "litros", "Xing Ling", "123456789", "123,000", "154,064"
        );
        Cobranca cob = new Cobranca(
                "Dados da fatura", "Informacoes adicionais de interesse do Fisco", "Informacoes complementares de interesse do contribuinte"
        );
        Rodape rod = new Rodape(
                "00002", "00010", "00002", "00002", "00001"
        );

        return new Arquivo(cab, ident, itens, valores, transp, cob, rod);
    }

    private static Arquivo arquivoCancelamento() {
        Cabecalho cab = new Cabecalho(
                "00000000000000", "10/10/2007", "17/10/2007"
        );
        List<Identificacao> ident = new ArrayList<>();
        ident.add(new Identificacao(
                "I", "", "Venda a Consumidor Final", "0", "20956", "10/10/2007 10:00:00", "10/10/2007 10:00:00", "1", "5102", "000000000000", "000000000000",
                "00000000000000", "Casa F", "R São Manoel", "176", "apto 18", "Centro", "São Paulo", "SP", "10100000", "Brasil", "5550723", ""
        ));
        Rodape rod = new Rodape(
                "00002", "00010", "00002", "00002", "00001"
        );

        return new Arquivo(cab, ident, rod);
    }

}
