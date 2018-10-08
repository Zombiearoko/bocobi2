package com.bocobi2.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	AuthSuccess authSuccess;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("SELECT login as principal,password as credentials FROM internaute WHERE login=?")
			.authoritiesByUsernameQuery("SELECT login as principal, role as role from internaute WHERE login=?")
			//.passwordEncoder((PasswordEncoder) new Md5PasswordEncoder())
			.rolePrefix("ROLE_");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.formLogin().loginPage("/connection").successHandler(authSuccess)
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/connexion");
		http.authorizeRequests().antMatchers("/").hasRole("INTERNAUTE");
		http.authorizeRequests().antMatchers("/offreuremploi").hasRole("OFFREUREMPLOI");
		http.authorizeRequests().antMatchers("/offreuremploi/*").hasRole("OFFREUREMPLOI");
		http.authorizeRequests().antMatchers("/chercheuremploi").hasRole("CHERCHEUREMPLOI");
		http.authorizeRequests().antMatchers("/chercheuremploi/*").hasRole("CHERCHEUREMPLOI");
		http.authorizeRequests().antMatchers("/admin/*").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN");
		
		
		http.authorizeRequests().antMatchers("/").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/").hasRole("OFFREUREMPLOI");
		http.authorizeRequests().antMatchers("/").hasRole("CHERCHEUREMPLOI");
		http.authorizeRequests().antMatchers("/").hasRole("INTERNAUTE");
		http.exceptionHandling().accessDeniedPage("/403");
	}
}