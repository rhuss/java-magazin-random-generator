package demo.randomgenerator;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RandomGeneratorApplication {

	// Unique UUID to identify service
	private static UUID id = UUID.randomUUID();

	// Random number generator
	private static Random random = new Random();

	public static void main(String[] args) {
		SpringApplication.run(RandomGeneratorApplication.class, args);
	}

	@RequestMapping(value = "/", produces = "application/json")
	public Map getRandom() {
		Map ret = new HashMap();
		ret.put("id", id);
		ret.put("random", random.nextInt());
		return ret;
	}
}
