package net.classnotfound.aop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml" })
public class TestMyService {

    @Autowired
    private MyService myService;

    @Test
    public void testDoSomethingMethod() {
        myService.doSomething();
    }

    @Test
    public void testDoSomethingElseMethod() {
        myService.doSomethingElse();
    }
}
