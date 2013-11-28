/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ChrisvanderHeijden
 */
public class Passenger {
    private String label;
    private String color;
    private String shape;
    private String name;
    private String surname;
    private String adres;
    private String residentAdres;
    private String postalCode;
    private String city;
    private String details;

    public Passenger(String label, String color, String shape, String name, String surname, String adres, String residentAdres, String postalCode, String city, String details) {
        this.label = label;
        this.color = color;
        this.shape = shape;
        this.name = name;
        this.surname = surname;
        this.adres = adres;
        this.residentAdres = residentAdres;
        this.postalCode = postalCode;
        this.city = city;
        this.details = details;
    }
    
    
    
}
