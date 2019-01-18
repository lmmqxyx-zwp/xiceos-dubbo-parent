package top.by.xd;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class XDServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(XDServiceApplication.class, args);
    }
}
