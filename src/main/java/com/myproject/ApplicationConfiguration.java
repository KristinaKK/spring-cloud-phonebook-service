package com.myproject;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.domain.Person;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/phonebook")
public class ApplicationConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
	
	private List<Person> phonebookList = Arrays.asList(
	        new Person(1L, "Luisa", "Luisic", "123-456-789"),
	        new Person(2L, "Albert", "Albertic", "321-654-987"),
	        new Person(3L, "Max", "Maxic", "654-123-321"),
	        new Person(4L, "Edi", "Edic", "789-987-456")
	 );
	
	@GetMapping("")
    public List<Person> findAllBooks() {
        return phonebookList;
    }
	
	@GetMapping("/{personId}")
    public Person findBook(@PathVariable Long personId) {
        return phonebookList.stream().filter(p -> p.getId().equals(personId)).findFirst().orElse(null);
    }

}
