package indi.tudan.learnproxy.init;

import indi.tudan.learnproxy.proxy.ProxyServer;
import indi.tudan.learnproxy.utils.SpringBeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 在开发中可能会有这样的情景。需要在容器启动的时候执行一些内容。比如读取配置文件，数据库连接之类的。SpringBoot 给我们提供了两个接口来帮助我们实现这种需求。
 * <p>
 * 这两个接口分别为 CommandLineRunner 和 ApplicationRunner。他们的执行时机为容器启动完成的时候。这两个接口中有一个 run 方法，我们只需要实现这个方法即可。
 *
 * @author wangtan
 * @date 2021-11-04 19:54:01
 * @since 1.0.0
 */
@Slf4j
@Component
public class HttpProxyServerRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        // 启动 http 代理服务器
        SpringBeanUtils.getBean(ProxyServer.class).startHttpProxyServer();

    }

}
