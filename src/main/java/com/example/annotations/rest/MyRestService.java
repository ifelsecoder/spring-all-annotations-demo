package com.example.annotations.rest;

import com.example.annotations.util.MyLogger;
import com.example.annotations.bean.MySecondBean;
import com.example.annotations.database.sqlite.model.Person;
import com.example.annotations.database.sqlite.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MyRestService {

	private static final String ANNOTATIONS = " [ANNOTATIONS:  " +
													"@Autowired, @Service, @Transactional" +
												"]";

    @Autowired
    private MySecondBean mySecondBean;

    @Autowired
    private PersonRepository personRepository;


	public void getStuff() {
		MyLogger.log("MyRestService, getStuff - called" + ANNOTATIONS);
	}

	public void postStuff() {
		MyLogger.log("MyRestService, postStuff - called" + ANNOTATIONS);
	}

	public void putStuff() {
		MyLogger.log("MyRestService, putStuff - called" + ANNOTATIONS);
	}

	public void patchStuff() {
		MyLogger.log("MyRestService, patchStuff - called" + ANNOTATIONS);
	}

    public void findByFirstname(String firstname) {
        MyLogger.log("MyRestService, findPersonByFirstname - called, firstname: " + firstname + ANNOTATIONS);

		Person person = personRepository.findByFirstname(firstname);

		MyLogger.log("MyRestService, findPersonByFirstname - called, found: " + (person != null));
        MyLogger.log("MyRestService, findPersonByFirstname - called, person: " + person);
    }

    public void findByFirstnameAndLastname(String firstname, String lastname) {
        MyLogger.log("MyRestService, findByFirstnameAndLastname - called, firstname: " + firstname +
                     ", lastname: " + lastname + ANNOTATIONS);

		Optional<Person> optionalPerson = personRepository.findByFirstnameAndLastname(firstname, lastname);

		MyLogger.log("MyRestService, findPersonByFirstnameAndLastname - called, firstname: " + firstname +
					 ", lastname: " + lastname + ", found: " + optionalPerson.isPresent());
        MyLogger.log("MyRestService, findPersonByFirstnameAndLastname - called, firstname: " + firstname +
                     ", lastname: " + lastname + ", person: " + optionalPerson.get());
	}

	@Transactional
    public void findByLastnameOrFullname(String lastname, String fullname) {
        MyLogger.log("MyRestService, findByLastnameOrFullname - called, lastname: " + lastname +
                     ", fullname: " + fullname + ANNOTATIONS);

		List<Person> persons = personRepository.findPersonUsingByLastnameOrFullname(lastname, fullname);

		MyLogger.log("MyRestService, findPersonByLastnameOrFullname - called, lastname: " + lastname +
					 ", fullname: " + fullname + ", found: " + persons.size());
    }

	public void checkIsFile() {
		MyLogger.log("MyRestService, checkIsFile - called" + ANNOTATIONS);
		mySecondBean.isFile();
	}
}
