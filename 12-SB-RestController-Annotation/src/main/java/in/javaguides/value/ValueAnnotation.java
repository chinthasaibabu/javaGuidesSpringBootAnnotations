package in.javaguides.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {

	@Value("Default Name")
	private String defaultName;
	
	@Value("${mail.host}")//key value in properties file
	private String host;
	
	@Value("${mail.email}")//key value in properties file
	private String email;
	
	@Value("${mail.password}")//key value in properties file
	private String password;
	
//	@Value("${java.home}")
//	private String javaHome;
//	
//	@Value("${HOME}")
//	private String homeDir;

	public String getDefaultName() {
		return defaultName;
	}


	public String getHost() {
		return host;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}


//	public String getJavaHome() {
//		return javaHome;
//	}
//
//
//	public String getHomeDir() {
//		return homeDir;
//	}
//	
	
	
}
