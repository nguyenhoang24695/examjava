/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student implements Serializable{

    String fnrollID;
    String firstName;
    String lastName;
    int age;

    public Student(String fnrollID, String firstName, String lastName, int age) {
        this.fnrollID = fnrollID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student() {
    }

    public String getFnrollID() {
        return fnrollID;
    }

    public void setFnrollID(String fnrollID) {
        this.fnrollID = fnrollID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Student add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID");
        String id = sc.nextLine();
        System.out.println("Nhap FirstName");
        String firstName = sc.nextLine();
        System.out.println("Nhap LastName");
        String lastName = sc.nextLine();
        System.out.println("Nhap Age");
        int age = Integer.parseInt(sc.nextLine());

        Student st1 = new Student(id, firstName, lastName, age);
//        st1.toString();
        System.out.println("Done");
        return st1;

    }

    public static void save(Student st1) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/students.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ArrayList<Student> studentList = new ArrayList();
            studentList.add(st1);
            oos.writeObject(studentList);
            fos.close();
            oos.close();
            System.out.println("Donr saved");
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

    }

    public static void display() {
        try {
            FileInputStream fis = new FileInputStream("D:/students.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Student> studentList = (ArrayList<Student>) ois.readObject();
            System.out.println("EnrollID    FullName    Age");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(studentList.get(i).getFnrollID()+"   "+studentList.get(i).getLastName()+" "+studentList.get(i).getFirstName()+"  "+studentList.get(i).getAge());
            }
            System.out.println("End");
            
        } catch (Exception e) {
        }
    }
    

}
