/*
 * Pacote: net.tmsolucoes.nfp
 * Classe: Arquivo.java
 * Criado em 17/02/2019 09:47:45 por Thiago Martos
 *
 1. Cada arquivo digital deverá conter informações relativas às Notas Fiscais, modelo 1 ou 1-A, emitidas por um único estabelecimento, no período compreendido entre a data inicial e a data final indicadas no próprio arquivo, e deverá observar a seguinte especificação técnica:

 1.1 - Formato do arquivo: texto (Text Encoding = UTF-8);
 1.2 - Tamanho máximo do arquivo: 1 megabyte;
 1.3 - Nome do arquivo: atribuição livre;
 1.4 - Divisão entre os campos de cada registro: utilizar o caractere “|” (pipe), observando-se que o espaço entre os dois caracteres delimitadores deverá ficar vazio (“||”) quando não houver informação para campos de preenchimento não obrigatório;
 1.5 - Finalização da linha de cada registro: CR/LF (Carriage Return/Line Feed);
 1.6 - Formato dos campos: data, numérico e alfanumérico, de acordo com o estabelecido no item 3 - leiaute detalhado do arquivo, observando-se que:
 1.6.1 - Data (D): a data deverá obedecer ao formato DD/MM/AAAA (dia, mês e ano separados por barras) e o horário ao formato HH:MM:SS (horas, minutos e segundos separados por dois pontos);
 1.6.2 - Numérico (N): utilizar vírgula para separar a parte inteira da decimal que deverá ser informada ainda que com zeros (ex.: 999,00); na hipótese de valor total igual a zero para campo de preenchimento obrigatório, deverá ser informado “0,00”.
 1.6.3 - Alfanumérico (X): preenchimento com letras e números;
 1.7 - Tamanho dos campos: fixo e variável, de acordo com o estabelecido no item 3 - leiaute detalhado do arquivo, observando-se que:
 1.7.1 - tamanho fixo: definição da quantidade exata de posições, incluindo as casas decimais, para preenchimento do campo;
 1.7.2 - tamanho variável: definição de um intervalo, incluindo as casas decimais, com limite de quantidade mínima e máxima de posições para preenchimento do campo;

 2. Estrutura do arquivo:

 2.1 - O arquivo deverá ser composto pelos seguintes tipos de registros:
 2.1.1 - Tipo 10 - Registro obrigatório, cabeçalho do arquivo, identificador do estabelecimento emitente. Deve ser informado exatamente 1 (um) registro por arquivo.
 2.1.2 - Tipo 20 - Registro obrigatório, identificador da Nota Fiscal, modelo 1 ou 1-A. Deve ser informado no mínimo 1 (um) registro por arquivo.
 2.1.3 - Tipo 30 - Discriminador dos itens das mercadorias, produtos ou serviços do documento fiscal. Na hipótese de criação ou retificação de registro deverá ser informado no mínimo 1 (um) registro por documento; na hipótese de cancelamento, este registro não deverá ser informado.
 2.1.4 - Tipo 40 - Discriminador dos valores constantes no documento fiscal. Na hipótese de criação ou retificação de registro deverá ser informado exatamente 1 (um) registro por documento; na hipótese de cancelamento, este registro não deverá ser informado.
 2.1.5 - Tipo 50 - Informações sobre o transporte das mercadorias ou produtos. Na hipótese de criação ou retificação de registro deverá ser informado exatamente 1 (um) registro por documento; na hipótese de cancelamento, este registro não deverá ser informado.
 2.1.6 - Tipo 60 - Informações adicionais e de cobrança. Na hipótese de criação ou retificação de registro poderá ser informado exatamente 1 (um) ou nenhum registro por documento; na hipótese de cancelamento, este registro não deverá ser informado.
 2.1.7 - Tipo 90 - Registro obrigatório, rodapé totalizador da quantidade de registros no arquivo. Deve ser informado exatamente 1 (um) registro por arquivo.
 */
