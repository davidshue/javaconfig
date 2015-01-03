package com.mentat.javaconfig

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

import com.mentat.javaconfig.beans.NameRepo

class AppRunner {
	static main(args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class)
		
		NameRepo nameRepo = ac.getBean('nameRepo')
		
		println nameRepo.getNewName()
	}
}
