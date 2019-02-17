/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Identificacao.java
 * Criado em 17/02/2019 09:47:12 por Thiago Martos
 * 
 */
package nfp.model;

/**
 *
 * @author Thiago Martos
 */
public class Identificacao {

    private CampoValor tipoRegistro;
    private CampoValor funcao;
    private CampoValor xJust;
    private CampoValor natOp;
    private CampoValor serie;
    private CampoValor nNF;
    private CampoValor dEmi;
    private CampoValor dSaiEnt;
    private CampoValor tpNF;
    private CampoValor CFOP;
    private CampoValor IEST;
    private CampoValor IM;
    private CampoValor cnpj;
    private CampoValor xNome;
    private CampoValor xLgr;
    private CampoValor nro;
    private CampoValor xCpl;
    private CampoValor xBairro;
    private CampoValor xMun;
    private CampoValor UF;
    private CampoValor CEP;
    private CampoValor xPais;
    private CampoValor fone;
    private CampoValor IE;

    public Identificacao(CampoValor tipoRegistro, CampoValor funcao, CampoValor xJust, CampoValor natOp, CampoValor serie, CampoValor nNF, CampoValor dEmi, CampoValor dSaiEnt, CampoValor tpNF, CampoValor CFOP, CampoValor IEST, CampoValor IM, CampoValor cnpj, CampoValor xNome, CampoValor xLgr, CampoValor nro, CampoValor xCpl, CampoValor xBairro, CampoValor xMun, CampoValor UF, CampoValor CEP, CampoValor xPais, CampoValor fone, CampoValor IE) {
        this.tipoRegistro = tipoRegistro;
        this.funcao = funcao;
        this.xJust = xJust;
        this.natOp = natOp;
        this.serie = serie;
        this.nNF = nNF;
        this.dEmi = dEmi;
        this.dSaiEnt = dSaiEnt;
        this.tpNF = tpNF;
        this.CFOP = CFOP;
        this.IEST = IEST;
        this.IM = IM;
        this.cnpj = cnpj;
        this.xNome = xNome;
        this.xLgr = xLgr;
        this.nro = nro;
        this.xCpl = xCpl;
        this.xBairro = xBairro;
        this.xMun = xMun;
        this.UF = UF;
        this.CEP = CEP;
        this.xPais = xPais;
        this.fone = fone;
        this.IE = IE;
    }