package nfp.model;

import java.util.List;

/**
 *
 * @author Thiago Martos
 */
public class Arquivo {

    private Cabecalho cabecalho;
    private List<Identificacao> identificacoes;
    private List<Itens> itens;
    private List<Valores> valores;
    private Transporte transporte;
    private Cobranca cobranca;
    private Rodape rodape;

    /**
     * Criação ou Ratificação
     *
     * @param cabecalho      <pre>
     * Informação: Identificação do Arquivo (Cabeçalho)
     * Hierarquia: 1
     * Quantidade Obrigatória: = 1 por arquivo
     * </pre>
     *
     * @param identificacoes      <pre>
     * Informação: Dados de Identificação da Nota Fiscal
     * Hierarquia: 2
     * Quantidade Obrigatória: >= 1 por arquivo
     * </pre>
     *
     * @param itens      <pre>
     * Informação: Mercad / Prod / Serv
     * Hierarquia: 3
     * Quantidade Obrigatória: >= 1 por NF
     * </pre>
     *
     * @param valores      <pre>
     * Informação: Valores Totais da NF
     * Hierarquia: 2
     * Quantidade Obrigatória: = 1 por NF
     * </pre>
     *
     * @param transporte      <pre>
     * Informação: Informações do Transporte da NF
     * Hierarquia: 2
     * Quantidade Obrigatória: = 1 por nf
     * </pre>
     *
     * @param cobranca      <pre>
     * Informação: Informações Adicionais e de Cobrança
     * Hierarquia: 2
     * Quantidade Obrigatória: 0 ou 1 por NF
     * </pre>
     *
     * @param rodape      <pre>
     * Informação: Rodapé
     * Hierarquia: 1
     * Quantidade Obrigatória: = 1 por arquivo
     * </pre>
     */
    public Arquivo(Cabecalho cabecalho, List<Identificacao> identificacoes, List<Itens> itens, List<Valores> valores, Transporte transporte, Cobranca cobranca, Rodape rodape) {
        this.cabecalho = cabecalho;
        this.identificacoes = identificacoes;
        this.itens = itens;
        this.valores = valores;
        this.transporte = transporte;
        this.cobranca = cobranca;
        this.rodape = rodape;
    }

    /**
     * Cancelamento
     *
     * @param cabecalho      <pre>
     * Informação: Identificação do Arquivo (Cabeçalho)
     * Hierarquia: 1
     * Quantidade Obrigatória: = 1 por arquivo
     * </pre>
     *
     * @param identificacoes      <pre>
     * Informação: Dados de Identificação da Nota Fiscal
     * Hierarquia: 2
     * Quantidade Obrigatória: >= 1 por arquivo
     * </pre>
     *
     * @param rodape      <pre>
     * Informação: Rodapé
     * Hierarquia: 1
     * Quantidade Obrigatória: = 1 por arquivo
     * </pre>
     */
    public Arquivo(Cabecalho cabecalho, List<Identificacao> identificacoes, Rodape rodape) {
        cabecalho.setTipoRegistro("10");
        this.cabecalho = cabecalho;
        this.identificacoes = identificacoes;
        this.rodape = rodape;
    }

    public Cabecalho getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(Cabecalho cabecalho) {
        this.cabecalho = cabecalho;
    }

    public List<Identificacao> getIdentificacoes() {
        return identificacoes;
    }

    public void setIdentificacoes(List<Identificacao> identificacoes) {
        this.identificacoes = identificacoes;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    public List<Valores> getValores() {
        return valores;
    }

    public void setValores(List<Valores> valores) {
        this.valores = valores;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Cobranca getCobranca() {
        return cobranca;
    }

    public void setCobranca(Cobranca cobranca) {
        this.cobranca = cobranca;
    }

    public Rodape getRodape() {
        return rodape;
    }

    public void setRodape(Rodape rodape) {
        this.rodape = rodape;
    }

}
