package com.example.annotations.rest;

import com.example.annotations.util.MyLogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class MyRestController {

	private static final String ANNOTATIONS = " [ANNOTATIONS:  " +
													"@Autowired, @GetMapping, @PatchMapping, @PathVariable, " +
													"@PostMapping, @PutMapping, @RequestMapping, @RestController" +
												"]";

	@Autowired
	MyRestService restService;

	@GetMapping(value = "/get")
	public void get() {
		MyLogger.log("MyRestController, get - called" + ANNOTATIONS);
		restService.getStuff();
	}

	@PostMapping(value = "/post")
	public void post() {
		MyLogger.log("MyRestController, post - called" + ANNOTATIONS);
		restService.postStuff();
	}

	@PatchMapping(value = "/patch")
	public void patch() {
		MyLogger.log("MyRestController, patch - called" + ANNOTATIONS);
		restService.patchStuff();
	}

	@PutMapping(value = "/put/{id}")
	public void put(@PathVariable("id") Long id) {
		MyLogger.log("MyRestController, put - called, id: " + id + ANNOTATIONS);
		restService.putStuff();
	}

    @GetMapping(value = "/get/firstname/{firstname}")
    public void findByFirstname(@PathVariable("firstname") String firstname) {
        MyLogger.log("MyRestController, findByFirstname - called, firstname: " + firstname + ANNOTATIONS);
        restService.findByFirstname(firstname);
    }

    @GetMapping(value = "/get/firstnameandlastname/{firstname}/{lastname}")
    public void findByFirstnameAndLastname(@PathVariable("firstname") String firstname,
                                           @PathVariable("lastname") String lastname) {
        MyLogger.log("MyRestController, findByFirstnameAndLastname - called, firstname: " + firstname +
                     ", lastname: " + lastname + ANNOTATIONS);
        restService.findByFirstnameAndLastname(firstname, lastname);
    }

    @GetMapping(value = "/get/lastnameorfullname/{lastname}/{fullname}")
    public void findByLastnameOrFullname(@PathVariable("lastname") String lastname,
                                         @PathVariable("fullname") String fullname) {
        MyLogger.log("MyRestController, findByLastnameOrFullname - called, lastname: " + lastname +
                     ", fullname: " + fullname + ANNOTATIONS);
        restService.findByLastnameOrFullname(lastname, fullname);
    }

	@GetMapping(value = "/get/checkisfile")
	public void checkIsFile() {
		MyLogger.log("MyRestController, checkIsFile - called" + ANNOTATIONS);
		restService.checkIsFile();
	}
}
