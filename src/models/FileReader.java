package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
     

    public static void readFile() throws FileNotFoundException{
        ArrayList<Employees> empList = new ArrayList<>();
        File f = new File("filbt.txt");
        Scanner scanner = new Scanner(f,"utf-8");
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] lineArray = line.split(":") ;
            Employees emp = new Employees();
            emp.setName(lineArray[0]); 
            emp.setCity(lineArray[1]); 
            emp.setAddress(lineArray[2]);
            emp.setBorn(lineArray[3]);
            emp.setSalary(Integer.parseInt(lineArray[4]));
            empList.add(emp);
            System.out.println(emp.getName() +", "+ emp.getCity() + ", " + emp.getAddress() + ", " + emp.getBorn() + ", " + emp.getSalary());
           
            //System.out.print(emp.getAddress());
            //System.out.print(emp.getBorn());
            //System.out.print(emp.getSalary());

        }  
         
    }
}
