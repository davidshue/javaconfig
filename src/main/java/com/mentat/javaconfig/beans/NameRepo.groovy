package com.mentat.javaconfig.beans

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class NameRepo {
	@Autowired
	@Qualifier('repoName')
	private String name
	
	String getNewName() {
		name.reverse()
	}
}
