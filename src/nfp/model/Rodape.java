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
public class Rodape {

    private CampoValor tipoRegistro;
    private CampoValor qtde20;
    private CampoValor qtde30;
    private CampoValor qtde40;
    private CampoValor qtde50;
    private CampoValor qtde60;

    public Rodape(CampoValor tipoRegistro, CampoValor qtde20, CampoValor qtde30, CampoValor qtde40, CampoValor qtde50, CampoValor qtde60) {
        this.tipoRegistro = tipoRegistro;
        this.qtde20 = qtde20;
        this.qtde30 = qtde30;
        this.qtde40 = qtde40;
        this.qtde50 = qtde50;
        this.qtde60 = qtde60;
    }

    public CampoValor getTipoRegistro() {
        if (tipoRegistro == null) {
            setTipoRegistro("");
        }
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        CampoValor cv = new CampoValor(77, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '90' para indicar o tipo de registro", tipoRegistro);
        this.tipoRegistro = cv;
    }

    public CampoValor getQtde20() {
        if (qtde20 == null) {
            setQtde20("");
        }
        return qtde20;
    }

    public void setQtde20(String qtde20) {
        CampoValor cv = new CampoValor(78, "Quantidade de registros tipo 20", "N", true, 5, 5, 0, "Indicar total de registros tipo 20 existentes no arquivo", qtde20);
        this.qtde20 = cv;
    }

    public CampoValor getQtde30() {
        if (qtde30 == null) {
            setQtde30("");
        }
        return qtde30;
    }

    public void setQtde30(String qtde30) {
        CampoValor cv = new CampoValor(79, "Quantidade de registros tipo 30", "N", true, 5, 5, 0, "Indicar total de registros tipo 30 existentes no arquivo", qtde30);
        this.qtde30 = cv;
    }

    public CampoValor getQtde40() {
        if (qtde40 == null) {
            setQtde40("");
        }
        return qtde40;
    }

    public void setQtde40(String qtde40) {
        CampoValor cv = new CampoValor(80, "Quantidade de registros tipo 40", "N", true, 5, 5, 0, "Indicar total de registros tipo 40 existentes no arquivo", qtde40);
        this.qtde40 = cv;
    }

    public CampoValor getQtde50() {
        if (qtde50 == null) {
            setQtde50("");
        }
        return qtde50;
    }

    public void setQtde50(String qtde50) {
        CampoValor cv = new CampoValor(81, "Quantidade de registros tipo 50", "N", true, 5, 5, 0, "Indicar total de registros tipo 50 existentes no arquivo", qtde50);
        this.qtde50 = cv;
    }

    public CampoValor getQtde60() {
        if (qtde60 == null) {
            setQtde60("");
        }
        return qtde60;
    }

    public void setQtde60(String qtde60) {
        CampoValor cv = new CampoValor(82, "Quantidade de registros tipo 60", "N", true, 5, 5, 0, "Indicar total de registros tipo 60 existentes no arquivo", qtde60);
        this.qtde60 = cv;
    }

}
