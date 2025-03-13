package com.Company.person;

public class persen {
    private String fullname;
    private int age;
    private String side;
    private String activity;
    private String details_side;
    private String opinion;
    private int salary;
    private String ssh;
    private String access_level;



    public String getFullname() {return this.fullname;}

    public void setFullname(String fullname) {this.fullname = fullname;}

    private int getAge() {return this.age;}

    public void setAge(int age) {this.age = age;}

    private String getSide() {return this.side;}

    public void setSide(String side) {this.side = side;}

    public void setActivity(String activity){
        if (activity=="current"){
            this.activity=activity;
        }else if (activity=="Non current"){
            this.activity=activity;
        }else{
            System.out.println("error,Please write \"current\" if it is current, otherwise write \"Non current\" ");
        }
    }
    public void setDetails_side(String details_side){
        if (details_side=="CEO"||details_side=="technical manager"||details_side=="Electronics expert"||details_side=="com.Company.Network.Network expert"){
            this.details_side=details_side;
        }else {
            System.out.println("error");
        }
    }

    public String getDetails_side() {return this.details_side;}

    public String getActivity() {return this.activity;}

    public void showpersoninfo(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| he/she fullname :"+getFullname()+" | age :"+getAge()+" | side :"+getSide()+" | activity status :"+getActivity()+" | details side : "+getDetails_side()+" |");

    }

    public String getOpinion() {return this.opinion;}

    public void setOpinion(String text) {this.opinion = text;}

    public int getSalary() {return this.salary;}

    public void setSalary(int salary) {this.salary = salary;}

    public void getMeeting() {System.out.println(" starting the meeting....");}

    public String getSsh() {return this.ssh;}

    public void setSsh(String ssh){this.ssh=ssh;}
    public String getAccess_level() {return this.access_level;}

    public void setAccess_level(String access_level) {this.access_level = access_level;}
}
