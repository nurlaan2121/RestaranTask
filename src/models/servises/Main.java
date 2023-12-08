package models.servises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniMenuimp miniMenuimp = new MiniMenuimp();
        LOOP:
        while (true){
            try {
                System.out.println("""
                        Choice command:
                        1.Create menu
                        2.Remove menu
                        3.Get all menu
                        4.Sort by price
                        5.Get by name
                        0.Exit
                       
                        """);
                int action  = scanner.nextInt();
                switch (action){
                    case 1->{
                        MiniMenu miniMenu = new MiniMenu();
                        while (true){
                            System.out.println("Write name: ");
                            String name = new Scanner(System.in).nextLine();
                            if (name.length()>2){
                                miniMenu.setName(name);
                                break;
                            }

                        } while (true){
                            try {
                                System.out.println("Write price : ");
                                Long name = new Scanner(System.in).nextLong();
                                if (name>0){
                                    miniMenu.setPrice(name);
                                    break;
                                }
                            }catch (InputMismatchException exception){
                                System.out.println("San jaz");
                            }


                        } while (true){
                            try {
                                System.out.println("Write priperation time : ");
                                int name = new Scanner(System.in).nextInt();
                                if (name>0){
                                    miniMenu.setPreperationTime(name);
                                    break;
                                }
                            }catch (InputMismatchException exception){
                                System.out.println("San jaz!");
                            }
                        }
                        miniMenu.setId(GeneratorId.generate());
                        System.out.println(miniMenuimp.createMenu(miniMenu));
                    }case 2->{
                        System.out.println("Write id menu");
                        System.out.println(miniMenuimp.removeMenu(new Scanner(System.in).nextLong()));
                    }case 3->{
                        System.out.println(miniMenuimp.getallmenu());
                    }case 4->{
                        System.out.println("Write (Esc or Desc)");
                        System.out.println(miniMenuimp.sortByPrice(new Scanner(System.in).nextLine()));
                    }case 5->{
                        System.out.println("Write  name: ");
                        System.out.println(miniMenuimp.getbyNAme(new Scanner(System.in).nextLine()));
                    }
                    case 0->{
                        break LOOP;
                    }
                }
            }catch (InputMismatchException exception){
                System.out.println("San jazz");
                scanner.next();
            }
        }

    }
}