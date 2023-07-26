/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms;

/**
 *
 * @author Asunet
 */
public abstract class  User {
 String name;
 int Id;
 String email;
 String password;

    public User(String name, int Id, String email, String password) {
        this.name = name;
        this.Id = Id;
        this.email = email;
        this.password = password;
    }
    public User(String email, String password) {
        
        this.email = email;
        this.password = password;
    }
  
}
