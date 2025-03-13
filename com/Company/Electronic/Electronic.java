package com.Company.Electronic;
import com.Company.person.*;
public class Electronic extends persen {
    public boolean checkElectronicexpert(){
        boolean check=false;
        if (getDetails_side()=="Electronics expert"){
            check=true;
        }
        return check;
    }
    public void printElectronicpersonalsinfo(){
        if (checkElectronicexpert()==true){
            System.out.println("Electronics team : ");
            showpersoninfo();
        }else {
            System.out.println("error");
        }
    }

    @Override
    public void getMeeting() {
        if (checkElectronicexpert()==true){System.out.println("Continuation of the meeting with the electronics team........");}
    }

    @Override
    public void setSalary(int salary) {
        if (0<salary&&salary<40){super.setSalary(salary);}else {System.out.println("error");}
    }
}
