package com.example.mariageapp.Controller;


import com.example.mariageapp.Model.Guests;
import com.example.mariageapp.Repository.GuestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuestsController {

    @Autowired
    GuestsRepository guestsRepository;

    //Ajouter des utilisateurs
    @PostMapping(path = "/guests")
    public String PostGuests(@RequestBody Guests guests){
        guestsRepository.save(guests);
        return "Invité ajouté !";
    }

    //Aller chercher TOUT les utilisateurs
    @GetMapping(path = "/guests/all")
    public Iterable<Guests> GetAllGuests(){
        return guestsRepository.findAll();
    }

    //Suppréssion des utilisateurs
    @DeleteMapping(path = "/guests/delete/{id}")
    public String DeleteGuests(@PathVariable String id){
        guestsRepository.deleteById(id);
        return "Invitation annulé !";
    }

    //Modification des utilisateurs
    @PostMapping(path = "/guests/update/{id}")
    public String UpdateGuests(@PathVariable String id, @RequestBody Guests guests){
        guestsRepository.save(guests);
        return "Utilisateur modifié";
    }

}
