#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Value("service.url")
//    private String serviceUrl;
//
//    @Bean
//    HelloServiceRpc helloServiceRpc() {
//        return service.HelloService.class.cast(HessianProxyUtil.buildRemotingService(serviceUrl,//
//                service.HelloService.class.getSimpleName(),//
//                service.HelloService.class));
//    }
}