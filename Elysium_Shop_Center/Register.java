package Elysium_Shop_Center;

import java.util.Scanner;

public class Register {
    boolean isMatch = false;


    public void Kayit() {
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;
        while (true) {
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName=scanner.nextLine();

            if (userName.length() <= 6) {
                System.out.println("Lütfen minimum 6 karakter kullanın");
                continue;
            }
            char firstChar = userName.charAt(0);
            if (Character.isDigit(firstChar)) {
                System.out.println("Hata kullanıcı adı rakam ile başlayamaz.");
                continue;
            }
            System.out.println("Kullanıcı adı doğru");
            break;
        }
        while (true) {
            System.out.println("Şifre Giriniz");
            password=scanner.nextLine();
            if (password.length() < 8) {
                System.out.println("Şifre 8 karakterden küçük olamaz.");
                continue;
            }
            isMatch = password.matches(".*[a-z].*") && password.matches(".*[A-Z].*")
                    &&password.matches(".*[0-9].*") && password.matches(".*[.!@#$%^&_*-].*");

            if (!isMatch) {
                System.out.println("Şifre en az bir büyük küçük harf,rakam ve özel karakter (.!@#$%^&_*-) içermeli içermelidir");
                continue;   }

            String secretPassword = password.replaceAll(".", "*");
            System.out.println(secretPassword);
        break;}

        while (true) {
            System.out.println("Şifre Tekrarı");
            String cPassword = scanner.nextLine();

           if (cPassword.equals(password))
            {
                System.out.println("Kayıt Başarılı.");
            break;
           }
           else {
               System.out.println("Şifre eşleşmiyor.");
           }
        }
}
}