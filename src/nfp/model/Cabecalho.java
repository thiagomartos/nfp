/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Cabecalho.java
 * Criado em 17/02/2019 09:47:19 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public final class Cabecalho {

    private CampoValor tipoRegistro;
    private CampoValor versao;
    private CampoValor cnpj;
    private CampoValor dataInicio;
    private CampoValor dataFim;

    public Cabecalho(String cnpj, String dataInicio, String dataFim) {
        setTipoRegistro(new CampoValor(1, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '10' para indicar o tipo de registro", "10"));
        setVersao(new CampoValor(2, "Versão do leiaute", "N", true, 1, 4, 2, "Versão do leiaute do arquivo. Preencher com '1,00' nesta versão.", "1,00"));
        setCnpj(new CampoValor(3, "CNPJ do emitente", "X", true, 14, 14, 0, "Informar o CNPJ do emitente com os zeros não significativos. Preencher apenas com números, sem separadores.", cnpj));
        setDataInicio(new CampoValor(4, "Data de início do período transferido no arquivo", "D", true, 0, 0, 0, "Menor data de emissão das notas fiscais transmitidas.", dataInicio));
        setDataFim(new CampoValor(5, "Data de fim do período transferido no arquivo", "D", true, 0, 0, 0, "Maior data de emissão das notas fiscais transmitidas.", dataFim));
    }

    public CampoValor getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(CampoValor tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public CampoValor getVersao() {
        return versao;
    }

    public void setVersao(CampoValor versao) {
        this.versao = versao;
    }

    public CampoValor getCnpj() {
        return cnpj;
    }

    public void setCnpj(CampoValor cnpj) {
        this.cnpj = cnpj;
    }

    public CampoValor getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(CampoValor dataInicio) {
        this.dataInicio = dataInicio;
    }

    public CampoValor getDataFim() {
        return dataFim;
    }

    public void setDataFim(CampoValor dataFim) {
        this.dataFim = dataFim;
    }

}
