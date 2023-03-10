import java.util.*;
public class New {
    public static void main(String args[]){
        System.out.println("Tax Calculator App");
        System.out.println("-----Welcome-----");
        System.out.println("Enter total person Count");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println("enter name" +i);
            String name=sc.nextLine();
            System.out.println("enter" +name +"Annual Income");
            Long income=sc.nextLong();
            System.out.println(calculateTax());
        }
    }
    long[] Taxx= new long[5];
    taxx[0]=tax;
    tax[1]= tax2;
    tax[2]= tax3;
    public void calculateTax(){
        for(int i=o; i=income; i++){
            if(i>=300000){
                long tax = income*20;
                long tax2 = tax/100;
                System.out.println(tax2);
            } else if(i>=100000 && i<300000){

                long tax3 = (income*20)/100;
                System.out.println(tax3);
            } else if(i<100000){
                System.out.println("you are exempted of paying tax");
            }
        }

    }
}
public class New {
    
}
