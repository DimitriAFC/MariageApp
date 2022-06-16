package com.example.mariageapp.Repository;

import com.example.mariageapp.Model.Guests;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestsRepository extends CrudRepository<Guests, String> {
}
