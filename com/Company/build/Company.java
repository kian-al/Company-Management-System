package com.Company.build;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Company {
    private String name;
    private int Production_Year;

    private String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    private int getProduction_Year() {return Production_Year;}

    public void setProduction_Year(int production_Year) {this.Production_Year = production_Year;}

    private List<String> projects=new ArrayList<>();

    public void setProjects(String...project_name){
        for (String project : project_name) {
            Collections.addAll(this.projects, project);
        }
    }
    private List<String> services=new ArrayList<>();
    public void setServices(String...service){
        for (String item:service){
            Collections.addAll(this.services, item);
        }
    }

    private List<String> getProjects() {return this.projects;}
    private List<String> getServices() {return this.services;}

    public void showcompanyinfo(){
        int i=1;
        System.out.println("com.Company.Companys.Company name :"+getName());
        System.out.println("com.Company.Companys.Company production year :"+ getProduction_Year());
        System.out.println("project : ");
        for (String item:getProjects()){
            System.out.println(i+" : "+item);
            i++;
        }
        System.out.println("services : ");
        i=1;
        for (String item:getServices()){
            System.out.println(i+" : "+item);
            i++;
        }
    }
}