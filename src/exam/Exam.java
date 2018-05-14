/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = null;
        while (true) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("---------Menu-------------");
            System.out.println("1. Add new student");
            System.out.println("2. Save");
            System.out.println("3. Display all Student");
            System.out.println("4. Exit");
            int numbMenu = Integer.parseInt(sc.nextLine());
            switch(numbMenu){
                case 1:
//                        Student.add();
                        st1 = Student.add();
//                        st1.toString();
                        
                        break;
                case 2: 
//                        System.out.println(st1.getAge());
                        Student.save(st1);
                        break;
                case 3:
                        Student.display();
                        break;
                case 4: 
                        return;
            }
        }

    }

}
