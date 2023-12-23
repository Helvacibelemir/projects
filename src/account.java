import java.util.Scanner;

public class account {


     int workingTime;
    int dailyAmount=1000;
    int extraDailyAmount;
    int totalSalary;
    int mainSalary;


    public int calculate(){

        mainSalary=workingTime*dailyAmount;

        return mainSalary;
    }
    public int extraCalculate(){

        int extraDay = workingTime-25;
        extraDailyAmount = extraDay * 1000;

        return extraDailyAmount;
    }


    public void extra(){

        if(workingTime>25 && workingTime<=30) {

           totalSalary=extraCalculate()+calculate();
            System.out.println("Totalsalary is"+"\t"+totalSalary);
        }
        else if(workingTime<=25 && workingTime>=0) {

            totalSalary=calculate();
            System.out.println("Totalsalary is"+"\t"+totalSalary);
        }

       else {

            System.out.println("wrong input");
        }
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        account ac=new account();
        System.out.println("you should enter WorkingTime"+"\n");
        ac.workingTime=sc.nextInt();
        System.out.println("WorkingTime is"+"\t" +ac.workingTime);
        ac.extra();

    }
    }

