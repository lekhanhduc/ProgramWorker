/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.FuntionWorker;
import Repository.ManagerRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.History;
import model.Worker;
import view.Menu;

/**
 *
 * @author lekha
 */
public class ManagerController extends Menu {

    private FuntionWorker funtionWorker;
    static String[] mc = {"Add Worker", "Up Salary", "Down Salary", "Display Information salary", "Exit"};
    private ArrayList<Worker> worker = new ArrayList<>();
    private ArrayList<History> lh = new ArrayList<>();
    private List<Worker> lw;

    public void run() {
        Menu menu = new Menu("PROGRAMMING", mc) {
        };
        Scanner scanner = new Scanner(System.in);
        ManagerRepository mng = new ManagerRepository(lw);
        while (true) {
            menu.displayMenu();
            System.out.println("Enter Choice: ");
            int choice = menu.getUserChoice();
            switch (choice) {
                case 1:
                    mng.createWoker(worker);
                    break;
                case 2:
                    mng.IncreaseSalary(worker, lh, 1);
                    break;
                case 3:
                    mng.Decrease(worker, lh, 2);
                    break;
                case 4:
                    mng.showInformationEdit(lh);
                    break;
                case 5:
                    return;
            }
        }

    }
}
