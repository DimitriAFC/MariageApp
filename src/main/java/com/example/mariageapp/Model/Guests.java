package com.example.mariageapp.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Guests {
    @Id
    public String id;
    public String firstName;
    public String lastName;
    public Meal mealName;
    public Ceremonies ceremonies;

    Guests(String id, String firstName, String lastName, Meal mealName, Ceremonies ceremonies){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mealName = mealName;
        this.ceremonies = ceremonies;
    }
}
