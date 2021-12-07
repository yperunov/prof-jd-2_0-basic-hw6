package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //task2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);

        //task3 (no brakes)
        String fullNameAdmDept = fullName.replace(' ',';');
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameAdmDept);

        //task4
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}
//
//task3-2 (uncompleted experiment)
//StringBuilder fullNameAdmDept2 = new StringBuilder();
//        for (int i = 0; i < fullName.length(); i++) {
//        if (fullNameAdmDept2.charAt(i) == ' ') {
//        fullNameAdmDept2.deleteCharAt(i);
//        fullNameAdmDept2.insert(i, "; ");
//        } else fullNameAdmDept2.insert(i, fullName.charAt(i));
//        }
//        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameAdmDept2);

    //task3-3 (uncompleted experiment)
    //String [] fullNameAdmDeptMassive = fullName.split(" ");
      //  System.out.println(fullNameAdmDeptMassive);
        //        String fullNameAdmDept3;
          //      for (int i = 0; i < fullNameAdmDeptMassive.length; i++) {
        //if (i < fullNameAdmDeptMassive.length - 1) {
        //fullNameAdmDept3 = fullNameAdmDeptMassive[i]+ "; ";
        //} else fullNameAdmDept3 = fullNameAdmDeptMassive[i]++;
        //}
        //System.out.println("Данные ФИО сотрудника для административного отдела — ");