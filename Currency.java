package CurrencyConversion;

import java.util.Scanner;

public class Currency {
    double inr,usd,yen,euro;
    Scanner sc=new Scanner(System.in);
    public void rtd(){
        System.out.println("Enter in rupees");
        inr=sc.nextDouble();
        usd=inr/67;
        System.out.println(inr+" rupees in dollars= "+usd);
    }
    public void dtr(){
        System.out.println("Enter in dollars");
        usd=sc.nextDouble();
        inr=usd*67;
        System.out.println(usd+" dollars in rupees= "+inr);
    }
    public void etr(){
        System.out.println("Enter in euro");
        euro=sc.nextDouble();
        inr=euro*79.50;
        System.out.println(euro+" euros in rupees= "+inr);
    }
    public void rte(){
        System.out.println("Enter in rupee");
        inr=sc.nextDouble();
        euro=inr/79.50;
        System.out.println(inr+" rupees in euro= "+euro);
    }
public void ytr(){
    System.out.println("Enter in yen");
    yen=sc.nextDouble();
    inr=yen*0.61;
    System.out.println(yen+"yen in rupee= "+inr);
}
    public void rty(){
        System.out.println("Enter in rupee");
        inr=sc.nextDouble();
        yen=inr/0.61;
        System.out.println(inr+"rupee in yen= "+yen);
    }
}
