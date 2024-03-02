/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kpihx_labs.gestionrisque;

/**
 *
 * @author kpihx
 */
public class Client {
    private String ageCategory;
    private String salaryCategory;

    public Client(String ageCategory, String salaryCategory) {
        this.ageCategory = ageCategory;
        this.salaryCategory = salaryCategory;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public String getSalaryCategory() {
        return salaryCategory;
    }
}
