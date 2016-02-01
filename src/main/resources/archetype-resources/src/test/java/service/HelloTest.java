#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.service;

import grp.id.App;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class HelloTest {

    @Autowired
    private HelloService helloService;

    @Before
    public void setUp() throws Exception {
        //TODO:set up here
    }

    @Test
    public void testHello() throws Exception {
        //TODO:test here
        System.out.println(helloService.hello());
    }

}