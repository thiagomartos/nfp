/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Rodape.java
 * Criado em 17/02/2019 09:45:44 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public final class Rodape {

    private CampoValor tipoRegistro;
    private CampoValor qtde20;
    private CampoValor qtde30;
    private CampoValor qtde40;
    private CampoValor qtde50;
    private CampoValor qtde60;

    public Rodape(String qtde20, String qtde30, String qtde40, String qtde50, String qtde60) {
        setTipoRegistro(new CampoValor(77, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '90' para indicar o tipo de registro", "90"));
        setQtde20(new CampoValor(78, "Quantidade de registros tipo 20", "N", true, 5, 5, 0, "Indicar total de registros tipo 20 existentes no arquivo", qtde20));
        setQtde30(new CampoValor(79, "Quantidade de registros tipo 30", "N", true, 5, 5, 0, "Indicar total de registros tipo 30 existentes no arquivo", qtde30));
        setQtde40(new CampoValor(80, "Quantidade de registros tipo 40", "N", true, 5, 5, 0, "Indicar total de registros tipo 40 existentes no arquivo", qtde40));
        setQtde50(new CampoValor(81, "Quantidade de registros tipo 50", "N", true, 5, 5, 0, "Indicar total de registros tipo 50 existentes no arquivo", qtde50));
        setQtde60(new CampoValor(82, "Quantidade de registros tipo 60", "N", true, 5, 5, 0, "Indicar total de registros tipo 60 existentes no arquivo", qtde60));
    }

    public CampoValor getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(CampoValor tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public CampoValor getQtde20() {
        return qtde20;
    }

    public void setQtde20(CampoValor qtde20) {
        this.qtde20 = qtde20;
    }

    public CampoValor getQtde30() {
        return qtde30;
    }

    public void setQtde30(CampoValor qtde30) {
        this.qtde30 = qtde30;
    }

    public CampoValor getQtde40() {
        return qtde40;
    }

    public void setQtde40(CampoValor qtde40) {
        this.qtde40 = qtde40;
    }

    public CampoValor getQtde50() {
        return qtde50;
    }

    public void setQtde50(CampoValor qtde50) {
        this.qtde50 = qtde50;
    }

    public CampoValor getQtde60() {
        return qtde60;
    }

    public void setQtde60(CampoValor qtde60) {
        this.qtde60 = qtde60;
    }

}
