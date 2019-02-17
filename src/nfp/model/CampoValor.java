/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: CampoValor.java
 * Criado em 17/02/2019 10:29:29 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public class CampoValor extends Campo {

    private String valor;

    public CampoValor(int referencia, String descricao, String formato, boolean obrigatorio, int tamanhoMin, int tamanhoMax, int casas, String observacao, String valor) {
        super(referencia, descricao, formato, obrigatorio, tamanhoMin, tamanhoMax, casas, observacao);
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
