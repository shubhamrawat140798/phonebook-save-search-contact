import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Scanner sc= null;
        try{
            sc =new Scanner(System.in);
            int ch;
            Map<String, String> pbook= new HashMap<>();
            do 
            {   
                System.out.print("\nMenu \nPress 1 to Add new phone book entry \nPress 2 to Search a Phone Number \nPress 3 to Quit");
                System.out.print("\n\nEnter your Choice: ");
                ch=sc.nextInt();
                switch(ch){
                    case 1:
                        String name;
                        String phoneNo;
                        System.out.print("\n\nEnter your name: ");
                        name=sc.next();
                        System.out.print("\nphone number : ");
                        phoneNo=sc.next();
                        pbook.put(name,phoneNo);
                        break;
                    case 2:
                        String nameSearch;
                        System.out.print("\nEnter a name: ");
                        nameSearch=sc.next();
                        if(pbook.containsKey(nameSearch))
                        {
                            System.out.println("Phone Number of"+nameSearch+":"+ pbook.get(nameSearch));
                        }
                        else 
                            System.out.println(nameSearch +" is not present in PhoneBook\n");
                        break;
                    case 3:
                        System.out.println("Quit has been pressed!!");
                        break;
                    
                    }
            
            }while(ch!=3);
            
        } 
        finally{
            sc.close();
        }
        
    }
}
