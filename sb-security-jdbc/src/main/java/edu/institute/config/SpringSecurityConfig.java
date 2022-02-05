package edu.institute.config;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
    
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.userByUsernameQuery("select email, password, enable from employee whereemail=?") // to get the username, password  and enable flag to the user
		.authoritiesByUsernameQuery("select email, role from employee where email=?"); // to get the username and role of the user
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests()
		.antMatchers("/admin/**","/policies/update/**").hasAnyRole("ADMIN")
        .antMatchers("/hr/**").hasAnyRole("HR", "ADMIN")
        .antMatchers("/stud/**").hasAnyRole("STUDENT")
        .antMatchers("/policies/details/**").permitAll()
        .and()
        .formLogin();  // Return the spring Login page
		//.httpBasic();   // will give an alert at browser
	
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
