package io.pmbox.infrastructure.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import io.pmbox.infrastructure.routing.filters.pre.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	 @Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }
}
