package LabProjects.LabTwo.Exercise2;

import java.util.Scanner;

public class Account {
    private String ownerName;
    public double balance;


    Account(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance; 
    }

    public void setOwnerName(){
        String newName;
        System.out.println("Enter a new name: ");
        Scanner scan = new Scanner(System.in);
        newName=scan.nextLine();
        this.ownerName = newName;
        System.out.println("New name is " + this.ownerName);
    }

    public void getOwnerName(){
        System.out.println("name is "+ this.ownerName);
    }
    
    public void getBalance(){
        System.out.println("balance is "+ this.balance);        
    }

   

    public void withdraw(){
        int counter = 1,print;
        String pass = "1234";
        System.out.println("Please enter the 4-digit pass: ");
        Scanner scan = new Scanner(System.in);
        String checkPass; 
        checkPass= scan.nextLine();
        while(counter<=3){
            if (pass.equals(checkPass)){   
                getBalance();
                counter = 4;
                add();
            }else if(!pass.equals(checkPass) && counter < 3 ){
                System.out.println("try again: ");
                System.out.println("Please enter the 4-digit pass: ");
                checkPass = scan.nextLine();
                counter = counter +1;
                print = 3-counter;
                System.out.println("last "+print+" trial");
            }else{
                System.out.println("has been blocked");
                break;
            }
                    
        }

        }
        public void add(){
            double salary;
            double amount;
            Scanner input = new Scanner(System.in);
            System.out.println("hesabınıza eklemek istediğiniz tutarı giriniz:");
            amount=input.nextInt();
            salary= amount+ balance;
            System.out.println("hesabınızdaki tutar: "+salary);
            
    
        }
        
        

        }


    



