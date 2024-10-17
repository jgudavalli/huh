package com.homeo.web.firstattempt.homeowithhimaja;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

/*public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HomeowithhimajaApplication.class);
	}

}*/

public class ServletInitializer implements WebApplicationInitializer {

	  public void onStartup(ServletContext container) throws ServletException {
	    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	    context.register(HomeowithhimajaApplication.class);
	    context.setServletContext(container);

	    // servlet configuration
	  }
	}
