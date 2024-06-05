package org.auladio.projetoiphone.service;

public class IphoneService {
    private boolean ligar = false;

    public boolean getIStatusIphone() {
        return ligar;
    }
    public boolean setIphoneLigado ( boolean ligar ) {
        return this.ligar = true;
    }


}
