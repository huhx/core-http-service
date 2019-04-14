package com.linux.huhx.http.controller;

import com.linux.huhx.http.domain.People;
import java.util.Date;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {

  @GetMapping("/{id}")
  public ResponseEntity<People> getPeopleById(@PathVariable("id") String id) {
    return ResponseEntity.ok(new People(id, "huhx", 25, new Date()));
  }

  @GetMapping
  public ResponseEntity<People> getPeopleByIdParameter(@RequestParam("id") String id) {
    return ResponseEntity.ok(new People(id, "huhx", 25, new Date()));
  }

  @PostMapping
  public ResponseEntity<People> addPeople(@RequestBody People people) {
    people.setId("add");
    return ResponseEntity.ok(people);
  }

  @PutMapping
  public ResponseEntity<People> updatePeople(@RequestBody People people) {
    people.setId("update");
    return ResponseEntity.ok(people);
  }

  @DeleteMapping
  public ResponseEntity<People> deletePeople(@RequestBody People people) {
    people.setId("delete");
    return ResponseEntity.ok(people);
  }
}
