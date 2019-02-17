/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Valores.java
 * Criado em 17/02/2019 09:46:57 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public class Valores {

    private CampoValor tipoRegistro;
    private CampoValor vBc;
    private CampoValor vICMS;
    private CampoValor vBCST;
    private CampoValor vST;
    private CampoValor vProd;
    private CampoValor vFrete;
    private CampoValor vSeg;
    private CampoValor vDesc;
    private CampoValor vIPI;
    private CampoValor vOutro;
    private CampoValor vNF;
    private CampoValor vServ;
    private CampoValor pISS;
    private CampoValor vISS;

    public Valores(CampoValor tipoRegistro, CampoValor vBc, CampoValor vICMS, CampoValor vBCST, CampoValor vST, CampoValor vProd, CampoValor vFrete, CampoValor vSeg, CampoValor vDesc, CampoValor vIPI, CampoValor vOutro, CampoValor vNF, CampoValor vServ, CampoValor pISS, CampoValor vISS) {
        this.tipoRegistro = tipoRegistro;
        this.vBc = vBc;
        this.vICMS = vICMS;
        this.vBCST = vBCST;
        this.vST = vST;
        this.vProd = vProd;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vIPI = vIPI;
        this.vOutro = vOutro;
        this.vNF = vNF;
        this.vServ = vServ;
        this.pISS = pISS;
        this.vISS = vISS;
    }

    public CampoValor getTipoRegistro() {
        if (tipoRegistro == null) {
            setTipoRegistro("");
        }
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        CampoValor cv = new CampoValor(42, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '40' para indicar o tipo de registro", tipoRegistro);
        this.tipoRegistro = cv;
    }

    public CampoValor getvBc() {
        if (vBc == null) {
            setvBc("");
        }
        return vBc;
    }

    public void setvBc(String vBc) {
        CampoValor cv = new CampoValor(43, "Base de Cálculo do ICMS", "N", true, 15, 15, 2, "", vBc);
        this.vBc = cv;
    }

    public CampoValor getvICMS() {
        if (vICMS == null) {
            setvICMS("");
        }
        return vICMS;
    }

    public void setvICMS(String vICMS) {
        CampoValor cv = new CampoValor(44, "Valor Total do ICMS", "N", true, 15, 15, 2, "", vICMS);
        this.vICMS = cv;
    }

    public CampoValor getvBCST() {
        if (vBCST == null) {
            setvBCST("");
        }
        return vBCST;
    }

    public void setvBCST(String vBCST) {
        CampoValor cv = new CampoValor(45, "Base de Cálculo do ICMS ST	", "N", true, 15, 15, 2, "Base de cálculo aplicada para a determinação do valor do ICMS retido por substituição tributária.", vBCST);
        this.vBCST = cv;
    }

    public CampoValor getvST() {
        if (vST == null) {
            setvST("");
        }
        return vST;
    }

    public void setvST(String vST) {
        CampoValor cv = new CampoValor(46, "Valor Total do ICMS ST", "N", true, 15, 15, 2, "", vST);
        this.vST = cv;
    }

    public CampoValor getvProd() {
        if (vProd == null) {
            setvProd("");
        }
        return vProd;
    }

    public void setvProd(String vProd) {
        CampoValor cv = new CampoValor(47, "Valor Total dos produtos e serviços", "N", true, 15, 15, 2, "", vProd);
        this.vProd = cv;
    }

    public CampoValor getvFrete() {
        if (vFrete == null) {
            setvFrete("");
        }
        return vFrete;
    }

    public void setvFrete(String vFrete) {
        CampoValor cv = new CampoValor(48, "Valor Total do Frete", "N", true, 15, 15, 2, "", vFrete);
        this.vFrete = cv;
    }

    public CampoValor getvSeg() {
        if (vSeg == null) {
            setvSeg("");
        }
        return vSeg;
    }

    public void setvSeg(String vSeg) {
        CampoValor cv = new CampoValor(49, "Valor Total do Seguro", "N", true, 15, 15, 2, "", vSeg);
        this.vSeg = cv;
    }

    public CampoValor getvDesc() {
        if (vDesc == null) {
            setvDesc("");
        }
        return vDesc;
    }

    public void setvDesc(String vDesc) {
        CampoValor cv = new CampoValor(50, "Valor Total do Desconto", "N", true, 15, 15, 2, "", vDesc);
        this.vDesc = cv;
    }

    public CampoValor getvIPI() {
        if (vIPI == null) {
            setvIPI("");
        }
        return vIPI;
    }

    public void setvIPI(String vIPI) {
        CampoValor cv = new CampoValor(51, "Valor Total do IPI", "N", true, 15, 15, 2, "", vIPI);
        this.vIPI = cv;
    }

    public CampoValor getvOutro() {
        if (vOutro == null) {
            setvOutro("");
        }
        return vOutro;
    }

    public void setvOutro(String vOutro) {
        CampoValor cv = new CampoValor(52, "Outras Despesas acessórias", "N", true, 15, 15, 2, "", vOutro);
        this.vOutro = cv;
    }

    public CampoValor getvNF() {
        if (vNF == null) {
            setvNF("");
        }
        return vNF;
    }

    public void setvNF(String vNF) {
        CampoValor cv = new CampoValor(53, "Valor Total da NF", "N", true, 15, 15, 2, "", vNF);
        this.vNF = cv;
    }

    public CampoValor getvServ() {
        if (vServ == null) {
            setvServ("");
        }
        return vServ;
    }

    public void setvServ(String vServ) {
        CampoValor cv = new CampoValor(54, "Valor Total dos Serviços sob não-incidência ou não tributados pelo ICMS", "N", true, 15, 15, 2, "Informado somente se NF conjugada.", vServ);
        this.vServ = cv;
    }

    public CampoValor getpISS() {
        if (pISS == null) {
            setpISS("");
        }
        return pISS;
    }

    public void setpISS(String pISS) {
        CampoValor cv = new CampoValor(55, "Alíquota do ISS", "N", true, 5, 5, 2, "Informado somente se NF conjugada.", pISS);
        this.pISS = cv;
    }

    public CampoValor getvISS() {
        if (vISS == null) {
            setvISS("");
        }
        return vISS;
    }

    public void setvISS(String vISS) {
        CampoValor cv = new CampoValor(56, "Valor Total do ISS", "N", true, 15, 15, 2, "Informado somente se NF conjugada.", vISS);
        this.vISS = cv;
    }
}
