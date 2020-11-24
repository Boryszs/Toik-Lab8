package com.demo.springboot;

public class ValidatePesel {


    public ValidatePesel() {
    }

    public boolean validate(String pesel){
        int count=0;

        if(pesel.length()!=11){
            return false;
        }
        if(pesel.matches("[0-9]+")==false){
            return false;
        }


        count=(Integer.parseInt(String.valueOf(pesel.charAt(0)))*1)+
              (Integer.parseInt(String.valueOf(pesel.charAt(1)))*3)+
                (Integer.parseInt(String.valueOf(pesel.charAt(2)))*7)+
                (Integer.parseInt(String.valueOf(pesel.charAt(3)))*9)+
                (Integer.parseInt(String.valueOf(pesel.charAt(4)))*1)+
                (Integer.parseInt(String.valueOf(pesel.charAt(5)))*3)+
                (Integer.parseInt(String.valueOf(pesel.charAt(6)))*7)+
                (Integer.parseInt(String.valueOf(pesel.charAt(7)))*9)+
                (Integer.parseInt(String.valueOf(pesel.charAt(8)))*1)+
                (Integer.parseInt(String.valueOf(pesel.charAt(9)))*3)+
                (Integer.parseInt(String.valueOf(pesel.charAt(10)))*1);


        if((count%10)==0){
            return true;
        }

        return false;
    }

}
