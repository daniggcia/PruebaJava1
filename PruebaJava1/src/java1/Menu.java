package java1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("Menu exercise");
            System.out.println("1. Calculate water cost");
            System.out.println("2. Calculate temperature");
            System.out.println("3. Guessing game");
            System.out.println("4. Exit");

            try {

                System.out.println("Choose an option : ");
                option = teclado.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("You have selected option 1");
                        Scanner teclado2 = new Scanner(System.in);
                        Scanner sc = new Scanner(System.in);
                        double cost = 0;
                        double value = 0;
                        double firsttranche = 0.15;
                        double secondtranche = 0.20;
                        double thirdtranche = 0.35;
                        double fourthtranche = 0.80;
                        System.out.println("Enter liters of water consumption in m3 : ");
                        value = sc.nextDouble();

                        if (value <= 100) {
                            double price = (firsttranche * value);
                            System.out.println("Your quota is for the first tranche" + firsttranche + " " + value + " m3, your price : " + price + " euros/m3");
                        }
                        if (value > 100 && value <= 600) {
                            double rest = (value - 100);
                            double price2 = ((100 * 0.15) + (rest * 0.20));
                            System.out.println("Your quota is for the second tranche" + secondtranche + " " + value + " m3, your price : " + price2 + " euros/m3");
                        }
                        if (value > 600 && value <= 1100) {
                            double rest2 = (value - 600);
                            double price3 = (100 * 0.15) + (500 * 0.20) + (rest2 * 0.35);
                            System.out.println("Your quota is for the third tranche" + thirdtranche + " " + value + " m3, your price : " + price3 + " euros/m3");
                        }
                        if (value > 1100) {
                            double rest3 = (value - 1100);
                            double price4 = ((100 * 0.15) + (500 * 0.20) + (500 * 0.35) + (rest3 * 0.80));
                            System.out.println("Your quota is for the fourth tranche" + fourthtranche + " " + value + " m3, your price : " + price4 + " euros/m3");

                        }
                        break;
                    case 2:
                        System.out.println("You have selected option 3");

                        Scanner sccc = new Scanner(System.in);
                        Scanner teclado3 = new Scanner(System.in);

                        System.out.println(" How many temperatures do you want to enter ?");

                        int y = sccc.nextInt();
                        int i;
                        int[] temperaturas = new int[y];
                        int cont = 0;
                        int conta = 0;
                        double average = 0;
                        double totalaverage = 0;

                        for (i = 0; i < temperaturas.length; i++) {
                            System.out.printf("Enter temperatures %d: ", i + 1);
                            temperaturas[i] = teclado3.nextInt();
                            conta++;
                            average = average + temperaturas[i];
                            totalaverage = totalaverage / temperaturas.length;
                            if (temperaturas[i] <= 0) {
                                cont++;
                            }
                        }
                        System.out.println("You have enter : " + conta + " temperatures");
                        System.out.println("There are " + cont + " temperatures below 0 degrees Celsius ªC");
                        System.out.println("The average of the temperatures entered is : " + totalaverage + " degrees Celsius ªC ");

                        break;

                    case 3:
                        System.out.println("You have selected option 3");
                        Scanner scc = new Scanner(System.in);

                        int random = (int) ((Math.random() * 50));
                        int user;
                        int counter;

                        System.out.println("The game consists of finding out a secret number out of 50 possible ones");
                        System.out.println(" You have 7 attempts. Write a number between 1 and 50 ");

                        user = scc.nextInt();
                        for (counter = 0; counter <= 7;
                             counter++) {
                            if (random == user) {
                                System.out.println("You have guessed correctly, you have won a frigo-finger, wow !!! ");
                                break;
                            } else if (counter == 7) {
                                System.out.println("Sorry: you lost. The number was the : " + random);
                                break;
                            }

                            if (random > user) {
                                System.out.println("The secret number is Greater than : " + user);
                            } else if (random < user) {
                                System.out.println("The secret number is LESS than :  " + user);
                            }

                            if (counter <= 4) {
                                System.out.print("Come on, another try : ");
                                user = scc.nextInt();
                            } else if (counter == 5) {
                                int x = random / 10;
                                System.out.println("A help, the first digit is : " + x);
                                System.out.print("Try again : ");
                                user = scc.nextInt();
                            } else if (counter >= 6) {
                                System.out.print(" Last chance ........");
                                user = scc.nextInt();
                            }
                        }

                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Only numbers between 1 and 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number");
                teclado.next();

            }
        }
    }
}

