package com.project.wewed.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.ajp.AbstractAjpProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author KJH
 * @since 2019-08-06 15:56
 */
@Configuration
public class ContainerConfig {

    @Bean
    public ServletWebServerFactory servletWebServerFactory(
            /*@Value("${tomcat.ajp.protocol}") String ajpProtocol,
            @Value("${tomcat.ajp.port}") int ajpPort*/) {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createAjpConnector("AJP/1.3", 11009));
        return tomcat;
    }

    private Connector createAjpConnector(String ajpProtocol, int ajpPort) {
        Connector ajpConnector = new Connector(ajpProtocol);
        ajpConnector.setPort(ajpPort);
        ajpConnector.setSecure(false);
        ajpConnector.setAllowTrace(false);
        ajpConnector.setScheme("http");
        ((AbstractAjpProtocol) ajpConnector.getProtocolHandler()).setSecretRequired(false);
        return ajpConnector;
    }
}
