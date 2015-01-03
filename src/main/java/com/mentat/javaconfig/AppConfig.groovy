package com.mentat.javaconfig

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(['com.mentat.javaconfig.beans'])
class AppConfig {
	@Bean
	repoName() {
		'babyNameRepo'
	}
}
