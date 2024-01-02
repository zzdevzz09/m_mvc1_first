package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/*
 *  - @ServletComponentScan
 *   : Servlet 자동 등록임
 *   : Spring이 자동으로 현재 내 패키지를 포함해서 하위 패키지를 다 뒤져서
 *     Servlet을 다 찾아서 자동으로 Servlet을 등록해서 실행할 수 있도록 도와줌
 * 
 */

@ServletComponentScan	
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

}
