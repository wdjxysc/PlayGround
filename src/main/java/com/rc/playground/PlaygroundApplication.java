package com.rc.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 产生一个可部署war包的第一步是提供一个SpringBootServletInitializer子类，
 * 并覆盖它的configure方法。这充分利用了Spring框架对Servlet 3.0的支持，并
 * 允许你在应用通过servlet容器启动时配置它。通常，你只需把应用的主类改为继承
 * SpringBootServletInitializer即可：
 *
 * 下一步是更新你的构建配置，这样你的项目将产生一个war包而不是jar包。如果你使
 * 用Maven，并使用spring-boot-starter-parent（为了配置Maven的war插件），
 * 所有你需要做的就是更改pom.xml的packaging为war：
 *
 * 该过程最后的一步是确保内嵌的servlet容器不能干扰war包将部署的servlet容器。
 * 为了达到这个目的，你需要将内嵌容器的依赖标记为provided。
 */
@SpringBootApplication
public class PlaygroundApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PlaygroundApplication.class);
    }



    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
    }
}
