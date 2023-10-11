/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author lekha
 */
public abstract class Menu {
    private String programName;
    private String[] options;

    public Menu() {
    }

    public Menu(String programName, String[] options) {
        this.programName = programName;
        this.options = options;
    }
    public void displayMenu() {
        System.out.println("Welcome to " + programName);
        System.out.println("Select an option:");

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
       public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
    
}
