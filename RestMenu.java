import java.io.InputStream;
import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  


public class RestMenu {

    public static void main(String [] args)
    {

        int a,b,c,d,e;
        int eachcost=0;
        int cost=0;
        int price=0;
        int y=0;
        String item=" ";
        ArrayList<String> order=new ArrayList<>();
        ArrayList<Integer> pric=new ArrayList<>();
        ArrayList<Integer> plate=new ArrayList<>();

        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm");  
        String strDate = dateFormat.format(date);  

        ArrayList<String> menuItem = new ArrayList<>();
        menuItem.add("BreakFast");
        menuItem.add("Lunch");
        menuItem.add("Dinner");


        ArrayList<String> breakFast = new ArrayList<>();
        ArrayList<Integer> breakFastPrice = new ArrayList<>();
        breakFast.add("Egg Wraps");
        breakFastPrice.add(15);
        breakFast.add("Cashew Waffles");
        breakFastPrice.add(20);
        breakFast.add("Apple Turnovers");
        breakFastPrice.add(25);
        breakFast.add("Mashed Potatoes");
        breakFastPrice.add(10);
        breakFast.add("Boiled Egg");
        breakFastPrice.add(5);
        breakFast.add("Fresh Shrimp");
        breakFastPrice.add(20);
        breakFast.add("Orange Juice");
        breakFastPrice.add(15);
        breakFast.add("Coffee");
        breakFastPrice.add(20);

        ArrayList<String> lunchList = new ArrayList<>();
        ArrayList<Integer> lunchListPrice = new ArrayList<>();
        lunchList.add("Lemon rice");
        lunchListPrice.add(50);
        lunchList.add("Reuben Sandwich");
        lunchListPrice.add(30);
        lunchList.add("Pasta Salad");
        lunchListPrice.add(25);
        lunchList.add("Masala Poha");
        lunchListPrice.add(60);
        lunchList.add("Chicken sandwich");
        lunchListPrice.add(40);
        lunchList.add("Barbecue Ribs");
        lunchListPrice.add(50);
        lunchList.add("Turmeric Latte");
        lunchListPrice.add(30);
        lunchList.add("Almond Milk");
        lunchListPrice.add(25);

        ArrayList<String> dinnerList = new ArrayList<>();
        ArrayList<Integer> dinnerListPrice = new ArrayList<>();
        dinnerList.add("Baked Beans");
        dinnerListPrice.add(80);
        dinnerList.add("Meatloaf");
        dinnerListPrice.add(150);
        dinnerList.add("Wild Alaskan Salmon");
        dinnerListPrice.add(130);
        dinnerList.add("Turkey Dinner");
        dinnerListPrice.add(200);
        dinnerList.add("Burrito");
        dinnerListPrice.add(80);
        dinnerList.add("Kebab Salad");
        dinnerListPrice.add(70);
        dinnerList.add("Malt Scotch");
        dinnerListPrice.add(50);
        dinnerList.add("Sherry");
        dinnerListPrice.add(45);



        for(int i=0;i<=122;i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("---------------------------------------------------Welcome to RestroBar----------------------------------------------------");
        System.out.println("                                                     "+strDate+"                                                        ");
        System.out.println("                                             Developed by: Rupesh Gaudel Regmi");
		System.out.println();
		for(int i=0;i<=122;i++) {
            System.out.print("*");
		}
        System.out.print("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to place order ? (Y/N)");
        String opt = scanner.nextLine();
       
        switch(opt) {
            case "Y":
            System.out.println("-----------------");
            System.out.println("Enter Your Name: ");
            System.out.println("-----------------");
            String name = scanner.nextLine();
            System.out.println(" ");
            System.out.println("-------------------------");
            System.out.println("Select Your Status Type: ");
            System.out.println("-------------------------");
            System.out.println("1) Member" );
            System.out.println("2) Non-Member" );
            Integer status = scanner.nextInt();
           
            switch (status) {
                case 1:
                    status = 1;
                    break;
                case 2:
                    status = 2;
                    break;
            
                default:
                    System.out.println("Invalid Option");
                    System.exit(0);
            }
            
            System.out.println(" ");
            for(int i=0;i<=25;i++) {
                System.out.print("*");
            }
            System.out.println(" ");
            System.out.println("-----Select Item Type-----");
            
            for(int i=0;i<=25;i++) {
                System.out.print("*");
            }
            System.out.println();
            String menuItm ="";
        
            System.out.println(String.format("%-8s %-25s" ,"SN", "Type"));
            
            for(int i = 0 ; i < menuItem.size();i++){
                
                menuItm = String.format("%-8s %-25s" ,i+1, menuItem.get(i) );
                System.out.println(menuItm);
            }
            Integer itemtype = scanner.nextInt();
            switch (itemtype) {
                case 1:
                System.out.println(" ");
                for(int i=0;i<=30;i++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("-------Breakfast  Items-------");
                for(int i=0;i<=30;i++) {
                    System.out.print("*");
                }
                System.out.println();
                String output ="";
            
                System.out.println(String.format("%-3s %-20s %s" ,"SN", "Item", "Price"));
                
                for(int i = 0 ; i < breakFast.size();i++){
                    
                    output = String.format("%-3s %-20s $%s" ,i+1, breakFast.get(i), breakFastPrice.get(i) );
                    System.out.println(output);
                }
                do
                {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Press to order");
                    a=scanner.nextInt();
                    int press[]=new int[]{a};

                    System.out.println("---------------------------------------------------");
                    System.out.println("Enter the Number of items");
                    b=scanner.nextInt();

                    //Code for item select

                    if(a==1)
                    {
                        item="Egg Wraps";
                        price=15;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==2)
                    {
                        item="Cashew Waffles";
                        price=20;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==3)
                    {
                        item="Apple Turnovers";
                        price=25;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==4)
                    {
                        item="Mashed Potatoes";
                        price=10;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==5)
                    {
                        item="Boiled Egg";
                        price=5;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==6)
                    {
                        item="Fresh Shrimp";
                        price=20;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==7)
                    {
                        item="Orange Juice";
                        price=15;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==8)
                    {
                        item="Coffee";
                        price=20;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    
                    System.out.println("---------------------------------------------------");
                    System.out.println("Item Added to Cart:");
                    System.out.println("*******************");
            
                    for(int k=0;k<press.length;k++)
                    {
                        String fetchitemname= "  ";

                        System.out.println(String.format("%-20s %-20s" ,"Items Names", "No. of items"));
                        if(press[k]==1)
                        {
                            fetchitemname="Egg Wraps";
                            System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==2)
                        {
                            fetchitemname="Cashew waffles";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==3)
                        {
                            fetchitemname="Apple Turnovers";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==4)
                        {
                            fetchitemname="Mashed Potatoes";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==5)
                        {
                            fetchitemname="Boiled Egg";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==6)
                        {
                            fetchitemname="Fresh Shrimp";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        } if(press[k]==7)
                        {
                            fetchitemname="Orange Juice";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==8)
                        {
                            fetchitemname="Coffee         ";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                       
                    }
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Do You Want To Continue the Order(Press 1 for continue/Press 0 for the Bill)");
                    y=scanner.nextInt();


            System.out.println(" ");


        }while(y!=0);

        System.out.println("********");
        System.out.println("--Bill--");
        System.out.println("********");
        System.out.println(" ");

        System.out.println(String.format("%-20s %-20s %-20s" ,"Items Names", "No. of items", "Sub Total"));
        Iterator itr  =order.iterator();
        Iterator itr1 =pric.iterator();
        Iterator itr2 =plate.iterator();

        while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
        {
            System.out.println(String.format("%-20s %-20s %-20s" ,itr.next(), itr2.next(),"$"+itr1.next()));
            System.out.println(" ");

        }

        System.out.println(" ");
        if (status ==1) {
            System.out.println("Members have 10% discount on total cost.");
            System.out.println("---------------------------------------------------");
            double amt = cost;
            double discount = (10.0/100)*amt;
            double total = cost-discount;
            
            System.out.println("Total Cost"+"--> $"+cost); 
            System.out.println("---------------------------------------------------");
            System.out.println("Discount Amount"+"--> $"+discount);
            System.out.println("---------------------------------------------------");
            System.out.println("Total Amount to Pay"+"--> $"+total);
            System.out.println("---------------------------------------------------");
        System.out.println("Thank You for visiting RestroBar :"+" "+name+".");
        System.out.println("---------------------------------------------------");
            
        } else {
            System.out.println("Non-Members dont get any discount.");
            System.out.println("---------------------------------------------------");
            double amt = cost;
            double discount = 0.0;
            double total = amt-discount;
            
            System.out.println("Total Cost"+"--> $"+cost); 
            System.out.println("---------------------------------------------------");
            System.out.println("Discount Amount"+"--> $"+discount);
            System.out.println("---------------------------------------------------");
            System.out.println("Total Amount to Pay"+"--> $"+total);
            System.out.println("---------------------------------------------------");
        System.out.println("Thank You for visiting RestroBar :"+" "+name+".");
        System.out.println("---------------------------------------------------");
            
        }
        
                    break;

        case 2:

        System.out.println(" ");
                for(int i=0;i<=30;i++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("---------Lunch  Items---------");
                for(int i=0;i<=30;i++) {
                    System.out.print("*");
                }
                System.out.println();
                String outputs ="";
            
                System.out.println(String.format("%-3s %-20s %s" ,"SN", "Item", "Price"));
                
                for(int i = 0 ; i < lunchList.size();i++){
                    
                    outputs = String.format("%-3s %-20s $%s" ,i+1, lunchList.get(i), lunchListPrice.get(i) );
                    System.out.println(outputs);
                }
                do
                {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Press to order");
                    a=scanner.nextInt();
                    int press[]=new int[]{a};

                    System.out.println("---------------------------------------------------");
                    System.out.println("Enter the Number of items");
                    b=scanner.nextInt();

                    //Code for item select

                    if(a==1)
                    {
                        item="Lemon rice";
                        price=50;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==2)
                    {
                        item="Reuben Sandwich";
                        price=30;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==3)
                    {
                        item="Pasta Salad";
                        price=25;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==4)
                    {
                        item="Masala Poha";
                        price=60;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==5)
                    {
                        item="Chicken sandwich";
                        price=40;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==6)
                    {
                        item="Barbecue Ribs";
                        price=50;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==7)
                    {
                        item="Turmeric Latte";
                        price=30;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==8)
                    {
                        item="Almond Milk";
                        price=25;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    
                    System.out.println("---------------------------------------------------");
                    System.out.println("Item Added to Cart:");
                    System.out.println("*******************");
            
                    for(int k=0;k<press.length;k++)
                    {
                        String fetchitemname= "  ";

                        System.out.println(String.format("%-20s %-20s" ,"Items Names", "No. of items"));
                        if(press[k]==1)
                        {
                            fetchitemname="Lemon rice";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==2)
                        {
                            fetchitemname="Reuben Sandwich";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==3)
                        {
                            fetchitemname="Pasta Salad";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==4)
                        {
                            fetchitemname="Masala Poha";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==5)
                        {
                            fetchitemname="Chicken sandwich";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==6)
                        {
                            fetchitemname="Barbecue Ribs";
                            System.out.print(fetchitemname+"\t\t\t"+b);
                        } if(press[k]==7)
                        {
                            fetchitemname="Turmeric Latte";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==8)
                        {
                            fetchitemname="Almond Milk";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                       
                    }
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Do You Want To Continue the Order(Press 1 for continue/Press 0 for the Bill)");
                    y=scanner.nextInt();


            System.out.println(" ");


        }while(y!=0);

        System.out.println("********");
        System.out.println("--Bill--");
        System.out.println("********");
        System.out.println(" ");

        System.out.println(String.format("%-20s %-20s %-20s" ,"Items Names", "No. of items", "Sub Total"));
        Iterator itrx  =order.iterator();
        Iterator itry =pric.iterator();
        Iterator itrz =plate.iterator();

        while(itrx.hasNext() && itry.hasNext() && itrz.hasNext())
        {
            System.out.println(String.format("%-20s %-20s %-20s" ,itrx.next(), itrz.next(),"$"+itry.next()));
            System.out.println(" ");

        }

        System.out.println(" ");
        if (status ==1) {
            System.out.println("Members have 10% discount on total cost.");
            System.out.println("---------------------------------------------------");
            double amt = cost;
            double discount = (10.0/100)*amt;
            double total = cost-discount;
            
            System.out.println("Total Cost"+"--> $"+cost); 
            System.out.println("---------------------------------------------------");
            System.out.println("Discount Amount"+"--> $"+discount);
            System.out.println("---------------------------------------------------");
            System.out.println("Total Amount to Pay"+"--> $"+total);
            System.out.println("---------------------------------------------------");
        System.out.println("Thank You for visiting RestroBar :"+" "+name+".");
        System.out.println("---------------------------------------------------");
            
        } else {
            System.out.println("Non-Members dont get any discount.");
            System.out.println("---------------------------------------------------");
            double amt = cost;
            double discount = 0.0;
            double total = amt-discount;
            
            System.out.println("Total Cost"+"--> $"+cost); 
            System.out.println("---------------------------------------------------");
            System.out.println("Discount Amount"+"--> $"+discount);
            System.out.println("---------------------------------------------------");
            System.out.println("Total Amount to Pay"+"--> $"+total);
            System.out.println("---------------------------------------------------");
        System.out.println("Thank You for visiting RestroBar :"+" "+name+".");
        System.out.println("---------------------------------------------------");
            
        }
        break;

        case 3:
        System.out.println(" ");
                for(int i=0;i<=30;i++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("-------Dinner  Items-------");
                for(int i=0;i<=30;i++) {
                    System.out.print("*");
                }
                System.out.println();
                String doutput ="";
            
                System.out.println(String.format("%-3s %-20s %s" ,"SN", "Item", "Price"));
                
                for(int i = 0 ; i < dinnerList.size();i++){
                    
                    doutput = String.format("%-3s %-20s $%s" ,i+1, dinnerList.get(i), dinnerListPrice.get(i) );
                    System.out.println(doutput);
                }
                do
                {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Press to order");
                    a=scanner.nextInt();
                    int press[]=new int[]{a};

                    System.out.println("---------------------------------------------------");
                    System.out.println("Enter the Number of items");
                    b=scanner.nextInt();

                    //Code for item select

                    if(a==1)
                    {
                        item="Baked Beans";
                        price=80;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==2)
                    {
                        item="Meatloaf";
                        price=150;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==3)
                    {
                        item="Wild Alaskan Salmon";
                        price=130;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==4)
                    {
                        item="Turkey Dinner";
                        price=200;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==5)
                    {
                        item="Burrito";
                        price=80;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==6)
                    {
                        item="Kebab Salad";
                        price=70;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==7)
                    {
                        item="Malt Scotch";
                        price=50;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==8)
                    {
                        item="Sherry";
                        price=45;
                        eachcost=price*b;
                        cost+=eachcost;
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    
                    System.out.println("---------------------------------------------------");
                    System.out.println("Item Added to Cart:");
                    System.out.println("*******************");
            
                    for(int k=0;k<press.length;k++)
                    {
                        String fetchitemname= "  ";

                        System.out.println(String.format("%-20s %-20s" ,"Items Names", "No. of items"));
                        if(press[k]==1)
                        {
                            fetchitemname="Baked Beans";
                            System.out.print(fetchitemname+"\t\t\t"+b);
                        }
                        if(press[k]==2)
                        {
                            fetchitemname="Meatloaf        ";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==3)
                        {
                            fetchitemname="Wild Alaskan Salmon";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==4)
                        {
                            fetchitemname="Turkey Dinner";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==5)
                        {
                            fetchitemname="Burrito        ";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==6)
                        {
                            fetchitemname="Kebab Salad";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        } if(press[k]==7)
                        {
                            fetchitemname="Malt Scotch";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                        if(press[k]==8)
                        {
                            fetchitemname="Sherry        ";
                             System.out.println(String.format("%-20s %-20s" ,fetchitemname,b));
                        }
                       
                    }
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Do You Want To Continue the Order(Press 1 for continue/Press 0 for the Bill)");
                    y=scanner.nextInt();


            System.out.println(" ");


        }while(y!=0);

        System.out.println("********");
        System.out.println("--Bill--");
        System.out.println("********");
        System.out.println(" ");

        System.out.println(String.format("%-20s %-20s %-20s" ,"Items Names", "No. of items", "Sub Total"));
        Iterator itra  =order.iterator();
        Iterator itrb =pric.iterator();
        Iterator itrc =plate.iterator();

        while(itra.hasNext() && itrb.hasNext() && itrc.hasNext())
        {
            System.out.println(String.format("%-20s %-20s %-20s" ,itra.next(), itrc.next(),"$"+itrb.next()));
            System.out.println(" ");

        }

        System.out.println(" ");
        if (status ==1) {
            System.out.println("Members have 10% discount on total cost.");
            System.out.println("---------------------------------------------------");
            double amt = cost;
            double discount = (10.0/100)*amt;
            double total = cost-discount;
            
            System.out.println("Total Cost"+"--> $"+cost); 
            System.out.println("---------------------------------------------------");
            System.out.println("Discount Amount"+"--> $"+discount);
            System.out.println("---------------------------------------------------");
            System.out.println("Total Amount to Pay"+"--> $"+total);
            System.out.println("---------------------------------------------------");
        System.out.println("Thank You for visiting RestroBar :"+" "+name+".");
        System.out.println("---------------------------------------------------");
            
        } else {
            System.out.println("Non-Members dont get any discount.");
            System.out.println("---------------------------------------------------");
            double amt = cost;
            double discount = 0.0;
            double total = amt-discount;
            
            System.out.println("Total Cost"+"--> $"+cost); 
            System.out.println("---------------------------------------------------");
            System.out.println("Discount Amount"+"--> $"+discount);
            System.out.println("---------------------------------------------------");
            System.out.println("Total Amount to Pay"+"--> $"+total);
            System.out.println("---------------------------------------------------");
        System.out.println("Thank You for visiting RestroBar :"+" "+name+".");
        System.out.println("---------------------------------------------------");
            
        }
        break;
            
         default:
                System.out.println("Invalid Option");
                System.exit(0);
            }
               break;
            case "N":
               System.out.println("Thank You For Comming");
               break;
            default :
            System.out.println("Invalid Option");
            System.exit(0);
         }
    }
}