package com.homeo.web.firstattempt.homeowithhimaja.beans;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfiguration {

	@Value("${spring.mail.username}")
	private String username;
	
	@Value("${spring.mail.properties.mail.smtp.starttls.required}")
	private boolean startlsreq;
	
	
	@Value("${spring.mail.host}")
	private String mailhost;
	
	
	@Value("${spring.mail.port}")
	private int mailport;
	
	@Value("${spring.mail.password}")
	private String password;

	@Value("${spring.mail.properties.mail.smtp.auth}")
	private boolean smptpauth;
	
	@Value("${spring.mail.properties.mail.transport.protocol}")
	private String transportprotocol;
		
	@Value("${spring.mail.properties.mail.smtp.starttls.enable}")
	private boolean startlsenable;
			
			
			
			
    @Bean
    public JavaMailSender getJavaMailSender() {
    	
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(mailhost);
        mailSender.setPort(mailport);

        mailSender.setUsername(username);
        mailSender.setPassword(password);

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", transportprotocol);
        props.put("mail.smtp.auth", smptpauth);
        props.put("mail.smtp.starttls.enable", startlsenable);
        props.put("mail.debug", "true");

        return mailSender;
        
        /*<! <li>Headaches</li>
   				 <li>Irritable bowel syndrome</li>
    			 <li>Migraines</li>
    			 <li>Nausea</li>
   				 <li>Premenstrual syndrome</li>
    			 <li>Rheumatoid arthritis</li>
    			 <li>Scrapes</li>
    			 <li>Toothaches</li>>
    			 */
        
    }
}