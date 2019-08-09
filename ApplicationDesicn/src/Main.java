import com.exe.AddProducts;
import com.exe.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    private static int myquantity;

    public static void main(String[] args) {

        String choice = null;
        String name = "";
        String product = "";
        int quantity = 0;
        int ch = 0;
        int total = 0;
        String id;
        int price;
        String produdtName;
        String category;
        int pay;
        int buyingprice;
        String counterPerson;

        ArrayList<Item> itemList = new ArrayList<>();

        try
        {
            FileInputStream fis = new FileInputStream("myfile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            itemList = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

//        itemList.add(new Item("Chumvi", "90",120,24,"Domestic",100));
//        itemList.add(new Item("Besheni", "10",100,78,"Domestic",80));
//        itemList.add(new Item("Cement", "9",1200,89,"Construction",1000));
//        itemList.add(new Item("Phone", "12",2000,100,"Communication",1800));
//        itemList.add(new Item("Exam papers", "13",500,10,"Education",450));

        ArrayList<Item> orderList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Select a choice below.");
            System.out.println("1. Register for an account.");
            System.out.println("2. Display available products.");
            System.out.println("3. order products");
            System.out.println("4. Add products now");
            System.out.println("5. Print receipt.");
            System.out.println("6. Now open your pocket and pay.");
            System.out.println("7. View your profit");
            System.out.println("8. View your remaining stock.");
            System.out.println("9. Read from myfile.txt.");
            System.out.println("10. Quit");


            choice = scan.nextLine();
            try {
                ch = Integer.parseInt(choice);

                if (ch < 1 ||ch > 10 ){
                    System.out.println("________________________________________________________________________________________");
                    System.out.println("That was an incorrect input (input out of range). Try Again"+" "+ name.toUpperCase());
                    System.out.println("________________________________________________________________________________________");
                }
            }catch (NumberFormatException ex){
                System.out.println("_______________________________________");
                System.out.println("Please enter a valid number not x-ter" + " ,"+ ex);
                System.out.println("___________________________________________");
            }
            switch (ch) {
                case 1:

                    System.out.println("Customer name.");

                    name = scan.nextLine();
                    System.out.println("____________________________________________________________________________");
                    System.out.println("Welcome " + name.toUpperCase() + " it is my pleasure that you are here !");
                    System.out.println("____________________________________________________________________________");

                    break;

                case 2:
                    if (name.length() != 0) {
                        System.out.println("__________________________________________");
                        System.out.println("Here is the product list ");
                        System.out.println(itemList);
                        System.out.println("__________________________________________");


                    } else {
                        System.out.println("__________________________________________");
                        System.out.println("Please set up your account first....");
                        System.out.println("__________________________________________");

                    }
                    break;

                case 3:
                    if (name.length() != 0) {

                        System.out.println("Choose products you want to buy. From the list below .");
//                System.out.println(item.toString());
                        System.out.println(itemList);
                        product = scan.nextLine();

                        System.out.println("Enter quantity: ");
                        quantity = Integer.parseInt(scan.nextLine());
                        System.out.println("______________________________________");
                        Item listItem = null;
                        Item orderedItem = null;

                        for (Item item : itemList) {
                            if (item.getName().equalsIgnoreCase(product)) {
                                listItem = item;
                                orderedItem = new Item(item.getName(), item.getId(), item.getPrice(), quantity, item.getCategory(), item.getBuyingprice());

                            }
                        }

                        if (orderedItem != null) {
                            if (quantity <= listItem.getMyquantity()) {

                                for (Item item : itemList) {
                                    if (item.getName().equalsIgnoreCase(product)) {
                                        System.out.println("Thanks for shopping, you have picked: " + orderedItem.getName() + " " + orderedItem.getMyquantity() + " from " + orderedItem.getCategory() + " category" + " " + " The shop stock was: " + listItem.getMyquantity() + " of them" + " each" + " " + orderedItem.getName() + " is: " + orderedItem.getPrice());
                                        listItem.setMyquantity(listItem.getMyquantity() - quantity);
                                        orderList.add(orderedItem);

                                    }
                                }

                                //System.out.println("The stock now has: " + (take.getMyquantity() - quantity));
                            } else {
                                System.out.println("Your request is unsuccessful , our available quantity was: " + orderedItem.getMyquantity());
                                break;
                            }
                            System.out.println("______________________________");

                        } else {
                            System.out.println("__________________________________________");
                            System.out.println("Item does not exists in the shop !!!");
                            System.out.println("Enter press 3 to add it to the list of products");
                            System.out.println("__________________________________________");


                        }
                    } else {
                        System.out.println("__________________________________________");
                        System.out.println("Kindly setup your account first ...");
                        System.out.println("__________________________________________");

                    }

                    break;

                case 4:
                    if (name.length() != 0) {
                        System.out.println("Add product");
                        System.out.println("Enter product name: ");
                        produdtName = scan.nextLine();
                        System.out.println("Enter product id: ");
                        id = scan.nextLine();
                        System.out.println("Enter price: ");
                        price = Integer.parseInt(scan.nextLine());
                        System.out.println("Enter quantity: ");
                        quantity = Integer.parseInt(scan.nextLine());
                        System.out.println("Enter category: ");
                        category = scan.nextLine();
                        System.out.println("Enter buyingprice: ");
                        buyingprice = Integer.parseInt(scan.nextLine());
                        System.out.println("_____________________________________");
                        System.out.println("You have added: " + produdtName + " its id is: " + id + " and quantity " + quantity + " " + "price " + " " + price + " " + category + " " + buyingprice);
                        System.out.println("TOTAL is: " + price * quantity);
                        System.out.println("____________");
                        System.out.println("Added by: " + name.toUpperCase());

                        AddProducts addProducts = new AddProducts(produdtName,id, price, quantity, category, buyingprice);
                        itemList.add(addProducts);
                        System.out.println("______________________________");
                        System.out.println("Updated product list successfully, now the list has your product" + " , " + produdtName);
                        System.out.println("________________________________");
                        System.out.println(itemList);
                        System.out.println("_______________________________");
                    } else {
                        System.out.println("__________________________________________");
                        System.out.println("Please setup your account to be recognized as a valid customer..");
                        System.out.println("__________________________________________");

                    }

                    break;


                case 5:
                    if ((name.length() != 0) && (orderList != null)) {
                        System.out.println("__________________________________________");
                        System.out.println("Welcome to the counter..." + name);
                        System.out.println("Being served by: ");
                        counterPerson = scan.nextLine();
                        Item order = null;

                        for (Item item : itemList) {
                            if (item.getName().equalsIgnoreCase(product)) {
                                order = item;
                            }
                        }
                        if (name.length() != 0) {
                            int sum = 0;
                            for (Item oder : orderList) {
                                try {
                                    sum += order.getPrice() * quantity;
                                } catch (NullPointerException e) {
                                    System.out.println("Sorry we got a null pointer error" + e);
                                }
                                System.out.println("__________________________________________");
                                System.out.println("Customer name: " + name);

                                System.out.println("Your order is: " + oder.getName() + "\t " + " you bought " + oder.getMyquantity() + " items.");
                            }
                            System.out.println("TOTAL IS : " + sum);
                            System.out.println("SERVED BY: " + counterPerson);
                            System.out.println("__________________________________________");

                        } else {
                            System.out.println("__________________________________________");
                            System.out.println("Please create your account first for receipt recognition");
                            System.out.println("__________________________________________");
                        }
                    } else {
                        System.out.println("__________________________________________");
                        System.out.println("Please create your account first for receipt recognition");
                        System.out.println("__________________________________________");
                    }
                    break;


                case 6:
                    Item amount = null;
                    Item change = null;
                    for (Item item : itemList) {
                        if (item.getName().equalsIgnoreCase(product)) {
                            amount = item;
                        }
                    }
                    try {
                        if (name.length() != 0) {
                            System.out.println("Enter your amount: " + name.toUpperCase());
                            System.out.println("____________________________");
                            pay = Integer.parseInt(scan.nextLine());

                            if (pay > quantity * amount.getPrice()) {


                                System.out.println("Thanks for shopping with us " + name + " , " + " hope it was a nice experience !!!!!!!!!!!");
                                System.out.println("Your balance is: " + (pay - quantity * amount.getPrice()));
                                System.out.println("______________________________");
                            } else if (pay < quantity * amount.getPrice()) {
                                System.out.println("You have provided less amount. Therefore your shopping was nullified...");
                                System.out.println("___________________________________");
                            } else {
                                System.out.println("Your balance is 0");
                            }
                        } else {
                            System.out.println("__________________________________________");
                            System.out.println("Please create your account first for you to make a payment");
                            System.out.println("__________________________________________");
                            break;
                        }
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                    }

                case 7:
                    try {
                        Item profit = null;
                        Item loss = null;
                        if (name.length() != 0) {
                            for (Item item : itemList) {
                                if (item.getPrice() > item.getBuyingprice()) {
                                    profit = item;
                                } else if (item.getPrice() < item.getBuyingprice()) {
                                    loss = item;
                                }
                            }


                            System.out.println("______________________________");
                            System.out.println("Congratulations here is your profit");
                            System.out.println("PROFIT = " + (quantity * profit.getPrice() - quantity * profit.getBuyingprice()));
                            System.out.println("__________________________________");
                        } else {
                            System.out.println("____________________________");
                            System.out.println("You haven't recorded any profit now, No customer recorded yet");
                            System.out.println("_____________________________");
                        }
                    } catch (NullPointerException ex) {
                        System.out.println(" Sorry you din't enter any value" + ex);
                    }
                    break;


                case 8:

                    System.out.println("__________________________________________");
                    System.out.println("Here is your stock status....");
                    for (Item item : itemList) {
                        System.out.println("Id: " + item.getId() + "\t " + " Name: " + item.getName() + "\t " + " Quantity: " + item.getMyquantity() + "\t" + " Category: " + item.getCategory());
                    }
                    System.out.println("__________________________________________");

                    break;

                case 10:
                    if (name.length() != 0) {
                        System.out.println("__________________________________________________________________________");
                        System.out.println("Thanks for visiting us , Good bye" + " " + name);
                        System.out.println("__________________________________________________________________________");

                    } else {
                        System.out.println("_____________________________________________________________________________________________");
                        System.out.println("Goodbye,,, Please create account next time so that we can recognize you coz we love you ..");
                        System.out.println("_____________________________________________________________________________________________");
                    }
                    break;

                case 9:
                    try{
                        FileOutputStream fos= new FileOutputStream("myfile.txt");
                        ObjectOutputStream oos= new ObjectOutputStream(fos);
                        oos.writeObject(itemList);
                        oos.close();
                        fos.close();
                    }catch(IOException ioe){
                        ioe.printStackTrace();
                    }
                    System.out.println("Reading from myfile.txt,," + " this is the product list: ");
                    System.out.println("________________________________________________________________________________");
                    for(Item items: itemList){
                        System.out.println("NAME      ID        QUANTITY       PRICE        CATEGORY");
                        System.out.println(items.getName()+"       "+items.getId()+"      "+items.getMyquantity()+"             "+items.getPrice()+"        "+items.getCategory());
                        System.out.println("____________________________________________________________________________");
                    }
                    break;
            }

        }while (ch != 10);


    }
}
