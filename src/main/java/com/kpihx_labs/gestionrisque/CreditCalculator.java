/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kpihx_labs.gestionrisque;

/**
 *
 * @author kpihx
 */
public class CreditCalculator {
    private final static String[] salaryCategories =  new String[]{"50,000 - 100,000", "100,001 - 200,000", "200,001 - 300,000", ">= 300,001"};
    private final static String[] ageCategories = new String[]{"<= 45", "46 - 55"};
    private final static double CREDIT_MINIME = 1000000;
    private final static double CREDIT_JUNIOR = 2000000;
    private final static double CREDIT_EQUILIBRE = 3000000;
    private final static double CREDIT_GOLD = 5000000;
    
    public static String calculateCredit(Client client, double requestedCredit) {
        String ageCategory = client.getAgeCategory();
        String salaryCategory = client.getSalaryCategory();

        double maxCredit = 0.0;

        if (salaryCategory.equals(salaryCategories[0])) {
            if (ageCategory.equals(ageCategories[0])) {
                maxCredit = CREDIT_MINIME;
            }
        } else if (salaryCategory.equals(salaryCategories[1])){
            if (ageCategory.equals(ageCategories[0])) {
                maxCredit = CREDIT_JUNIOR;
            } else if (ageCategory.equals(ageCategories[1])){
                maxCredit = CREDIT_MINIME;
            }
        } else if (salaryCategory.equals(salaryCategories[2])){
            if (ageCategory.equals(ageCategories[0])) {
                maxCredit = CREDIT_EQUILIBRE;
            } else if (ageCategory.equals(ageCategories[1])){
                maxCredit = CREDIT_JUNIOR;
            }
        } else {
            if (ageCategory.equals(ageCategories[0])) {
                maxCredit = CREDIT_GOLD;
            } else if (ageCategory.equals(ageCategories[1])){
                maxCredit = CREDIT_EQUILIBRE;
            }
        }
        
        if (maxCredit == 0.0) {
            return "Aucun crédit ne peut être accordé pour votre catégorie.";
        } else if (requestedCredit > maxCredit) {
            return "Désolé, nous ne pouvons vous accorder que " + maxCredit +" FCFA.";
        } else {
            return "Votre demande de crédit de " + requestedCredit + " FCFA a été approuvée.";
        }
    }
       
    public static String[] getSalaryCategories() {
        return salaryCategories.clone();
    }

    public static String[] getAgeCategories() {
        return ageCategories.clone();
    }
}


