/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Worker;

/**
 *
 * @author lekha
 */
public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int result = sc.nextInt();
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                sc.nextLine();
                return result;

            } catch (NumberFormatException e) {
                System.err.println("Enter Input number from " + min + "to" + max);
                System.out.println("Enter again: ");

            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again: ");
            }
            return result;
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be Input int number....");
                System.out.println("Enter again: ");
            }
        }

    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be Input Double number....");
                System.out.println("Enter again: ");
            }
        }
    }

    public static boolean checkIdExits(ArrayList<Worker> wk, String id) {
        for (Worker worker : wk) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return true;
            }
        }
        return false;

    }
    public static int checkInputSalary() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Salary must be greater than 0");
                System.out.print("Enter again: ");
            }
        }
    }
    public static boolean checkWorkerExist(ArrayList<Worker> lw, String id,
            String name, int age, int salary, String workLocation) {
        //check from first to last list worker  worker exist or not
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())
                    && name.equalsIgnoreCase(worker.getName())
                    && age == worker.getAge()
                    && salary == worker.getSalary()) {
                return false;
            }
        }
        return true;
    }
}
