import java.util.Scanner;

class Teaching extends Staff{
    Scanner sc=new Scanner(System.in);
    String Domain, Pub;
    void read_Teaching(){
        super.read();
        System.out.println("Enter Domain");
        Domain=sc.nextLine();
        System.out.println("Enter Publication");
        Pub=sc.nextLine();
    }
    void display(){
        super.display();
        System.out.printf("%-20s","DOMAIN");
        System.out.printf("%-20s",Domain);
        System.out.printf("%-20s","PUBLICATION");
        System.out.printf("%-20s",Pub);
    }
}

class Technical extends Staff{
    Scanner sc=new Scanner(System.in);
    String Skills;
    void read_Technical(){
        super.read();
        System.out.println("Enter Skills");
        Skills=sc.nextLine();
    }
    void display(){
        super.display();
        System.out.printf("%-20s","SKILLS");
        System.out.printf("%-20s",Skills);
    }
}

class Contract extends Staff{
    Scanner sc=new Scanner(System.in);
    String Period;
    void read_Contract() {
        super.read();
        System.out.println("Enter Period");
        Period = sc.nextLine();
    }
    void display(){
        super.display();
        System.out.printf("%-20s","PERIOD");
        System.out.printf("%-20s",Period);
}
}

public class staffDetails{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of staff details to be created");
        int n=sc.nextInt();
        Teaching steach[]=new Teaching[n];
        Technical stech[]=new Technical[n];
        Contract scon[]=new Contract[n];
        System.out.println("Enter Teaching Staff Details");
        for(int i=0;i<n;i++){
            steach[i]=new Teaching();
            steach[i].read_Teaching();
        }
        System.out.println("Enter Technical Staff Details");
        for(int i=0;i<n;i++){
            stech[i]=new Technical();
            stech[i].read_Technical();
        }
        System.out.println("Enter Contract Staff Details");
        for(int i=0;i<n;i++){
            scon[i]=new Contract();
            scon[i].read_Contract();
        }

        System.out.println("------------STAFF DETAILS----------");
        System.out.println("-----TEACHING STAFF DETAILS------");
        for(int i=0;i<n;i++){
            System.out.println("");
            steach[i].display();
        }
        System.out.println("");
        System.out.println("-----TECHNICAL STAFF DETAILS------");
        for(int i=0;i<n;i++){
            System.out.println("");
            stech[i].display();
        }
        System.out.println("");
        System.out.println("-----CONTRACT STAFF DETAILS------");
        for(int i=0;i<n;i++){
            System.out.println("");
            scon[i].display();
        }
    }
}
