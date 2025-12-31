package Practice;

import java.util.Scanner;
// by myself without ai
// used gemini to fix the possible mistakes

public class PrePlacementTestProblem41 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String LicenseNo= "";
        boolean valid = true;
        String input = scan.nextLine();
        String[] part = input.split(" ");
        String name = part[0] ;
        if(! name.matches("[a-zA-Z]+")) valid = false;
        if(name.length()>=3){
            String ans = name.substring(0,3).toUpperCase();
            if(ans.matches("[A-Z0-9]{3}")) LicenseNo+=ans;
            else valid = false;
        }
        else if(name.length()==2){
            String ans = name.substring(0,2).toUpperCase() + "X" ;
            if(ans.matches("[A-Z0-9]{3}")) LicenseNo+=ans;
            else valid = false;
        }
        else{
            String ans =name.substring(0,1).toUpperCase() +"XX" ;
            if(ans.matches("[A-Z0-9]{3}")) LicenseNo+=ans;
            else valid = false;
        }
        LicenseNo += '-';

        String carBrand = part[1];
        LicenseNo += carBrand.substring(0,2).toUpperCase();
        LicenseNo += '-';

        String bookingduration =  part[2];
        if(bookingduration.matches("[0-9]+")){
            int n = Integer.parseInt(bookingduration);
            if(n<1 || n>30) valid = false;
            LicenseNo+=bookingduration;
            LicenseNo += '-';
        }else valid = false;


        String phnNo = part[3];
        if(phnNo.length()==10 && phnNo.matches("[0-9]+")){
            LicenseNo += phnNo.substring(7,10);
            LicenseNo += '-';
        }else valid = false ;

        if(part[4].equals("electric")) LicenseNo+="E3";
        else if(part[4].equals("petrol")) LicenseNo+="P1";
        else if(part[4].equals("diesel")) LicenseNo+="D2";
        else  valid = false ;

        if(valid) System.out.println(LicenseNo);
        else System.out.println("Invalid License Key");
    }
}
