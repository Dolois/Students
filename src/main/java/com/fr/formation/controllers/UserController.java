package com.fr.formation.controllers;

import com.fr.formation.dtos.UserCreateDto;
import com.fr.formation.dtos.UserUpdateDto;
import com.fr.formation.dtos.UserGetIdDto;
import com.fr.formation.services.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    /** Pour tester votre methodes create 'creation d'un etudiant'
     * avec POSTMAN : POST => localhost:8080/students/api/users
     * avec MySQL WorkBench verifier la création d'un nouveau etudiant dans la table User
     */
    
    @PostMapping // Pas de chemin necessaire car ma méthode pour créer un user est unique.
    protected void create(@Valid @RequestBody UserCreateDto user) {
        service.create(user);
    }

    /** Pour tester votre methodes update 'modification d'un etudiant a partir de d'id' 
     * avec POSTMAN : PUT => localhost:8080/students/api/users/1
     * avec MySQL WorkBench verifier la modification de l'etudiant dans la table User
     */
    
    @PutMapping("/{id}")
    protected void update(@PathVariable(value = "id") Long id, @Valid @RequestBody UserUpdateDto user) {
    	service.update(user, id);
    }
    
    @GetMapping("/{id}")
    protected void getUserId(@PathVariable(value = "id") Long id, @Valid @RequestBody UserGetIdDto user) {
    	service.getUserId(user, id);
    }
}