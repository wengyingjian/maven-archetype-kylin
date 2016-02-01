#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;

import ${package}.service.HelloService;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    String hello() {
        return helloService.hello();
    }

}
