/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Campo.java
 * Criado em 17/02/2019 10:03:49 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public class Campo {

    private int referencia;
    private String descricao;
    private String formato;
    private boolean obrigatorio;
    private int tamanhoMin;
    private int tamanhoMax;
    private int casas;
    private String observacao;

    public Campo(int referencia, String descricao, String formato, boolean obrigatorio, int tamanhoMin, int tamanhoMax, int casas, String observacao) {
        this.referencia = referencia;
        this.descricao = descricao;
        this.formato = formato;
        this.obrigatorio = obrigatorio;
        this.tamanhoMin = tamanhoMin;
        this.tamanhoMax = tamanhoMax;
        this.casas = casas;
        this.observacao = observacao;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public int getTamanhoMin() {
        return tamanhoMin;
    }

    public void setTamanhoMin(int tamanhoMin) {
        this.tamanhoMin = tamanhoMin;
    }

    public int getTamanhoMax() {
        return tamanhoMax;
    }

    public void setTamanhoMax(int tamanhoMax) {
        this.tamanhoMax = tamanhoMax;
    }

    public int getCasas() {
        return casas;
    }

    public void setCasas(int casas) {
        this.casas = casas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
