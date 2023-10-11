/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.ManagerDao;
import Repository.FuntionWorker;
import java.util.ArrayList;
import java.util.List;
import model.History;
import model.Worker;

/**
 *
 * @author lekha
 */
public class ManagerRepository implements FuntionWorker {

    private List<Worker> wk;
    private ArrayList<History> lh;
    public ManagerRepository(List<Worker> wk) {
        this.wk = wk;
    }

    @Override
    public void createWoker(ArrayList<Worker> wk) {
        ManagerDao.Instance().createWorker(wk);
    }

    @Override
    public void IncreaseSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        ManagerDao.Instance().IncreaseSalary(lw, lh, 1);

    }

    @Override
    public void Decrease(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        ManagerDao.Instance().IncreaseSalary(lw, lh, 2);
    }

    @Override
    public void showInformationEdit(ArrayList<History> lh) {
       ManagerDao.Instance().showInformationEdit(lh);
    }

    
    
}
