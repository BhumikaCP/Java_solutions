import java.util.*;
import java.io.*;

    public class Email_address{
        public static void main(String args[]){
            String email_id;
            boolean validCheck=false;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the email address");
            email_id=sc.nextLine();
            int len=email_id.length();
            int index=email_id.indexOf('@');
            String ending= email_id.substring(len-4,len);
            System.out.println(ending);
            if(ending==".com"||ending==".net"||ending==".org") {
                validCheck = true;
            }
            if(index-1=='.' && index-1=='-' && email_id.charAt(0)=='.' && email_id.charAt(0)=='-')
                validCheck=false;

            System.out.println("Email address valid? "+validCheck);
        }
    }
