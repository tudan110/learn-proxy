package indi.tudan.learnproxy.proxy;

import com.github.monkeywie.proxyee.server.HttpProxyServer;
import indi.tudan.learnproxy.constant.ConsoleColors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.NumberUtils;

/**
 * 代理服务器
 *
 * @author wangtan
 * @date 2021-11-04 19:28:46
 * @since 1.0.0
 */
@Slf4j
@Component
public class ProxyServer {

    @Value("${proxy.http.port:9999}")
    private int port;

    /**
     * 启动 http 代理服务器
     *
     * @author wangtan
     * @date 2021-11-04 19:31:39
     * @since 1.0.0
     */
    public void startHttpProxyServer() {

        log.info(ConsoleColors.BLUE_BOLD + "准备创建 http 代理服务器" + ConsoleColors.RESET);
        log.info(ConsoleColors.BLUE_BOLD + "代理端口: {}{}{}", ConsoleColors.GREEN_BOLD_BRIGHT, port, ConsoleColors.GREEN_BOLD_BRIGHT);
        log.info(ConsoleColors.CYAN_BOLD + "运行 http 代理服务..." + ConsoleColors.CYAN_BOLD);
        new HttpProxyServer().start(port);

    }

}
