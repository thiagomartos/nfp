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
public final class Identificacao {

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

    public Identificacao(String funcao, String xJust, String natOp, String serie, String nNF, String dEmi, String dSaiEnt, String tpNF, String CFOP, String IEST, String IM, String cnpj, String xNome, String xLgr, String nro, String xCpl, String xBairro, String xMun, String UF, String CEP, String xPais, String fone, String IE) {
        setTipoRegistro(new CampoValor(6, "Tipo de Registro", "X", true, 2, 2, 0, "Preencher com o valor '20' para indicar o tipo de registro", "20"));
        setFuncao(new CampoValor(7, "Função do Registro", "X", true, 1, 1, 0, "Informar conforme a função do registro:\n"
                + "I – Inclusão do registro da NF\n"
                + "\n"
                + "R – Retificação do registro da NF\n"
                + "\n"
                + "C – Cancelamento da NF", funcao));
        setxJust(new CampoValor(8, "Justificativa do Cancelamento", "X", true, 15, 255, 0, "Informar a justificativa do cancelamento. Campo obrigatório se campo 7 (Função do Registro) for igual a “C”.", xJust));
        setNatOp(new CampoValor(9, "Descrição da Natureza da Operação", "X", true, 1, 60, 0, "Informar a natureza da operação da qual decorreu a saída ou a entrada, tais como: venda, compra, transferência, devolução, importação, consignação, remessa (para fins de demonstração, de industrialização ou outra), conforme previsto na alínea 'i', inciso I, art. 19 do CONVÊNIO S/Nº, de 15 de dezembro de 1970.", natOp));
        setSerie(new CampoValor(10, "Série da Nota Fiscal", "N", true, 1, 3, 0, "Série da Nota Fiscal. Informar 0 (zero) para série única.", serie));
        setnNF(new CampoValor(11, "Número da Nota Fiscal", "N", true, 1, 9, 0, "Número da Nota Fiscal.", nNF));
        setdEmi(new CampoValor(12, "Data de emissão da Nota Fiscal", "D", true, 0, 0, 0, "Formato “DD/MM/AAAA HH:MM:SS” ; Hora: 0 a 23", dEmi));
        setdSaiEnt(new CampoValor(13, "Data de Saída ou da Entrada da Mercadoria / Produto / Serviço", "D", false, 0, 0, 0, "Formato “DD/MM/AAAA HH:MM:SS ”.", dSaiEnt));
        setTpNF(new CampoValor(14, "Tipo da Nota Fiscal", "N", true, 1, 1, 0, "0-entrada / 1-saída", tpNF));
        setCFOP(new CampoValor(15, "Código Fiscal de Operações e Prestações", "N", true, 4, 4, 0, "Utilizar Tabela de CFOP prevista no Anexo V do RICMS aprovado pelo decreto 45.490 de 30/11/2000 - Convênio s/nº de 15 de dezembro de 1970. Na hipótese de o documento fiscal conter mais de um Código Fiscal de Operações ou Prestação – CFOP, nesse campo deverá ser informado apenas o “CFOP” do item de maior valor; os demais “CFOP” deverão ser informados no campo “Descrição do produto ou serviço” conforme previsto no artigo 127, § 19, do RICMS/2000.", CFOP));
        setIEST(new CampoValor(16, "IE do Substituto Tributário na UF de destino", "X", false, 2, 14, 0, "Informar a IE do substituto tributário na UF de destino da mercadoria conforme previsto no artigo 127, inciso I, alínea “ l ” e § 5º do RICMS/2000. Preencher apenas com números, sem separadores.", IEST));
        setIM(new CampoValor(17, "Inscrição Municipal do Emitente", "X", false, 1, 15, 0, "Este campo deve ser informado quando ocorrer a emissão de NF-e conjugada, com prestação de serviços sujeitos ao ISSQN e fornecimento sujeito ao ICMS. Deve ser preenchido apenas com números, sem separadores.", IM));
        setCnpj(new CampoValor(18, "CNPJ ou CPF do destinatário ou do remetente", "X", false, 11, 14, 0, "Informar o CNPJ ou o CPF do destinatário ou do remetente, preenchendo com os zeros não significativos.\n"
                + "Deve ser preenchido apenas com números, sem separadores.\n"
                + "\n"
                + "Não informar se a operação for realizada com o exterior.\n"
                + "\n"
                + "Caso a operação seja de entrada, os dados devem se referir ao remetente.", cnpj));
        setxNome(new CampoValor(19, "Razão Social ou nome do destinatário ou do remetente", "X", true, 1, 60, 0, "", xNome));
        setxLgr(new CampoValor(20, "Logradouro", "X", true, 1, 60, 0, "", xLgr));
        setNro(new CampoValor(21, "Número", "X", true, 1, 60, 0, "", nro));
        setxCpl(new CampoValor(22, "Complemento", "X", false, 1, 60, 0, "", xCpl));
        setxBairro(new CampoValor(23, "Bairro", "X", true, 1, 60, 0, "", xBairro));
        setxMun(new CampoValor(24, "Nome do município", "X", true, 1, 60, 0, "Informar “EXTERIOR” para operações com o exterior.", xMun));
        setUF(new CampoValor(25, "Sigla da UF", "X", true, 2, 2, 0, "Informar “EX” para operações com o exterior.", UF));
        setCEP(new CampoValor(26, "Código do CEP", "N", false, 8, 8, 0, "Informar os zeros não significativos. Preencher apenas com números, sem separadores.", CEP));
        setxPais(new CampoValor(27, "Nome do País", "X", false, 1, 60, 0, "", xPais));
        setFone(new CampoValor(28, "Telefone", "X", false, 1, 60, 0, "", fone));
        setIE(new CampoValor(29, "IE do destinatário ou do remetente", "X", false, 0, 14, 0, "Informar a Inscrição Estadual quando o destinatário ou o remetente for inscrito no Cadastro de Contribuintes do ICMS. Preencher apenas com números, sem separadores.", IE));

    }

