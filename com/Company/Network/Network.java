package com.Company.Network;
import com.Company.person.*;
import com.Company.servers.servers;
public class Network extends persen implements servers {
    public boolean checknetworkexpert(){
        boolean check=false;
        if (getDetails_side()=="com.Company.Network.Network expert"){
            check=true;
        }
        return check;
    }
    public void printNetworkpersonalsinfo(){
        if (checknetworkexpert()==true){
            System.out.println("com.Company.Network.Network team : ");
            showpersoninfo();
        }else {
            System.out.println("error");
        }
    }

    @Override
    public void getMeeting() {
        if (checknetworkexpert()==true){System.out.println("The end of the meeting with the network team and review of the attacks on the company............");}
    }

    @Override
    public void setSalary(int salary) {
        if (1<salary&& salary<30){super.setSalary(salary);}else {System.out.println("error");}
    }
    //-----------------------------------------------------------------------------------------

    @Override
    public boolean request() {
        boolean request=false;
        if (getSsh()=="i need to ssh"){
            request=true;
        }
        return request;
    }
    @Override
    public boolean check_policy() {
        boolean policy=false;
        if (request()==true) {
            if (getAccess_level() == "rwe" || getAccess_level() == "rw" || getAccess_level() == "r") {
                policy=true;
            }
        }
        return policy;
    }

    @Override
    public void connection() {
        if (check_policy()==true) {
            System.out.println("you are connected to server with ssh line and you are access level is :" + getAccess_level());
        }else {
            System.out.println("error");
        }
    }
    //------------------------------------------------------------------------------------------
}