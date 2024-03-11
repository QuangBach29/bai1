package Test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "anh", 24));
        list.add(new Student1(2, "hd", 25));
        while (true) {
            System.out.println("--------Menu---------" +
                    "\n1, Xem danh sach" +
                    "\n2, Them moi " +
                    "\n3, Tim kiem " +
                    "\n4, xoa" +
                    "\n5, Sua theo id" +
                    "\n6, Thoat");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice ==1 ) {
                System.out.println("Danh sach la : ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
            if (choice == 2){
                System.out.println("Nhap vao thong tin sinh vien :");
                System.out.println("Nhap id :");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhap ten :");
                String name = scanner.nextLine();
                System.out.println("Nhap tuoi :");
                int score = scanner.nextInt();
                list.add(new Student1(age, name, score));

            }
            if (choice == 3){
                System.out.println("Nhap ten can tim : ");
                scanner.nextLine();
                String name = scanner.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(name)){
                        System.out.println(list.get(i));
                    }
                }
            }
            if (choice == 5){
                System.out.println("Nhap vao id muon sua :");
                int age = scanner.nextInt();
                System.out.println("Nhap vao ten muon sua :");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Nhap vao tuoi muon sua :");
                int score = scanner.nextInt();
                int viTriCanSua = -1;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getAge()==age){
                        viTriCanSua = i;
                    }
                }
                list.get(viTriCanSua).setScore(score);
                list.get(viTriCanSua).setName(name);
            }
            if (choice == 4){
                System.out.println("Nhap vao id muon xoa");
                int age = scanner.nextInt();
                int viTriCanXoa = -1;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getAge()==age){
                        viTriCanXoa=1;
                    }
                }
            }
            if (choice == 0){
                break;
            }
        }
    }
}
