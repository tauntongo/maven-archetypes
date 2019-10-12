package com.hostname.util.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <p>Spring上下文工具
 * 实现了ApplicationContextAware接口（标记接口），会在创建bean时自动注入ApplicationContext上下文对象
 * </p>
 *
 * @author <a href="mailto:tangduns945@gmail.com">Taunton</a>
 * @date Created in 2019-09-26 11:32
 * @since
 */
public class SpringContextUtil implements ApplicationContextAware {
    /**
     *Spring上下文
     */
    public static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContext = applicationContext;
    }

    public static <T> T getBean(String name) throws BeansException {
        return (T) applicationContext.getBean(name);
    }
}
