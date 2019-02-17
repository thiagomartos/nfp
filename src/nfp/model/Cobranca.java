/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Cobranca.java
 * Criado em 17/02/2019 09:46:28 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public class Cobranca {

    private CampoValor tipoRegistro;
    private CampoValor fatura;
    private CampoValor infAdFisico;
    private CampoValor infCpl;

    public Cobranca(CampoValor tipoRegistro, CampoValor fatura, CampoValor infAdFisico, CampoValor infCpl) {
        this.tipoRegistro = tipoRegistro;
        this.fatura = fatura;
        this.infAdFisico = infAdFisico;
        this.infCpl = infCpl;
    }

    public CampoValor getTipoRegistro() {
        if (tipoRegistro == null) {
            setTipoRegistro("");
        }
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        CampoValor cv = new CampoValor(73, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '60' para indicar o tipo de registro", tipoRegistro);
        this.tipoRegistro = cv;
    }

    public CampoValor getFatura() {
        if (fatura == null) {
            setFatura("");
        }
        return fatura;
    }

    public void setFatura(String fatura) {
        CampoValor cv = new CampoValor(74, "Dados da Fatura", "X", false, 1, 256, 0, "Preencher o campo com os dados da fatura", fatura);
        this.fatura = cv;
    }

    public CampoValor getInfAdFisico() {
        if (infAdFisico == null) {
            setInfAdFisico("");
        }
        return infAdFisico;
    }

    public void setInfAdFisico(String infAdFisico) {
        CampoValor cv = new CampoValor(75, "Informações Adicionais de Interesse do Fisco", "X", false, 1, 256, 0, "", infAdFisico);
        this.infAdFisico = cv;
    }

    public CampoValor getInfCpl() {
        if (infCpl == null) {
            setInfCpl("");
        }
        return infCpl;
    }

    public void setInfCpl(String infCpl) {
        CampoValor cv = new CampoValor(76, "Informações Complementares de interesse do Contribuinte", "X", false, 1, 5000, 0, "", infCpl);
        this.infCpl = cv;
    }

}
