package com.hostname.spring_archetype.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.result.*;

/**
 * <p>Spring容器单元测试基础类</p>
 *
 * @author <a href="mailto:tangduns945@gmail.com">Taunton</a>
 * @date Created in 2019-10-10 14:49
 * @since
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-archetype-dependencies.xml"})
public class BaseJunitTest {

    protected Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Before
    public void setup() {
        //init operation...
    }

    @Ignore
    public StatusResultMatchers status() {
        return MockMvcResultMatchers.status();
    }

    @Ignore
    public ViewResultMatchers view() {
        return MockMvcResultMatchers.view();
    }

    @Ignore
    public ModelResultMatchers model() {
        return MockMvcResultMatchers.model();
    }

    @Ignore
    public ResultHandler print() {
        return MockMvcResultHandlers.print();
    }

}
