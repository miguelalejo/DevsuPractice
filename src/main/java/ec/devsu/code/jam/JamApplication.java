package ec.devsu.code.jam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JamApplication implements CommandLineRunner {
	  private static Logger LOG = LogManager
		      .getLogger(JamApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("SALUDO"); 
		System.out.println("HELLo");		
	}

}
