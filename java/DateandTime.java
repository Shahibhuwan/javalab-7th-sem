/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Dell
 */

public class DateandTime {
    void displayTIme()
    {
        LocalTime myObj = LocalTime.now();
        System.out.println("Local Time is:");
        System.out.println(myObj);
    }
    void displayDT(){
        LocalDateTime myobj = LocalDateTime.now();
        System.out.println("Local DATE  time is");
        System.out.println(myobj);
        
    }
      void formatDateTime() {
        LocalDateTime obj3 = LocalDateTime.now();
        System.out.printf("Date time befor formatting: ", obj3);
        
        DateTimeFormatter obj4 = DateTimeFormatter.ofPattern("dd.MM.yyyy ss:mm:HH");
        
        String obj5 = obj3.format(obj4);
        System.out.printf("Date time after formatting:", obj5);
    }

    
    
    public static void main(String [ ] args){
    
        DateandTime obj =new DateandTime();
        obj.displayTIme();
        
        obj.formatDateTime();
        obj.displayDT();
    }
    
}
