/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Itens.java
 * Criado em 17/02/2019 09:47:03 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public final class Itens {

    private CampoValor tipoRegistro;
    private CampoValor cProd;
    private CampoValor xProd;
    private CampoValor NCM;
    private CampoValor uCom;
    private CampoValor qCom;
    private CampoValor vUnCom;
    private CampoValor vProd;
    private CampoValor CST;
    private CampoValor pICMS;
    private CampoValor pIPI;
    private CampoValor vIPI;

    public Itens(String cProd, String xProd, String NCM, String uCom, String qCom, String vUnCom, String vProd, String CST, String pICMS, String pIPI, String vIPI) {
        setTipoRegistro(new CampoValor(30, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '30' para indicar o tipo de registro", "30"));
        setcProd(new CampoValor(31, "Código do produto ou serviço", "X", false, 1, 60, 0, "Preencher com o código do produto ou serviço.", cProd));
        setxProd(new CampoValor(32, "Descrição do produto ou serviço", "X", true, 1, 120, 0, "Nome, marca, tipo, modelo, série, espécie, qualidade e demais elementos que permitam sua perfeita identificação. Deve conter também os demais “CFOP” não informados no campo “CFOP”, na hipótese de o documento fiscal conter mais de um “CFOP”, conforme previsto no artigo 127, § 19, do RICMS/2000.", xProd));
        setNCM(new CampoValor(33, "Código NCM", "X", false, 8, 8, 0, "Para mercadorias e produtos, preencher de acordo com a Tabela de Capítulos da NCM. Para serviços, não preencher o campo.", NCM));
        setuCom(new CampoValor(34, "Unidade Comercial", "X", true, 1, 6, 0, "Informar a unidade de comercialização da mercadoria / produto.", uCom));
        setqCom(new CampoValor(35, "Quantidade Comercial", "N", true, 12, 12, 4, "Informar a quantidade de comercialização da mercadoria / produto.", qCom));
        setvUnCom(new CampoValor(36, "Valor Unitário de comercialização", "N", true, 16, 16, 4, "Informar o valor unitário de comercialização da mercadoria / produto", vUnCom));
        setvProd(new CampoValor(37, "Valor Total Bruto dos Produtos ou Serviços", "N", true, 15, 15, 2, "", vProd));
        setCST(new CampoValor(38, "Código da Situação Tributária", "N", true, 3, 3, 0, "Código da Situação Tributária:\n"
                + "1º Dígito: Origem da mercadoria\n"
                + "\n"
                + "0 - Nacional, exceto asindicadas nos códigos 3, 4, 5 e 8;\n"
                + "\n"
                + "1 - Estrangeira -Importação direta;\n"
                + "\n"
                + "2 - Estrangeira -Adquirida no mercado interno;\n"
                + "\n"
                + "3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40% (quarenta por cento) e inferior ou igual a 70% (setenta por cento)\n"
                + "\n"
                + "4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam o Decreto-Lei nº 288/67, e as Leis nºs 8.248/91, 8.387/91,10.176/01 e 11.484/07;\n"
                + "\n"
                + "5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40% (quarenta por cento);\n"
                + "\n"
                + "6 - Estrangeira -Importação direta, sem similar nacional, constante em lista de Resolução CAMEX;\n"
                + "\n"
                + "7 - Estrangeira -Adquirida no mercado interno, sem similar nacional, constante em lista de Resolução CAMEX;\n"
                + "\n"
                + "8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70% (setenta por cento).\n"
                + "\n"
                + "2º e 3º Dígitos:\n"
                + "\n"
                + "Tributação pelo ICMS\n"
                + "\n"
                + "00 - Tributada integralmente;\n"
                + "\n"
                + "10 - Tributada e com cobrança de ICMS por substituição tributária;\n"
                + "\n"
                + "20 - Com redução de base de cálculo;\n"
                + "\n"
                + "30 - Isenta ou não tributada e com cobrança do ICMS por substituição tributária;\n"
                + "\n"
                + "40 - Isenta;\n"
                + "\n"
                + "41 - Não tributada;\n"
                + "\n"
                + "50 - Suspensão;\n"
                + "\n"
                + "51 - Diferimento;\n"
                + "\n"
                + "60 - ICMS cobrado anteriormente por substituição tributária;\n"
                + "\n"
                + "70 - Com redução de base de cálculo e cobrança de ICMS substituição tributária;\n"
                + "\n"
                + "90 - Outras.", CST));
        setpICMS(new CampoValor(39, "Alíquota do imposto ICMS", "N", true, 5, 5, 2, "", pICMS));
        setpIPI(new CampoValor(40, "Alíquota do IPI", "N", false, 5, 5, 2, "", pIPI));
        setvIPI(new CampoValor(41, "Valor do IPI", "N", false, 15, 15, 2, "", vIPI));
    }

    public CampoValor getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(CampoValor tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public CampoValor getcProd() {
        return cProd;
    }

    public void setcProd(CampoValor cProd) {
        this.cProd = cProd;
    }

    public CampoValor getxProd() {
        return xProd;
    }

    public void setxProd(CampoValor xProd) {
        this.xProd = xProd;
    }

    public CampoValor getNCM() {
        return NCM;
    }

    public void setNCM(CampoValor NCM) {
        this.NCM = NCM;
    }

    public CampoValor getuCom() {
        return uCom;
    }

    public void setuCom(CampoValor uCom) {
        this.uCom = uCom;
    }

    public CampoValor getqCom() {
        return qCom;
    }

    public void setqCom(CampoValor qCom) {
        this.qCom = qCom;
    }

    public CampoValor getvUnCom() {
        return vUnCom;
    }

    public void setvUnCom(CampoValor vUnCom) {
        this.vUnCom = vUnCom;
    }

    public CampoValor getvProd() {
        return vProd;
    }

    public void setvProd(CampoValor vProd) {
        this.vProd = vProd;
    }

    public CampoValor getCST() {
        return CST;
    }

    public void setCST(CampoValor CST) {
        this.CST = CST;
    }

    public CampoValor getpICMS() {
        return pICMS;
    }

    public void setpICMS(CampoValor pICMS) {
        this.pICMS = pICMS;
    }

    public CampoValor getpIPI() {
        return pIPI;
    }

    public void setpIPI(CampoValor pIPI) {
        this.pIPI = pIPI;
    }

    public CampoValor getvIPI() {
        return vIPI;
    }

    public void setvIPI(CampoValor vIPI) {
        this.vIPI = vIPI;
    }

}
