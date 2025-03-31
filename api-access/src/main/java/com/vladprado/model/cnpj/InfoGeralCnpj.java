package com.vladprado.model.cnpj;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;

@ApplicationScoped
public class InfoGeralCnpj {
    String abertura;
    String situacao;
    String tipo;
    String nome;
    String fantasia;
    String porte;

    @JsonProperty("natureza_juridica")
    String natureza_juridica;
    String logradouro;
    String numero;
    String complemento;
    String municipio;
    String bairro;
    String uf;
    String cep;
    String email;
    String telefone;
    String data_situacao;
    String efr;
    String cnpj;
    String ultima_atualizacao;
    String status;
    String motivo_situacao;
    String situacao_especial;
    String data_situacao_especial;
    String capital_social;
    ArrayList<AtividadePrincipal> atividade_principal;
    ArrayList<AtividadesSecundarias> atividades_secundarias;
    ArrayList<Qsa> qsa;
    Simples simples;
    Simei simei;
    Extra extra;
    Billing billing;


    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_situacao() {
        return data_situacao;
    }

    public void setData_situacao(String data_situacao) {
        this.data_situacao = data_situacao;
    }

    public String getEfr() {
        return efr;
    }

    public void setEfr(String efr) {
        this.efr = efr;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUltima_atualizacao() {
        return ultima_atualizacao;
    }

    public void setUltima_atualizacao(String ultima_atualizacao) {
        this.ultima_atualizacao = ultima_atualizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMotivo_situacao() {
        return motivo_situacao;
    }

    public void setMotivo_situacao(String motivo_situacao) {
        this.motivo_situacao = motivo_situacao;
    }

    public String getSituacao_especial() {
        return situacao_especial;
    }

    public void setSituacao_especial(String situacao_especial) {
        this.situacao_especial = situacao_especial;
    }

    public String getData_situacao_especial() {
        return data_situacao_especial;
    }

    public void setData_situacao_especial(String data_situacao_especial) {
        this.data_situacao_especial = data_situacao_especial;
    }

    public String getCapital_social() {
        return capital_social;
    }

    public void setCapital_social(String capital_social) {
        this.capital_social = capital_social;
    }

    public ArrayList<AtividadePrincipal> getAtividade_principal() {
        return atividade_principal;
    }

    public void setAtividade_principal(ArrayList<AtividadePrincipal> atividade_principal) {
        this.atividade_principal = atividade_principal;
    }

    public ArrayList<AtividadesSecundarias> getAtividades_secundarias() {
        return atividades_secundarias;
    }

    public void setAtividades_secundarias(ArrayList<AtividadesSecundarias> atividades_secundarias) {
        this.atividades_secundarias = atividades_secundarias;
    }

    public ArrayList<Qsa> getQsa() {
        return qsa;
    }

    public void setQsa(ArrayList<Qsa> qsa) {
        this.qsa = qsa;
    }

    public Simples getSimples() {
        return simples;
    }

    public void setSimples(Simples simples) {
        this.simples = simples;
    }

    public Simei getSimei() {
        return simei;
    }

    public void setSimei(Simei simei) {
        this.simei = simei;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    @Override
    public String toString() {
        return "InfoGeralCnpj{" +
                "abertura='" + abertura + '\'' +
                ", situacao='" + situacao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", fantasia='" + fantasia + '\'' +
                ", porte='" + porte + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", municipio='" + municipio + '\'' +
                ", bairro='" + bairro + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", data_situacao='" + data_situacao + '\'' +
                ", efr='" + efr + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", ultima_atualizacao='" + ultima_atualizacao + '\'' +
                ", status='" + status + '\'' +
                ", motivo_situacao='" + motivo_situacao + '\'' +
                ", situacao_especial='" + situacao_especial + '\'' +
                ", data_situacao_especial='" + data_situacao_especial + '\'' +
                ", capital_social='" + capital_social + '\'' +
                ", atividade_principal=" + atividade_principal +
                ", atividades_secundarias=" + atividades_secundarias +
                ", qsa=" + qsa +
                ", simples=" + simples +
                ", simei=" + simei +
                ", extra=" + extra +
                ", billing=" + billing +
                '}';
    }
}
