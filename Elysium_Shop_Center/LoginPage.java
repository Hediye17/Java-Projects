package Elysium_Shop_Center;

import java.util.Arrays;
import java.util.Scanner;

public class LoginPage {
    boolean isUserMatch = false;
    Scanner scanner = new Scanner(System.in);
    String[] users = {"Hediye71-123456", "Özgür35-987456", "Cemre-654789"};

    public void Login(){
        while (!isUserMatch){
        System.out.println("Kullanıcı Adı");
        String userName = scanner.nextLine();

        System.out.println("Şifre");
        String password = scanner.nextLine();
        String searchText = userName + "-" + password;
        Arrays.sort(users);
        int indexOfUsers = Arrays.binarySearch(users, searchText);
        isUserMatch = indexOfUsers >= 0;

        for (int i = 0; i < users.length; i++) {
            String user = users[i];
            String[] userİnfo = user.split("-");
            String uName = userİnfo[0];
            String uPassword = userİnfo[1];
            isUserMatch = uName.equalsIgnoreCase(userName) && uPassword.equalsIgnoreCase(password);
            if (isUserMatch) {
                break;
            }
        }
        if (isUserMatch) {
            System.out.println("Hoşgeldin " + userName);
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış lütfen tekrar deneyiniz.");
        }

    }}
}
