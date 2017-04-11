package springbootexample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringBootTest {
 
	@RequestMapping("/")
	public String index(){
		return "Saludos desde Spring Boot";
	}
}
