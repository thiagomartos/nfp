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
public final class Cobranca {

    private CampoValor tipoRegistro;
    private CampoValor fatura;
    private CampoValor infAdFisico;
    private CampoValor infCpl;

    public Cobranca(String fatura, String infAdFisico, String infCpl) {
        setTipoRegistro(new CampoValor(73, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '60' para indicar o tipo de registro", "60"));
        setFatura(new CampoValor(74, "Dados da Fatura", "X", false, 1, 256, 0, "Preencher o campo com os dados da fatura", fatura));
        setInfAdFisico(new CampoValor(75, "Informações Adicionais de Interesse do Fisco", "X", false, 1, 256, 0, "", infAdFisico));
        setInfCpl(new CampoValor(76, "Informações Complementares de interesse do Contribuinte", "X", false, 1, 5000, 0, "", infCpl));
    }

    public CampoValor getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(CampoValor tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public CampoValor getFatura() {
        return fatura;
    }

    public void setFatura(CampoValor fatura) {
        this.fatura = fatura;
    }

    public CampoValor getInfAdFisico() {
        return infAdFisico;
    }

    public void setInfAdFisico(CampoValor infAdFisico) {
        this.infAdFisico = infAdFisico;
    }

    public CampoValor getInfCpl() {
        return infCpl;
    }

    public void setInfCpl(CampoValor infCpl) {
        this.infCpl = infCpl;
    }

}
