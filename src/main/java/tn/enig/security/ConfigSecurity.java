package tn.enig.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ConfigSecurity /*extends WebSecurityConfigurerAdapter*/ {
	/*
	@Autowired
	DataSource dataSource; 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	 //on definit les users qui vont utilier l'application avec leurs roles
	 //dans l'application => // deux methodes : dans la memoires ou via la base.
	 PasswordEncoder crypt = cryptageMP();

	 auth.jdbcAuthentication()
	 .dataSource(dataSource)
	 .usersByUsernameQuery("select email as principal, motDePasse as credentials, active from Utilisateur where email=?")
	 .authoritiesByUsernameQuery("select Utilisateur_email as principal, roles_role as role from Utilisateur_roles where Utilisateur_email=?")
	 .passwordEncoder(crypt)
	 .rolePrefix("ROLE_");
	 } 
	
	@Bean
	public PasswordEncoder cryptageMP() {
	 return new BCryptPasswordEncoder();
	 } 
*/
	
	//@Override
	//protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		// permet de definir les actions autorisées avec quelles roles
	
		 //http.formLogin(); /// quelles techniques d'autentifiaction on trouve aussi http.httpBasic()
		 //http.authorizeRequests().antMatchers("/add**/**","/delete**/**")
		 //.hasRole("ADMIN");
		// http.authorizeRequests().anyRequest().authenticated();
		// http.csrf();
		//http.exceptionHandling().accessDeniedPage("/Page404");
	//} 
	

}
