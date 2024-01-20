package OOP;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department {

    String teamLead="Ercan Helvaci";
    List<String> personelList= new ArrayList<>(5);
    String name1="test3";
    String task1="tamamlandi";
    List<String> taskList=new ArrayList<>(5);

    public Department(String teamLead){

        this.teamLead=teamLead;
    }


    public void LeadDegistir(){

        teamLead="Belemir Helvaci";
        System.out.println("yeni teamLead" +teamLead);
    }

    public void personelAdd(){

        personelList.add(name1);

    }

    public void personelRemove() {

        personelList.remove(name1);
    }

    public void personelChange(){

        personelList.replaceAll(name1 -> "x" + name1);

    }


    public void TaskAdd(){

        taskList.add(task1);

    }

    public void TaskRemove(){

        taskList.remove(task1);

    }

    public void taskTamamlandi(){

        if(task1.equalsIgnoreCase("tamamlandi")){

            System.out.println("Tasklar tamamlanmıştır");
        }

    }
}