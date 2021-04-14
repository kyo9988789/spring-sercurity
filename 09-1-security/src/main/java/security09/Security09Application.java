package security09;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


/**
 * 启动类
 */
@EnableRedisHttpSession
@SpringBootApplication
@MapperScan("security09.mapper")
public class Security09Application {

	public static void main(String[] args) {
		SpringApplication.run(Security09Application.class, args);
	}

}


