package com.Company.Management;
import com.Company.person.*;

public class Management extends persen {
    public boolean checkManagementside(){
        boolean check=false;
        if (getDetails_side()=="CEO"||getDetails_side()=="technical manager"){
            check=true;
        }
        return check;
    }
    public void printManagementpersonalsinfo(){
        if (checkManagementside()==true){
            System.out.println("com.Company.Management.Management team : ");
            showpersoninfo();
        }else {
            System.out.println("error");
        }
    }

    @Override
    public void getMeeting() {
        super.getMeeting();
        if (getDetails_side()=="CEO"){System.out.println("Start the meeting with the CEO explanation......");}
        if (getDetails_side()=="technical manager"){System.out.println("Continuation of the meeting of the technical manager........");}
    }

    @Override
    public void setSalary(int salary) {
        if (0<salary&&salary<45){super.setSalary(salary);}else {System.out.println("error");}
    }
}
