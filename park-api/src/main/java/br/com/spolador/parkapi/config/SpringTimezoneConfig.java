package br.com.spolador.parkapi.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@Configuration
public class SpringTimezoneConfig {

    @PostConstruct // metodo construtor é executado e esse metodo é o proximo a ser executado
    public void timezoneConfig(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }


}
