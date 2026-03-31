package Extra;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    // RE - regular expression
    public static void checkStringAgainstRE(String str , String RE ){
        Pattern p = Pattern.compile(RE);
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
    }
    public static void main(String[] args) {
// for alphanumeric character only
        while(true){
            System.out.println("Enter Regular Expression : ");
            Scanner scan = new Scanner(System.in);
            String re = scan.nextLine();
            System.out.println("Enter your String ");
            String str = scan.nextLine();
            checkStringAgainstRE(str, re);

            System.out.println("Want to exit [Y/N] ");
            String choice = scan.nextLine();
            if(choice.equalsIgnoreCase("Y")){
                System.out.println("Thanks for using the program ");
                break ;
            }
        }
    }
}
//
/*

Enter Regular Expression :
[0-9]{10}
Enter your String
7260081073
true
Want to exit [Y/N]

Enter Regular Expression :
[0-9]{10,}
Enter your String
9279857507305703
true
Want to exit [Y/N]

Enter Regular Expression :
[0-9]{10}
Enter your String
42875987573405709
false
Want to exit [Y/N]

Enter Regular Expression :

 */
// to validate alphanumeric character
/*
Enter Regular Expression :
[a-zA-Z]
Enter your String
A
true
Want to exit [Y/N]
n
Enter Regular Expression :
[a-zA-Z]
Enter your String
ab
false
Want to exit [Y/N]
n
Enter Regular Expression :
[a-zA-Z]+
Enter your String
AA
true
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z]+
Enter your String
abc
true
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z]+
Enter your String
abcabcYZnaljxnlcn
true
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z]*
Enter your String
abcaskdjasjlhefbbasaDN
true
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z]*
Enter your String

true
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z0-9]+
Enter your String
JannkiNandan1874876274
true
Want to exit [Y/N]

Enter Regular Expression :
74534753589
Enter your String
djdls
false
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z0-9]+
Enter your String
87573459347987
true
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z0-9]+
Enter your String
janki&^(*
false
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z0-9]+
Enter your String
@gmail
false
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z0-9@#]+
Enter your String
janki@gmai###@@@
true
Want to exit [Y/N]

Enter Regular Expression :
[a-zA-Z0-9@#]+
Enter your String
janki.
false
Want to exit [Y/N]

Enter Regular Expression :

 */

// to validate email
/*
Enter Regular Expression :
^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$
Enter your String
abc7276@gmail.com
true
Want to exit [Y/N]

Enter Regular Expression :
^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$
Enter your String
abc7276@gmail.c
false
Want to exit [Y/N]

Enter Regular Expression :
^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$
Enter your String
rana@gmail
false
Want to exit [Y/N]

Enter Regular Expression :
^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$
Enter your String
rana@gmailcom
false
Want to exit [Y/N]

Enter Regular Expression :
^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$
Enter your String
rana@gmai$
false
Want to exit [Y/N]

Enter Regular Expression :
^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$
Enter your String
ranjdskdj$22@gmail00.com
true
Want to exit [Y/N]

 */

// username that contains letters numbers and @ , $  , _ only
/*
Enter Regular Expression :
^[a-zA-Z0-9@$_]+$
Enter your String
rans_473$$@happy@
true
Want to exit [Y/N]

Enter Regular Expression :
^[a-zA-Z0-9@$_]+$
Enter your String
djsdfhbjj363287@#
false
Want to exit [Y/N]
y
Thanks for using the program

 */
