package com.hostname.spring_web_archetype.launcher;

/**
 * <p>启动spring容器时的配置文件路径配置类</p>
 *
 * @author <a href="mailto:tangduns945@gmail.com">Taunton</a>
 * @date Created in 2019-10-09 15:18
 * @since
 */
public class ContainerConfig {

    /**
     * 应用上下文配置文件路径
     */
    private String appContextPath;

    public String getAppContextPath() {
        return appContextPath;
    }

    public void setAppContextPath(String appContextPath) {
        this.appContextPath = appContextPath;
    }
}
