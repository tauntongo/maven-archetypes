package com.hostname.spring_all_archetype;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p></p>
 *
 * @author <a href="mailto:tangduns945@gmail.com">Taunton</a>
 * @date Created in 2019-09-26 11:20
 * @since
 */
@Service
public class SayHiService {

    public void sayHi(){
        System.out.println("What's up,yo man!");
    }

    public void java8CompilerTest(){
        List<String> list = Arrays.asList("aa","bb","cc");
        list.stream().map(v -> v.toUpperCase()).forEach(System.out::println);
    }
}
