package edu.institute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
	//setting a user credential and the role
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
		.withUser("admin").password("admin123").roles("ADMIN").and()
		.withUser("hr").password("hr123").roles("HR", "ADMIN").and()
		.withUser("stud1").password("stud1@123").roles("STUDENT").and()
		.withUser("stud2").password("stud2@123").roles("STUDENT");
		
	}
	
	//admin/*  ->admin/home, admin/profile, admin/user/create
	//setting a user authorization details
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeHttpRequests()
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
		.antMatchers("/hr/**").hasAnyRole("HR")
		.antMatchers("/stud**").hasAnyRole("STUDENT").and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
