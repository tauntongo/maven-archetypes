package com.hostname.spring_web_archetype.test;

import com.hostname.spring_web_archetype.SayHiService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p></p>
 *
 * @author <a href="mailto:tangduns945@gmail.com">Taunton</a>
 * @date Created in 2019-10-10 14:59
 * @since
 */
public class SayHiServiceTest extends BaseJunitTest {

    @Autowired
    private SayHiService sayHiService;

    @Test
    public void testSayHi(){
        sayHiService.sayHi();
    }

}
