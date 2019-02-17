/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Transporte.java
 * Criado em 17/02/2019 09:46:41 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public final class Transporte {

    private CampoValor tipoRegistro;
    private CampoValor modFrete;
    private CampoValor cnpj;
    private CampoValor xNome;
    private CampoValor IE;
    private CampoValor xEnder;
    private CampoValor xMun;
    private CampoValor UF;
    private CampoValor placa;
    private CampoValor UFPlaca;
    private CampoValor qVol;
    private CampoValor esp;
    private CampoValor marca;
    private CampoValor nVol;
    private CampoValor pesoL;
    private CampoValor pesoB;

    public Transporte(String modFrete, String cnpj, String xNome, String IE, String xEnder, String xMun, String UF, String placa, String UFPlaca, String qVol, String esp, String marca, String nVol, String pesoL, String pesoB) {
        setTipoRegistro(new CampoValor(57, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '50' para indicar o tipo de registro", "50"));
        setModFrete(new CampoValor(58, "Modalidade do frete", "N", false, 1, 1, 0, "0 – por conta do emitente;\n"
                + "1 – por conta do destinatário;", modFrete));
        setCnpj(new CampoValor(59, "CNPJ ou CPF", "X", false, 11, 14, 0, "Informar o CNPJ ou o CPF do Transportador, preenchendo com os zeros não significativos.\n"
                + "Preencher apenas com números, sem separadores.", cnpj));
        setxNome(new CampoValor(60, "Razão Social ou nome", "X", false, 1, 60, 0, "", xNome));
        setIE(new CampoValor(61, "Inscrição Estadual", "X", false, 2, 14, 0, "", IE));
        setxEnder(new CampoValor(62, "Endereço Completo", "X", false, 1, 60, 0, "", xEnder));
        setxMun(new CampoValor(63, "Nome do município", "X", false, 1, 60, 0, "", xMun));
        setUF(new CampoValor(64, "Sigla da UF", "X", false, 2, 2, 0, "", UF));
        setPlaca(new CampoValor(65, "Placa do Veículo", "X", false, 1, 8, 0, "", placa));
        setUFPlaca(new CampoValor(66, "Sigla da UF da Placa", "X", false, 2, 2, 0, "", UFPlaca));
        setqVol(new CampoValor(67, "Quantidade de volumes transportados", "N", false, 15, 15, 0, "", qVol));
        setEsp(new CampoValor(68, "Espécie dos volumes transportados", "X", false, 1, 60, 0, "", esp));
        setMarca(new CampoValor(69, "Marca dos volumes transportados", "X", false, 1, 60, 0, "", marca));
        setnVol(new CampoValor(70, "Numeração dos volumes transportados", "X", false, 1, 60, 0, "", nVol));
        setPesoL(new CampoValor(71, "Peso Líquido (em kg)", "N", false, 15, 15, 3, "", pesoL));
        setPesoB(new CampoValor(72, "Peso Bruto (em kg)", "N", false, 15, 15, 3, "", pesoB));
    }

    public CampoValor getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(CampoValor tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public CampoValor getModFrete() {
        return modFrete;
    }

    public void setModFrete(CampoValor modFrete) {
        this.modFrete = modFrete;
    }

    public CampoValor getCnpj() {
        return cnpj;
    }

    public void setCnpj(CampoValor cnpj) {
        this.cnpj = cnpj;
    }

    public CampoValor getxNome() {
        return xNome;
    }

    public void setxNome(CampoValor xNome) {
        this.xNome = xNome;
    }

    public CampoValor getIE() {
        return IE;
    }

    public void setIE(CampoValor IE) {
        this.IE = IE;
    }

    public CampoValor getxEnder() {
        return xEnder;
    }

    public void setxEnder(CampoValor xEnder) {
        this.xEnder = xEnder;
    }

    public CampoValor getxMun() {
        return xMun;
    }

    public void setxMun(CampoValor xMun) {
        this.xMun = xMun;
    }

    public CampoValor getUF() {
        return UF;
    }

    public void setUF(CampoValor UF) {
        this.UF = UF;
    }

    public CampoValor getPlaca() {
        return placa;
    }

    public void setPlaca(CampoValor placa) {
        this.placa = placa;
    }

    public CampoValor getUFPlaca() {
        return UFPlaca;
    }

    public void setUFPlaca(CampoValor UFPlaca) {
        this.UFPlaca = UFPlaca;
    }

    public CampoValor getqVol() {
        return qVol;
    }

    public void setqVol(CampoValor qVol) {
        this.qVol = qVol;
    }

    public CampoValor getEsp() {
        return esp;
    }

    public void setEsp(CampoValor esp) {
        this.esp = esp;
    }

    public CampoValor getMarca() {
        return marca;
    }

    public void setMarca(CampoValor marca) {
        this.marca = marca;
    }

    public CampoValor getnVol() {
        return nVol;
    }

    public void setnVol(CampoValor nVol) {
        this.nVol = nVol;
    }

    public CampoValor getPesoL() {
        return pesoL;
    }

    public void setPesoL(CampoValor pesoL) {
        this.pesoL = pesoL;
    }

    public CampoValor getPesoB() {
        return pesoB;
    }

    public void setPesoB(CampoValor pesoB) {
        this.pesoB = pesoB;
    }

}
