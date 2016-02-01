#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
//    @Autowired
//    private HelloServiceRpc helloServiceRpc;

    public String hello() {
        String word=null;
//        word = helloServiceRpc.say();
        if(word == null || "".equals(word)){
            word = "hello !";
        }
        return word;
    }

}
