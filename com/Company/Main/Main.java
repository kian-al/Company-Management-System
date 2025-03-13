package com.Company.Main;

import com.Company.build.Company;
import com.Company.Electronic.*;
import com.Company.Management.*;
import com.Company.Network.*;

public class Main  {
    public static void main(String[] args) {
        Company radman=new Company();
        radman.setName("Radman");
        radman.setProduction_Year(1391);
        radman.setProjects("Camera of water department","Water department network","Connecting wirelessly to all branches of the water department","Physical security of water administration network");
        radman.setServices("com.Company.Network.Network installation","Installation of all CCTV cameras","Installation of telecommunication towers","Installation of radio communications");
        radman.showcompanyinfo();
        //-----------------------------------------------------------------------------------------------------------------
        Management majid=new Management();
        majid.setFullname("Majid Almasi");
        majid.setAge(57);
        majid.setSide("management");
        majid.setDetails_side("CEO");
        majid.setActivity("current");
        majid.setOpinion("Nulla ultrices diam in eros tincidunt sodales.");
        //-----------------------------------------------------------------------------------------------------------------
        Management pouria=new Management();
        pouria.setFullname("Pouria Behrozan");
        pouria.setAge(35);
        pouria.setSide("management");
        pouria.setDetails_side("technical manager");
        pouria.setActivity("current");
        pouria.setOpinion("Quisque lorem sapien, consequat sit amet est a, lacinia suscipit dui. Ut sed sem lectus.");
        //-----------------------------------------------------------------------------------------------------------------
        Electronic hamid=new Electronic();
        hamid.setFullname("Hamid Almasi");
        hamid.setAge(46);
        hamid.setSide("technical");
        hamid.setDetails_side("Electronics expert");
        hamid.setActivity("current");
        hamid.setOpinion("In risus eros, laoreet pulvinar magna ac, semper finibus dui.");
        //-----------------------------------------------------------------------------------------------------------------
        Network mohamadreza=new Network();
        mohamadreza.setFullname("Mohamadreza Ahangari");
        mohamadreza.setAge(47);
        mohamadreza.setSide("technical");
        mohamadreza.setDetails_side("com.Company.Network.Network expert");
        mohamadreza.setActivity("current");
        mohamadreza.setOpinion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ");
        //-----------------------------------------------------------------------------------------------------------------
        majid.printManagementpersonalsinfo();
        pouria.printManagementpersonalsinfo();
        hamid.printElectronicpersonalsinfo();
        mohamadreza.printNetworkpersonalsinfo();
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Comments made about the company : ");
        System.out.println(mohamadreza.getOpinion());
        System.out.println(hamid.getOpinion());
        System.out.println(pouria.getOpinion());
        System.out.println(majid.getOpinion());
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        majid.getMeeting();
        pouria.getMeeting();
        hamid.getMeeting();
        mohamadreza.getMeeting();
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("The income of the company's employees : ");
        majid.setSalary(20);
        System.out.println(majid.getFullname()+" salary : "+majid.getSalary()+" details_side : "+ majid.getDetails_side());
        pouria.setSalary(20);
        System.out.println(pouria.getFullname()+" salary : "+pouria.getSalary()+" details_side : "+ pouria.getDetails_side());
        hamid.setSalary(12);
        System.out.println(hamid.getFullname()+" salary : "+hamid.getSalary()+" details_side : "+ hamid.getDetails_side());
        mohamadreza.setSalary(13);
        System.out.println(mohamadreza.getFullname()+" salary : "+mohamadreza.getSalary()+" details_side : "+ mohamadreza.getDetails_side());
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        mohamadreza.setSsh("i need to ssh");
        mohamadreza.setAccess_level("rw");
        mohamadreza.request();
        mohamadreza.check_policy();
        mohamadreza.connection();


    }
}