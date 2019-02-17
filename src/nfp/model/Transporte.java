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
public class Transporte {

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

    public Transporte(CampoValor tipoRegistro, CampoValor modFrete, CampoValor cnpj, CampoValor xNome, CampoValor IE, CampoValor xEnder, CampoValor xMun, CampoValor UF, CampoValor placa, CampoValor UFPlaca, CampoValor qVol, CampoValor nVol, CampoValor pesoL, CampoValor pesoB) {
        this.tipoRegistro = tipoRegistro;
        this.modFrete = modFrete;
        this.cnpj = cnpj;
        this.xNome = xNome;
        this.IE = IE;
        this.xEnder = xEnder;
        this.xMun = xMun;
        this.UF = UF;
        this.placa = placa;
        this.UFPlaca = UFPlaca;
        this.qVol = qVol;
        this.nVol = nVol;
        this.pesoL = pesoL;
        this.pesoB = pesoB;
    }

    public CampoValor getTipoRegistro() {
        if (tipoRegistro == null) {
            setTipoRegistro("");
        }
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        CampoValor cv = new CampoValor(57, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '50' para indicar o tipo de registro", tipoRegistro);
        this.tipoRegistro = cv;
    }

    public CampoValor getModFrete() {
        if (modFrete == null) {
            setModFrete("");
        }
        return modFrete;
    }

    public void setModFrete(String modFrete) {
        CampoValor cv = new CampoValor(58, "Modalidade do frete", "N", false, 1, 1, 0, "0 – por conta do emitente;\n"
                + "1 – por conta do destinatário;", modFrete);
        this.modFrete = cv;
    }

    public CampoValor getCnpj() {
        if (cnpj == null) {
            setCnpj("");
        }
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        CampoValor cv = new CampoValor(59, "CNPJ ou CPF", "X", false, 11, 14, 0, "Informar o CNPJ ou o CPF do Transportador, preenchendo com os zeros não significativos.\n"
                + "Preencher apenas com números, sem separadores.", cnpj);
        this.cnpj = cv;
    }

    public CampoValor getxNome() {
        if (xNome == null) {
            setxNome("");
        }
        return xNome;
    }

    public void setxNome(String xNome) {
        CampoValor cv = new CampoValor(60, "Razão Social ou nome", "X", false, 1, 60, 0, "", xNome);
        this.xNome = cv;
    }

    public CampoValor getIE() {
        if (IE == null) {
            setIE("");
        }
        return IE;
    }

    public void setIE(String IE) {
        CampoValor cv = new CampoValor(61, "Inscrição Estadual", "X", false, 2, 14, 0, "", IE);
        this.IE = cv;
    }

    public CampoValor getxEnder() {
        if (xEnder == null) {
            setxEnder("");
        }
        return xEnder;
    }

    public void setxEnder(String xEnder) {
        CampoValor cv = new CampoValor(62, "Endereço Completo", "X", false, 1, 60, 0, "", xEnder);
        this.xEnder = cv;
    }

    public CampoValor getxMun() {
        if (xMun == null) {
            setxMun("");
        }
        return xMun;
    }

    public void setxMun(String xMun) {
        CampoValor cv = new CampoValor(63, "Nome do município", "X", false, 1, 60, 0, "", xMun);
        this.xMun = cv;
    }

    public CampoValor getUF() {
        if (UF == null) {
            setUF("");
        }
        return UF;
    }

    public void setUF(String UF) {
        CampoValor cv = new CampoValor(64, "Sigla da UF", "X", false, 2, 2, 0, "", UF);
        this.UF = cv;
    }

    public CampoValor getPlaca() {
        if (placa == null) {
            setPlaca("");
        }
        return placa;
    }

    public void setPlaca(String placa) {
        CampoValor cv = new CampoValor(65, "Placa do Veículo", "X", false, 1, 8, 0, "", placa);
        this.placa = cv;
    }

    public CampoValor getUFPlaca() {
        if (UFPlaca == null) {
            setUFPlaca("");
        }
        return UFPlaca;
    }

    public void setUFPlaca(String UFPlaca) {
        CampoValor cv = new CampoValor(66, "Sigla da UF da Placa", "X", false, 2, 2, 0, "", UFPlaca);
        this.UFPlaca = cv;
    }

    public CampoValor getqVol() {
        if (qVol == null) {
            setqVol("");
        }
        return qVol;
    }

    public void setqVol(String qVol) {
        CampoValor cv = new CampoValor(67, "Quantidade de volumes transportados", "N", false, 15, 15, 0, "", qVol);
        this.qVol = cv;
    }

    public CampoValor getEsp() {
        if (esp == null) {
            setEsp("");
        }
        return esp;
    }

    public void setEsp(String esp) {
        CampoValor cv = new CampoValor(68, "Espécie dos volumes transportados", "X", false, 1, 60, 0, "", esp);
        this.esp = cv;
    }

    public CampoValor getMarca() {
        if (marca == null) {
            setMarca("");
        }
        return marca;
    }

    public void setMarca(String marca) {
        CampoValor cv = new CampoValor(69, "Marca dos volumes transportados", "X", false, 1, 60, 0, "", marca);
        this.marca = cv;
    }

    public CampoValor getnVol() {
        if (nVol == null) {
            setnVol("");
        }
        return nVol;
    }

    public void setnVol(String nVol) {
        CampoValor cv = new CampoValor(70, "Numeração dos volumes transportados", "X", false, 1, 60, 0, "", nVol);
        this.nVol = cv;
    }

    public CampoValor getPesoL() {
        if (pesoL == null) {
            setPesoL("");
        }
        return pesoL;
    }

    public void setPesoL(String pesoL) {
        CampoValor cv = new CampoValor(71, "Peso Líquido (em kg)", "N", false, 15, 15, 3, "", pesoL);
        this.pesoL = cv;
    }

    public CampoValor getPesoB() {
        if (pesoB == null) {
            setPesoB("");
        }
        return pesoB;
    }

    public void setPesoB(String pesoB) {
        CampoValor cv = new CampoValor(72, "Peso Bruto (em kg)", "N", false, 15, 15, 3, "", pesoB);
        this.pesoB = cv;
    }

}
