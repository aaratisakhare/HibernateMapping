package com.techprimers.jpa.springjpahibernateexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.model.Users;
import com.techprimers.jpa.springjpahibernateexample.model.UsersContact;
import com.techprimers.jpa.springjpahibernateexample.repository.UsersContactRepository;

import antlr.collections.List;

@RequestMapping("/rest/userscontact")
@RestController
public class UsersContactResource {
	private UsersContactRepository usersContactRepository;

	public UsersContactResource(UsersContactRepository usersContactRepository) {
		//super();
		this.usersContactRepository = usersContactRepository;
	}
	
	@GetMapping(value="/all")
	public java.util.List<UsersContact> getUsersContact(){
		return usersContactRepository.findAll();
	}
	
	@GetMapping(value="/update/{name}")
	public java.util.List<UsersContact> update(@PathVariable final String name){
		
		Users u1 = new Users();
		UsersContact usersContact = new UsersContact();
		
		u1.setId(101).setName("Aarti").setSalary(11111).setTeamName("city");
		usersContact.setPhoneNo(1111).setUsers(u1);
		
		usersContactRepository.save(usersContact);
		return usersContactRepository.findAll();
	}
	
}
