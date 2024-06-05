package org.auladio.projetoiphone.config;

import java.util.concurrent.TimeUnit;

public class TempoResposta {


    public static void tempo (){

        try {

            TimeUnit.SECONDS.sleep(1 );

        }catch ( InterruptedException e ) {

            e.printStackTrace();

        }
    }
}
