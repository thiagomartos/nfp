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
public final class Valores {

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

    public Valores(String vBc, String vICMS, String vBCST, String vST, String vProd, String vFrete, String vSeg, String vDesc, String vIPI, String vOutro, String vNF, String vServ, String pISS, String vISS) {
        setTipoRegistro(new CampoValor(42, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '40' para indicar o tipo de registro", "40"));
        setvBc(new CampoValor(43, "Base de Cálculo do ICMS", "N", true, 15, 15, 2, "", vBc));
        setvICMS(new CampoValor(44, "Valor Total do ICMS", "N", true, 15, 15, 2, "", vICMS));
        setvBCST(new CampoValor(45, "Base de Cálculo do ICMS ST	", "N", true, 15, 15, 2, "Base de cálculo aplicada para a determinação do valor do ICMS retido por substituição tributária.", vBCST));
        setvST(new CampoValor(46, "Valor Total do ICMS ST", "N", true, 15, 15, 2, "", vST));
        setvProd(new CampoValor(47, "Valor Total dos produtos e serviços", "N", true, 15, 15, 2, "", vProd));
        setvFrete(new CampoValor(48, "Valor Total do Frete", "N", true, 15, 15, 2, "", vFrete));
        setvSeg(new CampoValor(49, "Valor Total do Seguro", "N", true, 15, 15, 2, "", vSeg));
        setvDesc(new CampoValor(50, "Valor Total do Desconto", "N", true, 15, 15, 2, "", vDesc));
        setvIPI(new CampoValor(51, "Valor Total do IPI", "N", true, 15, 15, 2, "", vIPI));
        setvOutro(new CampoValor(52, "Outras Despesas acessórias", "N", true, 15, 15, 2, "", vOutro));
        setvNF(new CampoValor(53, "Valor Total da NF", "N", true, 15, 15, 2, "", vNF));
        setvServ(new CampoValor(54, "Valor Total dos Serviços sob não-incidência ou não tributados pelo ICMS", "N", true, 15, 15, 2, "Informado somente se NF conjugada.", vServ));
        setpISS(new CampoValor(55, "Alíquota do ISS", "N", true, 5, 5, 2, "Informado somente se NF conjugada.", pISS));
        setvISS(new CampoValor(56, "Valor Total do ISS", "N", true, 15, 15, 2, "Informado somente se NF conjugada.", vISS));
    }

    public CampoValor getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(CampoValor tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public CampoValor getvBc() {
        return vBc;
    }

    public void setvBc(CampoValor vBc) {
        this.vBc = vBc;
    }

    public CampoValor getvICMS() {
        return vICMS;
    }

    public void setvICMS(CampoValor vICMS) {
        this.vICMS = vICMS;
    }

    public CampoValor getvBCST() {
        return vBCST;
    }

    public void setvBCST(CampoValor vBCST) {
        this.vBCST = vBCST;
    }

    public CampoValor getvST() {
        return vST;
    }

    public void setvST(CampoValor vST) {
        this.vST = vST;
    }

    public CampoValor getvProd() {
        return vProd;
    }

    public void setvProd(CampoValor vProd) {
        this.vProd = vProd;
    }

    public CampoValor getvFrete() {
        return vFrete;
    }

    public void setvFrete(CampoValor vFrete) {
        this.vFrete = vFrete;
    }

    public CampoValor getvSeg() {
        return vSeg;
    }

    public void setvSeg(CampoValor vSeg) {
        this.vSeg = vSeg;
    }

    public CampoValor getvDesc() {
        return vDesc;
    }

    public void setvDesc(CampoValor vDesc) {
        this.vDesc = vDesc;
    }

    public CampoValor getvIPI() {
        return vIPI;
    }

    public void setvIPI(CampoValor vIPI) {
        this.vIPI = vIPI;
    }

    public CampoValor getvOutro() {
        return vOutro;
    }

    public void setvOutro(CampoValor vOutro) {
        this.vOutro = vOutro;
    }

    public CampoValor getvNF() {
        return vNF;
    }

    public void setvNF(CampoValor vNF) {
        this.vNF = vNF;
    }

    public CampoValor getvServ() {
        return vServ;
    }

    public void setvServ(CampoValor vServ) {
        this.vServ = vServ;
    }

    public CampoValor getpISS() {
        return pISS;
    }

    public void setpISS(CampoValor pISS) {
        this.pISS = pISS;
    }

    public CampoValor getvISS() {
        return vISS;
    }

    public void setvISS(CampoValor vISS) {
        this.vISS = vISS;
    }
}
