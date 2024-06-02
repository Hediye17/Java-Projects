package Elysium_Shop_Center;
import java.util.Scanner;
public class Store_Info {

    Hareketler hareketler=Hareketler.getInstance();

    public void Floor1Info(){
        Scanner scanner = new Scanner(System.in);
        String[] Floor1Store={"Teknosa","Levis","Sephora","Nike"};
        System.out.println("Lütfen alışveriş yapmak istediğiniz mağazayı seçiniz:");
        for (int i = 0; i < Floor1Store.length; i++) {
            System.out.println((i+1)+"."+Floor1Store[i]);}
        int storeChoice= scanner.nextInt();
        switch (storeChoice){
            case 1:
                System.out.println("Teknosa'ya Hoşgeldiniz");
                String[] teknosaProduct={"Telefon","Gyilebilir Teknoloji","Bilgisayar & Tablet","Televizyon, Ses ve Görüntü Sitemleri","Beyaz Eşya ve Ankastre","Elektrikli Ev Aletleri"};
                for (String product:teknosaProduct){
                    System.out.println(product);
                }
                hareketler.addLog("Teknosa Mağazasına giriş yapıldı.");
                break;
            case 2:
                System.out.println("Levis'e Hoşgeldiniz");
                String[] levisProduct={"Kadın","Erkek","Aksesuar","Aksesuar","Koleksiyonlar"};
                for (String product:levisProduct){
                    System.out.println(product);
                }
                hareketler.addLog("Levi's Mağazasına giriş yapıldı.");

                break;
            case 3:
                System.out.println("Sephora'ya Hoşgeldiniz");
                String[] sephoraProduct={"Makyaj","Parfüm","Cilt Bakımı","Vücut ve Banyo","Saç",};
                for (String product:sephoraProduct){
                    System.out.println(product);
                }
                hareketler.addLog("Sephora Mağazasına giriş yapıldı.");

                break;
            case 4:
                System.out.println("Nike Mağazasına Hoşgeldiniz.");
                String[] nikeProduct={"Erkek","Kadın","Çocuk","İndirim","Yeni Çıkanlar",};
                for (String product:nikeProduct){
                    System.out.println(product);
                }
                hareketler.addLog("Nike Mağazasına giriş yapıldı.");
                break;
            default:
                System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir sayı giriniz.");
                break;

        }
    }
    public void Floor2Info() {
        Scanner scanner = new Scanner(System.in);
        String[] Floor2Store = {"LCwaikiki", "Atasay", "Boyner", "D&R"};
        System.out.println("Lütfen alışveriş yapmak istediğiniz mağazayı seçiniz:");
        for (int i = 0; i < Floor2Store.length; i++) {
            System.out.println((i+1)+Floor2Store[i]);}
        int storeChoice=scanner.nextInt();
        scanner.nextLine();
        switch (storeChoice) {
            case 1:
                System.out.println("LCWaikiki'ye Hoşgeldiniz.");
                String[] LCWaikikiProducts = {"Kadın", "Erkek", "Çocuk & Bebek", "Ayakkabı", "Aksesuar", "Ev & Yaşam", "Kozmetik Kişisel Bakım", "Outlet"};
                for (String product : LCWaikikiProducts) {
                    System.out.println("- " + product);
                }
                hareketler.addLog("LCWaikiki Mağazasına giriş yapıldı.");
                break;
            case 2:
                System.out.println("Atasay'a Hoşgeldiniz.");
                String[] AtasayProducts = {"Altın", "Pırlanta", "Erkek", "Çocuk", "Koleksiyonlar", "Alyans", "Monaco Chain", "Yeni Gelenler"};
                for (String product : AtasayProducts) {
                    System.out.println("- " + product);
                }
                hareketler.addLog("Atasay Mağazasına giriş yapıldı.");
                break;
            case 3:
                System.out.println("Boyner'e Hoşgeldiniz.");
                String[] BoynerProducts = {"Kadın", "Erkek", "Çocuk", "Spor", "Ayakkabı & Çanta", "Kozmetik", "Saat & Aksesuar"};
                for (String product : BoynerProducts) {
                    System.out.println("- " + product);
                }
                hareketler.addLog("Boyner Mağazasına giriş yapıldı.");
                break;
            case 4:
                System.out.println("D&R'e Hoşgeldiniz.");
                String[] DandRProducts = {"Kitap", "Ders Kitapları", "Elektronik", "Bilgisayar, Tablet", "Hobi & Oyuncak", "Ofis & Kırtasiye", "Müzik & Hediyelik"};
                for (String product : DandRProducts) {
                    System.out.println("- " + product);
                }
                hareketler.addLog("D&R Mağazasına giriş yapıldı.");
                break;
            default:
                System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir sayı giriniz.");
                break;
        }
    }
    public void Floor3Info(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen alışveriş yapmak istediğiniz mağazayı seçiniz:");
        String[] floor3Store={"Beymen","English Home","Fenerium","Gratis"};

        for (int i = 0; i < floor3Store.length; i++) {
            System.out.println((i+1)+floor3Store[i]);}

        int storeChoice=scanner.nextInt();
        scanner.nextLine();
        switch (storeChoice){
            case 1: System.out.println("Beymen Mağazasına Hoşgeldiniz.");
                String[] beymenProduct={"Kadın","Erkek","Çocuk","Kozmetik","Ev & Mobilya","Anne & Bebek & Oyuncak","Spor & Outdoor"};
               for (String bProduct: beymenProduct){
                   System.out.println(bProduct);
                   hareketler.addLog("Beymen Mağazasına giriş yapıldı.");

               }break;
            case 2: System.out.println("English Home Mağazasına Hoşgeldiniz.");
                String[] eHomeProduct={"Çeyiz  Ürünleri","Küçük Ev Aletleri","Sofra","Mutfak","Dekorasyon", "yatak Odası","Banyo","Kozmetik"};
                for (String HomeProduct:eHomeProduct)
                { System.out.println(HomeProduct);}
                hareketler.addLog("English Home Mağazasına giriş yapıldı.");
                break;
            case 3: System.out.println("Fenerium Mağazasına Hoşgeldiniz.");
                String[] feneriumProduct={"Puma","Erkek","Kadın","Çocuk","Ev/Yaşam","Outlet","Kampanyalar"};
                for (String fenerPro:feneriumProduct){
                System.out.println(fenerPro);}
                hareketler.addLog("Fenerium Mağazasına giriş yapıldı.");
                break;
            case 4: System.out.println("Gratis Mağazasına Hoşgeldiniz.");
                String[] gratisProduct={"Makyaj","Cilt Bakımı","Saç Bakımı","Parfüm & Deodorant","Erkek Bakım","Kişisel Bakım","Ev & Yaşam"};

                for (String gratisPro:gratisProduct){
                System.out.println(gratisPro);}
                hareketler.addLog("Gratis Mağazasına giriş yapıldı.");

                break;

            default: System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir sayı giriniz.");

                break;
        }
    }
}
