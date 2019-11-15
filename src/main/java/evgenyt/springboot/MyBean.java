package evgenyt.springboot;

import org.springframework.stereotype.Component;

/**
 * Class to read and show value from application properties 
 */

@Component
public class MyBean {	
	// Inject properties component on construction
	MyBean(AppProperties appProperties) {		
		// Read and show 'test' parameter
		System.out.println("test=" + appProperties.getTest()); // test-value in log
	}
}
