/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.ArrayList;
import model.History;
import model.Worker;

/**
 *
 * @author lekha
 */
public interface FuntionWorker {
   
    void createWoker(ArrayList<Worker> wk);
    void IncreaseSalary(ArrayList<Worker> wk, ArrayList<History> lh, int status);
    void Decrease(ArrayList<Worker> wk, ArrayList<History> lh, int status);
    void showInformationEdit(ArrayList<History> lh);
}
