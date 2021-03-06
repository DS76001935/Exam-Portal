package com.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.Service.MyUserDetailsService;
import com.component.ExamJwtRequestFilter;

@Configuration
@EnableWebSecurity
public class ExamConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	MyUserDetailsService myUserDetailsService;
	
	@Autowired
	ExamJwtRequestFilter jwtRequestFilter;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		//http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		.authorizeRequests()
		.antMatchers("/candidates/**").hasAnyRole("USER_ROLE","ADMIN_ROLE","SUPERADMIN_ROLE")
		.antMatchers("/admin/**").hasAnyRole("ADMIN_ROLE","SUPERADMIN_ROLE")
		.antMatchers("/superadmin/**").hasRole("SUPERADMIN_ROLE")
		.antMatchers("/public/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.usernameParameter("email")
		.passwordParameter("password")
		.defaultSuccessUrl("/home")
		.failureUrl("/errorPage")
		.and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}
		
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(myUserDetailsService);
	}

	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance(); 
	}
	
}
