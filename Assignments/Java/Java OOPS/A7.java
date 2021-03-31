import java.util.Scanner;

abstract class DesertItem {
    abstract public int getCost();
}

class Candy extends DesertItem {
    private int totalCandies = 0;
    private int candyPrice = 1; // $1 per candy

    public int addCandies(int candies) {
        totalCandies += candies;
        return totalCandies;
    }

    @Override
    public int getCost() {
        int cost = totalCandies * candyPrice * 60;
        int totalCost = (int) 1.10 * cost;
        return totalCost;
    }
}

class Cookie extends DesertItem {
    private int totalCookies = 0;
    private int cookiePrice = 2; // 2 Euro per cookie

    public int addCookies(int cookies) {
        totalCookies += cookies;
        return totalCookies;
    }

    @Override
    public int getCost() {
        int cost = cookiePrice * 70;
        int totalCost = (int) 1.10 * cost;
        return totalCost;
    }
}

class IceCream extends DesertItem {
    private int totalIceCreams = 0;
    private int iceCreamPrice = 100; // 100 rupees per ice cream

    public int addIceCreams(int iceCreams) {
        totalIceCreams += iceCreams;
        return totalIceCreams;
    }

    @Override
    public int getCost() {
        int cost = totalIceCreams * iceCreamPrice;
        int totalCost = (int) 1.10 * cost;
        return totalCost;
    }
}

public class A7 {
    Scanner inputTaker = new Scanner(System.in);
    Candy candy = new Candy();
    Cookie cookie = new Cookie();
    IceCream iceCream = new IceCream();

    public static void main(String[] args) {
        A7 a2q7 = new A7();
        a2q7.selectRoles();
    }

    private void selectRoles() {
        System.out.println("Choose Role");
        System.out.println("===========");
        System.out.println("A. owner");
        System.out.println("B. customer");
        System.out.println("C. exit");
        System.out.print("Enter your choice: ");
        String selectedRole = inputTaker.next();
        System.out.println();
        roles(selectedRole);
    }

    private void roles(String Roles) {
        if (Roles.equals("A")) {
            addItems();
        } else if (Roles.equals("B")) {
            placeOrder();
        } else if (Roles.equals("C")) {
            return;
        } else {
            System.out.println("Invalid Choice");
            selectRoles();
        }
    }

    private void addItems() {
        int choice = 0;
        int totalItems = 0;
        while (choice != 9) {
            System.out.println("Add Item");
            System.out.println("==========");
            totalItems = candy.addCandies(0);
            System.out.println("1. Candy ("+totalItems+")");
            totalItems = cookie.addCookies(0);
            System.out.println("2. Cookie ("+totalItems+")");
            totalItems = iceCream.addIceCreams(0);
            System.out.println("3. IceCream ("+totalItems+")");
            System.out.println("4. Change Role");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = inputTaker.nextInt();
            addItemsOperation(choice);
        }
    }

    private void addItemsOperation(int choice) {
        int quantity = 0;
        if (choice == 9) {
            System.exit(0);
        } else if (choice == 1) {
            System.out.print("Number of candies: ");
            quantity = inputTaker.nextInt();
            int totalCandies = candy.addCandies(quantity);
            System.out.println("Total candies in shop: " + totalCandies);
        } else if (choice == 2) {
            System.out.print("Number of cookies: ");
            quantity = inputTaker.nextInt();
            int totalCookies = cookie.addCookies(quantity);
            System.out.println("Total cookies in shop: " + totalCookies);
        } else if (choice == 3) {
            System.out.print("Number of icecreams: ");
            quantity = inputTaker.nextInt();
            int totalIcecreams = iceCream.addIceCreams(quantity);
            System.out.println("Total icecreams in shop: " + totalIcecreams);
        } else if (choice == 4) {
            selectRoles();
        } else {
            System.out.println("Invalid Choice, Please Choose again");
            return;
        }
        System.out.println();
    }

    private void placeOrder() {
        int choice = 0;
        int totalItems = 0;
        while (choice != 9) {
            System.out.println("Order Item");
            System.out.println("==========");
            totalItems = candy.addCandies(0);
            System.out.println("1. Candy ("+totalItems+")");
            totalItems = cookie.addCookies(0);
            System.out.println("2. Cookie ("+totalItems+")");
            totalItems = iceCream.addIceCreams(0);
            System.out.println("3. IceCream ("+totalItems+")");
            System.out.println("4. Change Role");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = inputTaker.nextInt();
            placeOrderOperation(choice);
        }
    }

    private void placeOrderOperation(int choice) {
        int quantity = 0;
        int price = 0;
        int stock = 0;
        switch(choice) {
            case 1:
                System.out.print("Number of candies: ");
                quantity = inputTaker.nextInt();
                stock = candy.addCandies(0);
                if (quantity <= stock) {
                    price = quantity * candy.getCost();
                    candy.addCandies(-quantity);
                    System.out.println("Total cost of " + quantity + " candies = " + price);
                } else {
                    System.out.println("Ordered more than in stock");
                }
                break;
            case 2:
                System.out.print("Number of cookies: ");
                quantity = inputTaker.nextInt();
                stock = cookie.addCookies(0);
                if (quantity <= stock) {
                    price = quantity * cookie.getCost();
                    cookie.addCookies(-quantity);
                    System.out.println("Total cost of " + quantity + " cookies = " + price);
                } else {
                    System.out.println("Ordered more than in stock");
                }
                break;
            case 3:
                System.out.print("Number of cookies: ");
                quantity = inputTaker.nextInt();
                stock = iceCream.addIceCreams(0);
                if (quantity <= stock) {
                    price = iceCream.getCost();
                    iceCream.addIceCreams(-quantity);
                    System.out.println("Total cost of " + quantity + " icecreams = " + price);
                } else {
                    System.out.println("Ordered more than in stock");
                }
                break;
            case 4:
                selectRoles();
                break;
            case 9:
                System.exit(0);
            default:
                System.out.println("Invalid Choice, Please Choose again");
        }
        System.out.println();
    }
}
