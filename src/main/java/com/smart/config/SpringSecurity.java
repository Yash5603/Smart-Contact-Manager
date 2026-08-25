package com.smart.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SpringSecurity {
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests((authorize) ->
//		authorize.requestMatchers("/*").permitAll()
//		.requestMatchers("/index/**").permitAll()
//		.requestMatchers("/users/index/**").permitAll()
//		.requestMatchers("/do_register/save/**").permitAll()
//		.requestMatchers("/admin/**").hasRole("ADMIN")
//		.requestMatchers("/users/**").hasRole("USER")
		authorize.requestMatchers("/users/**").hasRole("USER").requestMatchers("/**").permitAll()

		).formLogin(form -> form.loginPage("/users/login").loginProcessingUrl("/users/login")
				.defaultSuccessUrl("/users/index").permitAll())

				.logout(logout -> logout.logoutUrl("/logout").logoutSuccessUrl("/users/login").permitAll());
		return http.build();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

}
