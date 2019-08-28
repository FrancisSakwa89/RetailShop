import com.exe.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    private static int myquantity;

    public static void main(String[] args) {

        String choice = null;
        String name = "";
        String userId = "";
        String product = "";
        int quantity = 0;
        int myquantity = 0;
        int ch = 0;
        int total = 0;
        String id;
        int price;
        String produdtName;
        String category;
        int pay;
        int buyingprice;
        String counterPerson;
        String searchItem;
        double totalSum = 0;
        String UserOrder = null;
        double itemPrice = 0;

        ArrayList<Item> itemList = new ArrayList<>();
        ArrayList<Employees> employeesList = new ArrayList<>();
        ArrayList<Customer> customersList = new ArrayList<>();
        ArrayList<Sale> saleList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("myfile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            itemList = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }




/*        itemList.add(new Item("Chumvi", "90",120,24,"Domestic",100));
        itemList.add(new Item("Besheni", "10",100,78,"Domestic",80));
        itemList.add(new Item("Cement", "9",1200,89,"Construction",1000));
        itemList.add(new Item("Phone", "12",2000,100,"Communication",1800));
        itemList.add(new Item("Exam papers", "13",500,10,"Education",450));*/

        employeesList.add(new Employees("Francis", 1, "Fruits"));
        employeesList.add(new Employees("Edwin", 2, "Meat"));
        employeesList.add(new Employees("Dennis", 3, "Kitchen"));
        employeesList.add(new Employees("George", 4, "Reception"));
        employeesList.add(new Employees("John", 5, "Fruits"));
    /*    try {
            FileOutputStream fos = new FileOutputStream("myfile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(itemList);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }*/

        ArrayList<Item> orderList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
//
        do {
            try {
                FileInputStream fin = new FileInputStream("users.txt");
                ObjectInputStream os = new ObjectInputStream(fin);
                saleList = (ArrayList<Sale>) os.readObject();
                os.close();
                fin.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
                return;
            } catch (ClassNotFoundException c) {
                System.out.println("Class not found");
                c.printStackTrace();
                return;
            }

            System.out.println("Select a choice below.");
            System.out.println("1. Register for an account.");
            System.out.println("2. Display available products.");
            System.out.println("3. order products");
            System.out.println("4. Add products now");
            System.out.println("5. Print receipt.");
            System.out.println("6. Now open your pocket and pay.");
            System.out.println("7. View profit/loss");
            System.out.println("8. View your remaining stock.");
            System.out.println("9. Write to myfile.txt.");
            System.out.println("10. Employees List");
            System.out.println("11. Search Item.");
            System.out.println("12. Get Sales per user ...");
            System.out.println("13. Quit");


            choice = scan.nextLine();

            try {
                ch = Integer.parseInt(choice);

                if (ch < 1 || ch > 13) {
                    System.out.println("________________________________________________________________________________________");
                    System.out.println("That was an incorrect input (input out of range). Try Again" + " " + name.toUpperCase());
                    System.out.println("________________________________________________________________________________________");
                }
            } catch (NumberFormatException ex) {
                System.out.println("_______________________________________");
                System.out.println("Please enter a valid number not x-ter" + " ," + ex);
                ex.printStackTrace();
                System.out.println("___________________________________________");
            }
            switch (ch) {
                case 1:

                    System.out.println("Customer name.");

                    name = scan.nextLine();
                    if (name.length() != 0) {
                        try {
                            System.out.print("Enter id:");
                            userId = String.valueOf(Integer.valueOf(scan.nextLine()));
                        } catch (NumberFormatException e) {
                            System.out.println("Id is an integer !!!!");
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("Enter a valid name please...");
                        System.out.println("**********************************");
                        break;
                    }

                    System.out.println("____________________________________________________________________________");
                    System.out.println("Welcome " + name.toUpperCase() + " it is my pleasure that you are here !");
                    System.out.println("____________________________________________________________________________");

                    break;

                case 2:
                    if (name.length() != 0) {
                        System.out.println("________________________________________________________________________________");
                        System.out.println("Here is the product list ");


                        System.out.println("________________________________________________________________________________");
                        System.out.println("NAME\t\t\tQUANTITY\tPRICE\t\tCATEGORY");
                        for (Item items : itemList) {
                            System.out.println(items.getName() + "\t\t\t" + items.getMyquantity() + "\t\t\t" + items.getPrice() + "\t\t\t" + items.getCategory());
                            //System.out.println("____________________________________________________________________________");
                        }


                    } else {
                        System.out.println("__________________________________________");
                        System.out.println("Please set up your account first....");
                        System.out.println("__________________________________________");

                    }
                    break;

                case 3:
//                    orderList.clear();
                    if (name.length() != 0) {


                        System.out.println("Choose products you want to buy. From the list below .");
                        System.out.println(itemList);
                        product = scan.nextLine();

                        System.out.println("Enter quantity: ");
                        try {
                            quantity = Integer.parseInt(scan.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a number not character ..");
                            e.printStackTrace();
                        }
                        System.out.println("______________________________________");
                        Item listItem = null;
                        Item orderedItem = null;

                        if (quantity > 0) {
                            for (Item item : itemList) {
                                if (item.getName().equalsIgnoreCase(product) && (item.getMyquantity() >= 1)) {

                                    listItem = item;
                                    orderedItem = new Item(item.getName(), item.getId(), item.getPrice(), quantity, item.getCategory(), item.getBuyingprice());
                                    orderList.add(orderedItem);

                                }

                            }
                        } else {
                            System.out.println("______________________________________________________________________________________________");
                            System.out.println("Choose quantity above from 1 and please check the quantity available before you proceed...");
                            System.out.println("______________________________________________________________________________________________");

                        }


                        if (orderedItem != null) {
                            double loss = 0;
                            double profit = 0;
                            double totalProfit = 0;
                            if (quantity <= listItem.getMyquantity()) {

                                for (Item item : itemList) {

                                    if (item.getName().equalsIgnoreCase(product)) {
                                        System.out.println("Thanks for shopping, you have picked: " + orderedItem.getName() + " " + orderedItem.getMyquantity() + " from " + orderedItem.getCategory() + " category" + " " + " The shop stock was: " + listItem.getMyquantity() + " of them" + " each" + " " + orderedItem.getName() + " is: " + orderedItem.getPrice());
                                        itemPrice = orderedItem.getPrice() * orderedItem.getMyquantity();
                                        System.out.println(itemPrice);
                                        listItem.setMyquantity(listItem.getMyquantity() - quantity);
                                        for (Item items : orderList) {
//                                            itemPrice = items.getPrice() * quantity;
                                            totalSum = items.getPrice() * items.getMyquantity();
                                            total += totalSum;
                                            profit = (item.getPrice() - item.getBuyingprice()) * quantity;
                                            if (item.getPrice() > item.getBuyingprice()) {
                                                totalProfit += profit++;
                                            } else if (item.getPrice() < item.getBuyingprice()) {
                                                loss += (item.getBuyingprice() - item.getPrice()) * item.getMyquantity();
                                                System.out.println("you got a loss on " + item.getName());
                                            }
                                        }
                                        saleList.add(new Sale(new Customer(name, userId), orderList, total, totalProfit));
//                                        System.out.println(orderList);
//                                            System.out.println(items.getName());


                                        // }

                                    } else if (orderedItem.getMyquantity() <= 0) {
                                        System.out.println(orderedItem.getName() + " is out of quantity");

                                    }
                                }

                            } else {
                                System.out.println("Your request is unsuccessful , our available quantity is less than: " + orderedItem.getMyquantity() + " press 2 to findout the quantity available");
                                break;
                            }
                            System.out.println("______________________________");

                        } else {
                            System.out.println("__________________________________________");
                            System.out.println("Item does not exist in the shop !!!");
                            System.out.println("Press 4 to add it to the list of products");
                            System.out.println("__________________________________________");


                        }
                    } else {
                        System.out.println("__________________________________________");
                        System.out.println("Kindly setup your account first ...");
                        System.out.println("__________________________________________");

                    }
                    try {
                        FileOutputStream fous = new FileOutputStream("users.txt");
                        ObjectOutputStream ous = new ObjectOutputStream(fous);
                        ous.writeObject(saleList);
                        ous.close();
                        fous.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
//                        orderList.clear();
//
                    break;

                case 4:
                    try {
                        if (name.length() != 0) {
                            System.out.println("Add product");
                            System.out.println("Enter product name: ");
                            produdtName = scan.nextLine();
                            System.out.println("Enter product id: ");
                            id = scan.nextLine();
                            System.out.println("Enter price: ");
                            price = Integer.parseInt(scan.nextLine());
                            System.out.println("Enter quantity: ");
                            try {
                                myquantity = Integer.parseInt(scan.nextLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Please enter a number");
                                e.printStackTrace();
                            }
                            System.out.println("Enter category: ");
                            category = scan.nextLine();
                            System.out.println("Enter buyingprice: ");
                            buyingprice = Integer.parseInt(scan.nextLine());
                            System.out.println("_____________________________________");
                            System.out.println("You have added: " + produdtName + " its id is: " + id + " and quantity " + myquantity + " " + "price " + " " + price + " " + category + " " + buyingprice);
                            System.out.println("TOTAL is: " + price * myquantity);
                            System.out.println("____________");
                            System.out.println("Added by: " + name.toUpperCase());

                            AddProducts addProducts = new AddProducts(name, id, price, myquantity, category, buyingprice);
                            itemList.add(addProducts);
                            System.out.println("______________________________");
                            System.out.println("Updated product list successfully, now the list has your product" + " , " + name);
                            System.out.println("________________________________");
                            System.out.println(itemList);
                            System.out.println("_______________________________");
                        } else {
                            System.out.println("__________________________________________");
                            System.out.println("Please setup your account to be recognized as a valid customer..");
                            System.out.println("__________________________________________");

                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                    break;


                case 5:
                    if ((name.length() != 0) && (orderList != null)) {
                        System.out.println("__________________________________________");
                        System.out.println("Welcome to the counter..." + name);
                        System.out.println("Being served by: ");

                        System.out.println(employeesList);

                        counterPerson = scan.nextLine();

                        if (name.length() != 0) {
                            double sum = 0;

                            System.out.println("__________________________________________");
                            System.out.println("Customer name: " + name.toUpperCase());

                            for (Item item : orderList) {

                                try {
                                    sum += item.getMyquantity() * item.getPrice();

                                } catch (NullPointerException e) {
                                    System.out.println("Sorry we got a null pointer error" + e);
                                }

                                System.out.println("Your order is: " + item.getName() + "\t " + " you bought " + item.getMyquantity() + " item(s), " + " each is Kshs." + " " + item.getPrice());

                            }
                            System.out.println("TOTAL IS : " + sum);
                            System.out.println("SERVED BY: " + counterPerson.toUpperCase());
                            System.out.println(orderList);


                        } else {
                            System.out.println("__________________________________________________________");
                            System.out.println("Please create your account first for receipt recognition");
                            System.out.println("__________________________________________________________");
                        }
                    } else {
                        System.out.println("______________________________________________________________");
                        System.out.println("Please create your account first for receipt recognition");
                        System.out.println("______________________________________________________________");
                    }
                    System.out.println("__________________________________________");


                    System.out.println("__________________________________________________");
                    break;


                case 6:
                    try {
                        if (name.length() != 0 && orderList != null) {
                            double sum = 0;
                            for (Item item : orderList) {
                                sum += item.getMyquantity() * item.getPrice();
                            }
                            System.out.println("Enter your amount: " + name.toUpperCase());
                            System.out.println("____________________________________________");
                            pay = Integer.parseInt(scan.nextLine());

                            if (pay > sum) {
                                System.out.println("Thanks for shopping with us " + name.toUpperCase() + " , " + " hope it was a nice experience !!!!!!!!!!!");
                                System.out.println("Your balance is: " + (pay - sum));
                                System.out.println("______________________________");
                            } else if (pay < sum) {
                                System.out.println("You have provided less amount. Therefore your shopping was nullified...");
                                System.out.println("___________________________________");
                            } else {
                                System.out.println("Your balance is 0");
                                System.out.println("___________________________________");

                            }
                        } else {
                            System.out.println("__________________________________________");
                            System.out.println("Please create your account first for you to make a payment");
                            System.out.println("__________________________________________");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Amount should be integers only");
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    if (orderList != null) {
                        try {
                            double loss = 0;
                            double profit = 0;
                            double TotalProfit = 0;
                            if (name.length() != 0) {

                                for (Item item : orderList) {

                                    try {
                                        profit = (item.getPrice() - item.getBuyingprice()) * item.getMyquantity();
                                        if (item.getPrice() > item.getBuyingprice()) {
                                            TotalProfit += profit;
                                        } else if (item.getPrice() < item.getBuyingprice()) {
                                            loss += (item.getBuyingprice() - item.getPrice()) * item.getMyquantity();
                                            System.out.println("you got a loss on " + item.getName());
                                        }

                                    } catch (NullPointerException e) {
                                        System.out.println("Sorry we got a null pointer error" + e);
                                    }


                                    System.out.println("______________________________");
                                    System.out.println("Congratulations here is your profit");
                                    System.out.println("PROFIT = " + profit + " on " + item.getName());
                                    System.out.println("__________________________________");

                                }


                                System.out.println("____________________________________________________");
                                System.out.println("TOTAL PROFIT is: " + TotalProfit);
                                System.out.println("YOU LOST : " + loss);
                                System.out.println("____________________________________________________");

                            } else {
                                System.out.println("____________________________________________________");
                                System.out.println("Please press 1 to set your account first..");
                                System.out.println("____________________________________________________");

                            }

                        } catch (NullPointerException ex) {
                            System.out.println(" Sorry you din't enter any value" + ex);
                        }
                    } else {
                        System.out.println("____________________________");
                        System.out.println("You haven't recorded any profit now, No customer recorded yet");
                        System.out.println("_____________________________");
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


                case 9:
                    try {
                        FileOutputStream fos = new FileOutputStream("myfile.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(itemList);
                        oos.close();
                        fos.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    System.out.println("Write to myfile.txt,," + " this is the product list: ");
                    System.out.println("________________________________________________________________________________");
                    for (Item items : itemList) {
                        System.out.println("NAME      ID        QUANTITY       PRICE        CATEGORY");
                        System.out.println(items.getName() + "       " + items.getId() + "      " + items.getMyquantity() + "             " + items.getPrice() + "        " + items.getCategory());
                        System.out.println("____________________________________________________________________________");
                    }
                    break;

                case 10:
                    if (name.length() != 0) {
                        System.out.println("__________________________________________");
                        System.out.println("Here is the Employees list ");
                        System.out.println("NAME      ID        SECTOR");
                        for (Employees employees : employeesList) {
                            System.out.println(employees.getName() + "       " + employees.getId() + "      " + employees.getSector());
                            System.out.println("_______________________________________");
//                            System.out.println(employeesList);
                        }


                    } else {
                        System.out.println("__________________________________________");
                        System.out.println("Please set up your account first....");
                        System.out.println("__________________________________________");

                    }
                    break;

                case 11:
                    try {

                        if (name.length() != 0) {
                            System.out.println("Enter item name: ");
                            searchItem = scan.nextLine();
                            for (Item item : itemList) {
                                if (searchItem.equalsIgnoreCase(item.getName())) {
                                    System.out.println("__________________________________________________________________________");
                                    System.out.println(searchItem + " " + " exists..");
                                    System.out.println("ID" + "  " + " QUANTITY" + "     " + " PRICE");
                                    System.out.println(item.getId() + "       " + item.getMyquantity() + "        " + item.getPrice());
                                    System.out.println("__________________________________________________________________________");

                                }


                            }

                        } else {
                            System.out.println("__________________________________________________________________________");

                            System.out.println("Please setup your account first.....");
                            System.out.println("__________________________________________________________________________");

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 12:
                    if (name.length() != 0) {


                        System.out.println("____________________________________________________________________________");
                        for (Sale s : saleList) {
                            System.out.println("NAME: " + s.getCustomer().getName() + "   " + "ORDER: " + s.getOrderList() + "      " + "TOTAL: " + s.getTotal() + "   " + " PROFIT MADE:" + s.getTotalProfit());
                            System.out.println("________________________________________________________________________");


                        }
//
//
//
                    } else {
                        System.out.println("________________________________________________");
                        System.out.println("Please setup your account first..");
                        System.out.println("________________________________________________");

                    }
                    break;

                case 13:
                    if (name.length() != 0) {
                        System.out.println("__________________________________________________________________________");
                        System.out.println("Thanks for visiting us , Good bye" + " " + name.toUpperCase());
                        System.out.println("__________________________________________________________________________");

                    } else {
                        System.out.println("_____________________________________________________________________________________________");
                        System.out.println("Goodbye,,, Please create account next time so that we can recognize you coz we love you ..");
                        System.out.println("_____________________________________________________________________________________________");
                    }
                    break;
            }

        } while (ch != 13);


    }


}