    public CampoValor getTipoRegistro() {
        if (tipoRegistro == null) {
            setTipoRegistro("");
        }
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        CampoValor cv = new CampoValor(6, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '20' para indicar o tipo de registro", tipoRegistro);
        this.tipoRegistro = cv;
    }

    public CampoValor getFuncao() {
        if (funcao == null) {
            setFuncao("");
        }
        return funcao;
    }

    public void setFuncao(String funcao) {
        CampoValor cv = new CampoValor(7, "Função do Registro", "X", true, 1, 1, 0, "Informar conforme a função do registro:\n"
                + "I – Inclusão do registro da NF\n"
                + "\n"
                + "R – Retificação do registro da NF\n"
                + "\n"
                + "C – Cancelamento da NF", funcao);
        this.funcao = cv;
    }

    public CampoValor getxJust() {
        if (xJust == null) {
            setxJust("");
        }
        return xJust;
    }

    public void setxJust(String xJust) {
        CampoValor cv = new CampoValor(8, "Justificativa do Cancelamento", "X", true, 15, 255, 0, "Informar a justificativa do cancelamento. Campo obrigatório se campo 7 (Função do Registro) for igual a “C”.", xJust);
        this.xJust = cv;
    }

    public CampoValor getNatOp() {
        if (natOp == null) {
            setNatOp("");
        }
        return natOp;
    }

    public void setNatOp(String natOp) {
        CampoValor cv = new CampoValor(9, "Descrição da Natureza da Operação", "X", true, 1, 60, 0, "Informar a natureza da operação da qual decorreu a saída ou a entrada, tais como: venda, compra, transferência, devolução, importação, consignação, remessa (para fins de demonstração, de industrialização ou outra), conforme previsto na alínea 'i', inciso I, art. 19 do CONVÊNIO S/Nº, de 15 de dezembro de 1970.", natOp);
        this.natOp = cv;
    }

    public CampoValor getSerie() {
        if (serie == null) {
            setSerie("");
        }
        return serie;
    }

    public void setSerie(String serie) {
        CampoValor cv = new CampoValor(10, "Série da Nota Fiscal", "N", true, 1, 3, 0, "Série da Nota Fiscal. Informar 0 (zero) para série única.", serie);
        this.serie = cv;
    }

    public CampoValor getnNF() {
        if (nNF == null) {
            setnNF("");
        }
        return nNF;
    }

    public void setnNF(String nNF) {
        CampoValor cv = new CampoValor(11, "Número da Nota Fiscal", "N", true, 1, 9, 0, "Número da Nota Fiscal.", nNF);
        this.nNF = cv;
    }

    public CampoValor getdEmi() {
        if (dEmi == null) {
            setdEmi("");
        }
        return dEmi;
    }

    public void setdEmi(String dEmi) {
        CampoValor cv = new CampoValor(12, "Data de emissão da Nota Fiscal", "D", true, 0, 0, 0, "Formato “DD/MM/AAAA HH:MM:SS” ; Hora: 0 a 23", dEmi);
        this.dEmi = cv;
    }

    public CampoValor getdSaiEnt() {
        if (dSaiEnt == null) {
            setdSaiEnt("");
        }
        return dSaiEnt;
    }

    public void setdSaiEnt(String dSaiEnt) {
        CampoValor cv = new CampoValor(13, "Data de Saída ou da Entrada da Mercadoria / Produto / Serviço", "D", false, 0, 0, 0, "Formato “DD/MM/AAAA HH:MM:SS ”.", dSaiEnt);
        this.dSaiEnt = cv;
    }

    public CampoValor getTpNF() {
        if (tpNF == null) {
            setTpNF("");
        }
        return tpNF;
    }

    public void setTpNF(String tpNF) {
        CampoValor cv = new CampoValor(14, "Tipo da Nota Fiscal", "N", true, 1, 1, 0, "0-entrada / 1-saída", tpNF);
        this.tpNF = cv;
    }

    public CampoValor getCFOP() {
        if (CFOP == null) {
            setCFOP("");
        }
        return CFOP;
    }

    public void setCFOP(String CFOP) {
        CampoValor cv = new CampoValor(15, "Código Fiscal de Operações e Prestações", "N", true, 4, 4, 0, "Utilizar Tabela de CFOP prevista no Anexo V do RICMS aprovado pelo decreto 45.490 de 30/11/2000 - Convênio s/nº de 15 de dezembro de 1970. Na hipótese de o documento fiscal conter mais de um Código Fiscal de Operações ou Prestação – CFOP, nesse campo deverá ser informado apenas o “CFOP” do item de maior valor; os demais “CFOP” deverão ser informados no campo “Descrição do produto ou serviço” conforme previsto no artigo 127, § 19, do RICMS/2000.", CFOP);
        this.CFOP = cv;
    }

    public CampoValor getIEST() {
        if (IEST == null) {
            setIEST("");
        }
        return IEST;
    }

    public void setIEST(String IEST) {
        CampoValor cv = new CampoValor(16, "IE do Substituto Tributário na UF de destino", "X", false, 2, 14, 0, "Informar a IE do substituto tributário na UF de destino da mercadoria conforme previsto no artigo 127, inciso I, alínea “ l ” e § 5º do RICMS/2000. Preencher apenas com números, sem separadores.", IEST);
        this.IEST = cv;
    }

    public CampoValor getIM() {
        if (IM == null) {
            setIM("");
        }
        return IM;
    }

    public void setIM(String IM) {
        CampoValor cv = new CampoValor(17, "Inscrição Municipal do Emitente", "X", false, 1, 15, 0, "Este campo deve ser informado quando ocorrer a emissão de NF-e conjugada, com prestação de serviços sujeitos ao ISSQN e fornecimento sujeito ao ICMS. Deve ser preenchido apenas com números, sem separadores.", IM);
        this.IM = cv;
    }

    public CampoValor getCnpj() {
        if (cnpj == null) {
            setCnpj("");
        }
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        CampoValor cv = new CampoValor(18, "CNPJ ou CPF do destinatário ou do remetente", "X", false, 11, 14, 0, "Informar o CNPJ ou o CPF do destinatário ou do remetente, preenchendo com os zeros não significativos.\n"
                + "Deve ser preenchido apenas com números, sem separadores.\n"
                + "\n"
                + "Não informar se a operação for realizada com o exterior.\n"
                + "\n"
                + "Caso a operação seja de entrada, os dados devem se referir ao remetente.", cnpj);
        this.cnpj = cv;
    }

    public CampoValor getxNome() {
        if (xNome == null) {
            setxNome("");
        }
        return xNome;
    }

    public void setxNome(String xNome) {
        CampoValor cv = new CampoValor(19, "Razão Social ou nome do destinatário ou do remetente", "X", true, 1, 60, 0, "", xNome);
        this.xNome = cv;
    }

    public CampoValor getxLgr() {
        if (xLgr == null) {
            setxLgr("");
        }
        return xLgr;
    }

    public void setxLgr(String xLgr) {
        CampoValor cv = new CampoValor(20, "Logradouro", "X", true, 1, 60, 0, "", xLgr);
        this.xLgr = cv;
    }

    public CampoValor getNro() {
        if (nro == null) {
            setNro("");
        }
        return nro;
    }

    public void setNro(String nro) {
        CampoValor cv = new CampoValor(21, "Número", "X", true, 1, 60, 0, "", nro);
        this.nro = cv;
    }

    public CampoValor getxCpl() {
        if (xCpl == null) {
            setxCpl("");
        }
        return xCpl;
    }

    public void setxCpl(String xCpl) {
        CampoValor cv = new CampoValor(22, "Complemento", "X", false, 1, 60, 0, "", xCpl);
        this.xCpl = cv;
    }

    public CampoValor getxBairro() {
        if (xBairro == null) {
            setxBairro("");
        }
        return xBairro;
    }

    public void setxBairro(String xBairro) {
        CampoValor cv = new CampoValor(23, "Bairro", "X", true, 1, 60, 0, "", xBairro);
        this.xBairro = cv;
    }

    public CampoValor getxMun() {
        if (xMun == null) {
            setxMun("");
        }
        return xMun;
    }

    public void setxMun(String xMun) {
        CampoValor cv = new CampoValor(24, "Nome do município", "X", true, 1, 60, 0, "Informar “EXTERIOR” para operações com o exterior.", xMun);
        this.xMun = cv;
    }

    public CampoValor getUF() {
        if (UF == null) {
            setUF("");
        }
        return UF;
    }

    public void setUF(String UF) {
        CampoValor cv = new CampoValor(25, "Sigla da UF", "X", true, 2, 2, 0, "Informar “EX” para operações com o exterior.", UF);
        this.UF = cv;
    }

    public CampoValor getCEP() {
        if (CEP == null) {
            setCEP("");
        }
        return CEP;
    }

    public void setCEP(String CEP) {
        CampoValor cv = new CampoValor(26, "Código do CEP", "N", false, 8, 8, 0, "Informar os zeros não significativos. Preencher apenas com números, sem separadores.", CEP);
        this.CEP = cv;
    }

    public CampoValor getxPais() {
        if (xPais == null) {
            setxPais("");
        }
        return xPais;
    }

    public void setxPais(String xPais) {
        CampoValor cv = new CampoValor(27, "Nome do País", "X", false, 1, 60, 0, "", xPais);
        this.xPais = cv;
    }

    public CampoValor getFone() {
        if (fone == null) {
            setFone("");
        }
        return fone;
    }

    public void setFone(String fone) {
        CampoValor cv = new CampoValor(28, "Telefone", "X", false, 1, 60, 0, "", fone);
        this.fone = cv;
    }

    public CampoValor getIE() {
        if (IE == null) {
            setIE("");
        }
        return IE;
    }

    public void setIE(String IE) {
        CampoValor cv = new CampoValor(29, "IE do destinatário ou do remetente", "X", false, 0, 14, 0, "Informar a Inscrição Estadual quando o destinatário ou o remetente for inscrito no Cadastro de Contribuintes do ICMS. Preencher apenas com números, sem separadores.", IE);
        this.IE = cv;
    }
}
