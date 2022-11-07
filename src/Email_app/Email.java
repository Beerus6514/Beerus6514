package Email_app;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "company.com";

    //constructor to receive first and last name;
    //asked for the department
    //generate random password
    //set mailbox capacity
    //set altenate email
    //change the password

    //constructor to receive first and last name;
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : "+ this.firstName+" "+this.lastName);

        //calling method asking for department - return dept
        this.department = setDepartment();
        System.out.println("Department: "+this.department);

        //calling method to generate random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+this.password);

        //combine element to generate email
        email = firstName.toLowerCase() + "."+ lastName.toLowerCase() + "@"+ department+"."+ companySuffix;
        System.out.println("Your email is :"+ email);




    }

    //return department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if(deptChoice==1){return "sales";}
        else if (deptChoice==2) {return "dev";}
        else if(deptChoice==3){return "acct";}
        else{return "";}

    }


    //generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailboxCapacity(int capacity){   //this is encapsilation
        this.mailboxCapacity = capacity;
    }

    //set altenate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //change the password
    public void changePassword(String password){
        this.password = password;
    }




}

