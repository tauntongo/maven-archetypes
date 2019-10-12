package com.hostname.test;

import com.hostname.SayHiService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p></p>
 *
 * @author <a href="mailto:tangdong@kftpay.com.cn">Taunton</a>
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
