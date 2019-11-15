package evgenyt.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class reads application.properties file 
 */

@ConfigurationProperties // read application.properties
@Component // register as component to inject to another components 

public class AppProperties {
	// This var filled with value of 'test=' from application.properties  
	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
}
