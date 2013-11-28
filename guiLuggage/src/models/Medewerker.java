/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ChrisvanderHeijden
 */
public class Medewerker {
    private String name;
    private String username;
    private boolean appManager;
    private char[] password;
    private char[] confirmPassword;

    public Medewerker(String name, String username, char[] password, boolean appManager) {
        this.name = name;
        this.username = username;
        this.appManager = appManager;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public Medewerker(String name, String username, char[] password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAppManager() {
        return appManager;
    }

    public void setAppManager(boolean appManager) {
        this.appManager = appManager;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public char[] getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(char[] confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    
    
    
}
