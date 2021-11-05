package indi.tudan.learnproxy;

import indi.tudan.learnproxy.constant.ConsoleColors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代理服务器程序
 *
 * @author wangtan
 * @date 2021-11-04 19:26:52
 * @since 1.0.0
 */
@Slf4j
@SpringBootApplication
public class LearnProxyApplication {

    public static void main(String... args) {

        SpringApplication.run(LearnProxyApplication.class, args);

        log.info(ConsoleColors.CYAN + "------【 learn-proxy 启动成功 】---------\n\n" +
                "\n" +
                "██╗     ███████╗ █████╗ ██████╗ ███╗   ██╗      ██████╗ ██████╗  ██████╗ ██╗  ██╗██╗   ██╗\n" +
                "██║     ██╔════╝██╔══██╗██╔══██╗████╗  ██║      ██╔══██╗██╔══██╗██╔═══██╗╚██╗██╔╝╚██╗ ██╔╝\n" +
                "██║     █████╗  ███████║██████╔╝██╔██╗ ██║█████╗██████╔╝██████╔╝██║   ██║ ╚███╔╝  ╚████╔╝\n" +
                "██║     ██╔══╝  ██╔══██║██╔══██╗██║╚██╗██║╚════╝██╔═══╝ ██╔══██╗██║   ██║ ██╔██╗   ╚██╔╝\n" +
                "███████╗███████╗██║  ██║██║  ██║██║ ╚████║      ██║     ██║  ██║╚██████╔╝██╔╝ ██╗   ██║\n" +
                "╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝      ╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝   ╚═╝\n" +
                "\n" + ConsoleColors.CYAN);

    }

}
