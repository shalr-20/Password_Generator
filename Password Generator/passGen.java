import java.util.Random;
import java.util.Scanner;
public class passGen{
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String digits="0123456789";
        String specialChar="!@#$%^&*()_+-={}[]<>,./?";
        String comb=upper+lower+specialChar+digits;
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length for your password: ");
        int len= sc.nextInt();
        
        char[] password=new char[len];
        Random r=new Random();
        for(int i=0; i<len; i++){
            password[i]=comb.charAt(r.nextInt(comb.length()));
        }
        System.out.println("Generated password is: "+new String(password));
    }
}