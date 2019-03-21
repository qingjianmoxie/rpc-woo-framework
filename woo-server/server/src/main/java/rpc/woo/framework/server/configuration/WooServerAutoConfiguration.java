package rpc.woo.framework.server.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rpc.woo.framework.server.WooServer;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(WooServerProperties.class)
public class WooServerAutoConfiguration {
    @Bean
    public WooServer wooServer(){
        return new WooServer();
    }
}
