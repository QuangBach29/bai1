package Test2;

import Test1.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStuden1 {
    public static void main(String[] args) {
        ArrayList<Student1> listStudent1 = new ArrayList();
        Scanner scNumber = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        System.out.println("Nhap vao thong tin hoc sinh 1:");
        String name = scString.nextLine();
        int age = scNumber.nextInt();
        int score = scNumber.nextInt();
        listStudent1.add(new Student1(age, name, score));
        System.out.println("Nhap vao thong tin hoc sinh 2 :");
        String name1 = scString.nextLine();
        int age1 = scNumber.nextInt();
        int score1 = scNumber.nextInt();
        System.out.println("Danh sach hoc sinh la : ");
        listStudent1.add(new Student1(age1, name1, score1));
        for (int i = 0; i < listStudent1.size(); i++) {
            System.out.println(listStudent1.get(i));

        }
    }

}
