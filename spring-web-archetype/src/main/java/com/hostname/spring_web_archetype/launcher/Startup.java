package com.hostname.spring_web_archetype.launcher;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>spring容器启动器</p>
 *
 * @author <a href="mailto:tangdong@kftpay.com.cn">Taunton</a>
 * @date Created in 2019-10-09 15:10
 * @since
 */
public class Startup {

    /**
     * 容器上下文路径
     */
    private static final String CONTAINER_CONTEXT_PATH  = "classpath*:spring-container.xml";

    /**
     * 启动spring容器
     */
    private void start(){

        System.out.println("Initializing spring container......");

        AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONTAINER_CONTEXT_PATH);

        ContainerConfig config = applicationContext.getBean(ContainerConfig.class);

        System.out.println("Initializing spring container app ......");
        @SuppressWarnings("unused")
        ClassPathXmlApplicationContext appContextPro = new ClassPathXmlApplicationContext(
                new String[] { config.getAppContextPath() },
                applicationContext);

        System.out.println("Add spring container ContainerShutdownHook......");

        applicationContext.registerShutdownHook();

        applicationContext.start();

        System.out.println("Spring container initialized......");

        while(true){
            try {
                //阻塞主线程，直至永远
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 启动
     * @param args
     */
    public static void main(String[] args) {

        Startup container = new Startup();
        container.start();
    }

}
