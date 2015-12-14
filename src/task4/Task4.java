package task4;

import task2.CircularDoubleLinkedList;

public class Task4
{

    public static void main(String[] args)
    {
        class Contact
        {

            String name;
            String address;

            public Contact(String name, String address)
            {
                this.name = name;
                this.address = address;
            }
        }

        CircularDoubleLinkedList<Contact> ll = new CircularDoubleLinkedList<Contact>();
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");

        while (true) {

            java.util.Scanner sc = new java.util.Scanner(System.in);
            String ans;

            System.out.println("Exit, A-Add, S-Search, C-Clear, Z-Size");
            System.out.print("Main>");
            ans = sc.nextLine();
            if (ans.toLowerCase().contains("exit")) {
                System.out.println("Good Bye");
                break;
            } else if (ans.toLowerCase().contains("a")) {
                while (true) {
                    System.out.println("");
                    System.out.print("Add Name>");
                    ans = sc.nextLine();
                    if (ans.toLowerCase().contains("exit")) {
                        break;
                    }
                    String n = ans;
                    System.out.println("");
                    System.out.print("Add Address>");
                    ans = sc.nextLine();
                    String a = ans;
                    if (ans.toLowerCase().contains("exit")) {
                        break;
                    }
                    ll.add(new Contact(n, a));
                }
            } else if (ans.toLowerCase().contains("s")) {
                while (true) {
                    System.out.println("");
                    System.out.print("Search>");
                    ans = sc.nextLine();
                    if (ans.toLowerCase().contains("exit")) {
                        break;
                    }
                    SEARCH:
                    for (int i = 0; i < ll.size(); i++) {
                        if (ll.peek().name.toLowerCase().contains(ans)) {
                            System.out.println("contact has been found");
                            System.out.print("Name: " + ll.peek().name);
                            System.out.print(", Address: " + ll.peek().address);
                            break SEARCH;
                        }
                        ll.next();
                    }
                }
            } else if (ans.toLowerCase().contains("c")) {
                ll.clear();
            } else if (ans.toLowerCase().contains("z")) {
                System.out.println(ll.size());;
            } else if (ans.toLowerCase().contains("xxx")) {
                System.out.println("xxx");;
            }
        }

    }
}
