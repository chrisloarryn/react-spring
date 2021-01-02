package com.hg.crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hg.crud.models.TodoDTO;
import com.hg.crud.repositories.ITodoDAO;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/todos")
public class TodoController {

	@Autowired
	private ITodoDAO repository;

	@PostMapping("/todo")
	public TodoDTO create(@Validated @RequestBody TodoDTO t) {
		return repository.insert(t);
	}

	@GetMapping("/")
	public List<TodoDTO> readAll() {
		return repository.findAll();
	}

	@GetMapping("/todo/{id}")
	public Optional<TodoDTO> readOne(@PathVariable String id) {
		return repository.findById(id);
	}

	@PutMapping("/todo/{id}")
	public TodoDTO update(@PathVariable String id, @Validated @RequestBody TodoDTO t) {
		return repository.save(t);
	}

	@DeleteMapping("/todo/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}
