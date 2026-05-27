package com.ulisses.composition.entities;

import com.ulisses.composition.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel workerlevel;
    private Double baseSalary;
    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
        this.name = name;
        this.workerlevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        for (HourContract c : contracts){
            Calendar cal = Calendar.getInstance();
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            if (year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