    public CampoValor getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(CampoValor tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public CampoValor getFuncao() {
        return funcao;
    }

    public void setFuncao(CampoValor funcao) {
        this.funcao = funcao;
    }

    public CampoValor getxJust() {
        return xJust;
    }

    public void setxJust(CampoValor xJust) {
        this.xJust = xJust;
    }

    public CampoValor getNatOp() {
        return natOp;
    }

    public void setNatOp(CampoValor natOp) {
        this.natOp = natOp;
    }

    public CampoValor getSerie() {
        return serie;
    }

    public void setSerie(CampoValor serie) {
        this.serie = serie;
    }

    public CampoValor getnNF() {
        return nNF;
    }

    public void setnNF(CampoValor nNF) {
        this.nNF = nNF;
    }

    public CampoValor getdEmi() {
        return dEmi;
    }

    public void setdEmi(CampoValor dEmi) {
        this.dEmi = dEmi;
    }

    public CampoValor getdSaiEnt() {
        return dSaiEnt;
    }

    public void setdSaiEnt(CampoValor dSaiEnt) {
        this.dSaiEnt = dSaiEnt;
    }

    public CampoValor getTpNF() {
        return tpNF;
    }

    public void setTpNF(CampoValor tpNF) {
        this.tpNF = tpNF;
    }

    public CampoValor getCFOP() {
        return CFOP;
    }

    public void setCFOP(CampoValor CFOP) {
        this.CFOP = CFOP;
    }

    public CampoValor getIEST() {
        return IEST;
    }

    public void setIEST(CampoValor IEST) {
        this.IEST = IEST;
    }

    public CampoValor getIM() {
        return IM;
    }

    public void setIM(CampoValor IM) {
        this.IM = IM;
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

    public CampoValor getxLgr() {
        return xLgr;
    }

    public void setxLgr(CampoValor xLgr) {
        this.xLgr = xLgr;
    }

    public CampoValor getNro() {
        return nro;
    }

    public void setNro(CampoValor nro) {
        this.nro = nro;
    }

    public CampoValor getxCpl() {
        return xCpl;
    }

    public void setxCpl(CampoValor xCpl) {
        this.xCpl = xCpl;
    }

    public CampoValor getxBairro() {
        return xBairro;
    }

    public void setxBairro(CampoValor xBairro) {
        this.xBairro = xBairro;
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

    public CampoValor getCEP() {
        return CEP;
    }

    public void setCEP(CampoValor CEP) {
        this.CEP = CEP;
    }

    public CampoValor getxPais() {
        return xPais;
    }

    public void setxPais(CampoValor xPais) {
        this.xPais = xPais;
    }

    public CampoValor getFone() {
        return fone;
    }

    public void setFone(CampoValor fone) {
        this.fone = fone;
    }

    public CampoValor getIE() {
        return IE;
    }

    public void setIE(CampoValor IE) {
        this.IE = IE;
    }
}
