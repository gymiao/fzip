package im.gy.zfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FzipApplication {

    public static void main(String[] args) {
        SpringApplication.run(FzipApplication.class, args);
        System.out.println("服务器启动成功");
    }

}
