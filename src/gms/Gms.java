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
 */
public class Gms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
    Scanner in = new Scanner(System.in);
        System.out.println("Enter your mail please");
        String E_mail = in.next();
        System.out.println("Enter your password please");
        String a_password = in.next();
        Admin admin = new Admin(E_mail,a_password);
    Trainer t1=new Trainer("KHOLOD",76);
        Trainer t2=new Trainer("Reham",79);

    if(admin.check(E_mail,a_password) == true)
    {
        
        admin.addTrainer(t1, 0);
        admin.addTrainer(t2,1);
        admin.displayTrainer();
    }else
    {
        System.out.println("Enter your mail please");
        String mail = in.next();
        System.out.println("Enter your password please");
        String pass = in.next();
        admin.check(mail, pass);
    }
            
    
    }
    
}
