package cn.ekgc.starsoceans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>星海-注册中心启动器</b>
 * @author HuangXi
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class StarsOceansRegisterStarter {
	public static void main(String[] args) {
		SpringApplication.run(StarsOceansRegisterStarter.class,args);
	}
}
