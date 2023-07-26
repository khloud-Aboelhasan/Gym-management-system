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
public class Trainer{
    String name;
    int id;

    public Trainer(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayinfo()
    {
        System.out.println("Name is: " + name);
        System.out.println("Id is: " + id);
    }
    
}
