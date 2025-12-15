package com.pro_dev.FAMILY_TREE.model;

import java.util.List;

public class Sante {

    private List<String> maladies;
    private List<String> allergies;
    private List<String> conditionsChroniques;

    public Sante(List<String> maladies, List<String> allergies, List<String> conditionsChroniques) {
        this.maladies = maladies;
        this.allergies = allergies;
        this.conditionsChroniques = conditionsChroniques;
    }

    // Getters & Setters
}