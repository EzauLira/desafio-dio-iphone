package org.auladio.projetoiphone.dao;

import org.auladio.projetoiphone.config.Mensagens;
import org.auladio.projetoiphone.dao.imp.IIphone;
import org.auladio.projetoiphone.service.IphoneService;

public class IphoneDao implements IIphone {

    IphoneService iphoneService = new IphoneService();
    Mensagens mensagens = new Mensagens();

    @Override
    public void statusIphone() {
        if (!iphoneService.getIStatusIphone()) {
            mensagens.desligado();
        }
    }

    @Override
    public void ligarIphone() {
        iphoneService.setIphoneLigado(true);
        mensagens.ligado();
    }

    //MUSICA

    @Override
    public void tocarMusica() {
        mensagens.tocarMusica();
    }

    @Override
    public void pausarMusica() {
        mensagens.pausarMusica();
    }

    @Override
    public void selecionarMusica() {
        mensagens.selecionarMusica();
    }

    //CHAMADA
    @Override
    public void ligar() {
        mensagens.ligar();
    }

    @Override
    public void atender() {
        mensagens.atender();
    }

    @Override
    public void iniciarCorreioDeVoz() {
        mensagens.iniciarCorreioDeVoz();
    }


    //NAVEGADOR
    @Override
    public void adicionarNovaPagina() {
        mensagens.adicionarNovaPagina();
    }

    @Override
    public void exibirpagina() {
        mensagens.exibirpagina();
    }

    @Override
    public void atualizarPagina() {
        mensagens.atualizarPagina();
    }

    //OUTROS
    @Override
    public void saindo() {
        mensagens.saindo();
    }

    @Override
    public void ateMais() {
        mensagens.ateMais();
    }

}
