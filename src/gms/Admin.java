/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms;

import java.util.Scanner;

/**
 *
 * @author Asunet
 *
 */
public class Admin extends User {

    public Admin(String email, String password) {
        super(email, password);
    }

    public Admin(String name, int Id, String email, String password) {
        super(name, Id, email, password);
    }
    String admin_email_1 = "rawan@gmail.com";
    String admin_password_1 = "12345";
    String admin_email_2 = "rony@gmail.com";
    String admin_password_2 = "245";
    Trainer[] t = new Trainer[2];

    /*public void Check_Admin(Admin a)
    {
      
        if(a.email.equals(this.email)&&a.password.equals(this.password))
        {
            System.out.println("Correct!");
            a.AddTrainer();
            
        }
    
    }*/
    public boolean check(String mail, String pass) {
        

        if(mail.equals(admin_email_1) && pass.equals(admin_password_1)) {
            System.out.println("Correct!");
           
            return true;
        }if(mail.equals(admin_email_2) && pass.equals(admin_password_2))
        {
            System.out.println("Correct!");
            
            return true;
        }
        else {
            System.out.println("Incorrect ,please enter your password and mail again");

            return false;
        }
    }


    public void addTrainer(Trainer trainer, int index) {
        t[index] = trainer;

    }

    public void displayTrainer() {
        for (int i = 0; i < 2; i++) {
            t[i].displayinfo();
        }
    }
}
