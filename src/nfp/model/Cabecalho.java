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
public class Cabecalho {

    private CampoValor tipoRegistro;
    private CampoValor versao;
    private CampoValor cnpj;
    private CampoValor dataInicio;
    private CampoValor dataFim;

    public Cabecalho(CampoValor tipoRegistro, CampoValor versao, CampoValor cnpj, CampoValor dataInicio, CampoValor dataFim) {
        this.tipoRegistro = tipoRegistro;
        this.versao = versao;
        this.cnpj = cnpj;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public CampoValor getTipoRegistro() {
        if (tipoRegistro == null) {
            setTipoRegistro("");
        }
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        CampoValor cv = new CampoValor(1, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '10' para indicar o tipo de registro", tipoRegistro);
        this.tipoRegistro = cv;
    }

    public CampoValor getVersao() {
        if (versao == null) {
            setVersao("");
        }
        return versao;
    }

    public void setVersao(String versao) {
        CampoValor cv = new CampoValor(2, "Versão do leiaute", "N", true, 1, 4, 2, "Versão do leiaute do arquivo. Preencher com '1,00' nesta versão.", versao);
        this.versao = cv;
    }

    public CampoValor getCnpj() {
        if (cnpj == null) {
            setCnpj("");
        }
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        CampoValor cv = new CampoValor(3, "CNPJ do emitente", "X", true, 14, 14, 0, "Informar o CNPJ do emitente com os zeros não significativos. Preencher apenas com números, sem separadores.", cnpj);
        this.cnpj = cv;
    }

    public CampoValor getDataInicio() {
        if (dataInicio == null) {
            setDataInicio("");
        }
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        CampoValor cv = new CampoValor(4, "Data de início do período transferido no arquivo", "D", true, 0, 0, 0, "Menor data de emissão das notas fiscais transmitidas.", dataInicio);
        this.dataInicio = cv;
    }

    public CampoValor getDataFim() {
        if (dataFim == null) {
            setDataFim("");
        }
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        CampoValor cv = new CampoValor(5, "Data de fim do período transferido no arquivo", "D", true, 0, 0, 0, "Maior data de emissão das notas fiscais transmitidas.", dataFim);
        this.dataFim = cv;
    }

}
