package org.weibo.hl.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @projectName: weibo
 * @package: org.weibo.hl.eureka.server
 * @className: EurekaServerApplication
 * @description:
 * @author: hl
 * @createDate: 2023/5/9 22:50
 */

@EnableEurekaServer
@SpringBootApplication
public class WeiboEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiboEurekaServerApplication.class, args);
    }
}
