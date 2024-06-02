package Elysium_Shop_Center;
import java.util.Scanner;
public class Shop_center {
    Hareketler hareketler=Hareketler.getInstance();

    public void Giris() {
        Register kayitSayfasi=new Register();
        Scanner scanner = new Scanner(System.in);
        LoginPage girisYap=new LoginPage();
        System.out.println("***Elysium Remote Alışveriş Merkezine Hoşgeldiniz***");
        System.out.println("1=> Giriş Yap");
        System.out.println("2=> Kayıt Ol");
        System.out.println("3=> Bize Ulaş");
        int girisEkrani = scanner.nextInt();
        hareketler.addLog("Giriş Ekranı =>"+girisEkrani);
        scanner.nextLine();
        if (girisEkrani == 1) {
            girisYap.Login();
            hareketler.addLog("Giriş yap");
        }
        else if (girisEkrani==2) {
                kayitSayfasi.Kayit();
                hareketler.addLog("Kayıt ol sayfası");
            }
        else if (girisEkrani==3) {
        }
        else {
            System.out.println("Hatalı tuşlama");} }

    public void floor(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen gitmek istediğiniz katı seçiniz");
        System.out.println("1=> 1.kat ");
        System.out.println("2=> 2.kat ");
        System.out.println("3=> 3.kat ");
        System.out.println("4=> Hareketler ");
        System.out.println("0=> Çıkış");
        System.out.println("-1=> Otopark");
        String floorChoice=scanner.nextLine();
        hareketler.addLog("Kat seçimi => "+floorChoice);
    }

    public static void main(String[] args) {
        Store_Info magazabilgisi=new Store_Info();
        Shop_center project=new Shop_center();
        Scanner scanner=new Scanner(System.in);
        Hareketler hareketler=Hareketler.getInstance();
        project.Giris();
        while (true){
            project.floor();
            String elevator=scanner.next();
            hareketler.addLog("Elevator seçimi"+elevator);

            switch (elevator) {
                case "1":
                    magazabilgisi.Floor1Info();
                    hareketler.addLog("1. Kat seçimi ");
                    break;
                case "2":
                    magazabilgisi.Floor2Info();
                    hareketler.addLog("2. Kat seçimi ");
                    break;
                case "3": magazabilgisi.Floor3Info();
                    hareketler.addLog("3. Kat seçimi ");
                    break;
                case "4": project.showHareketler();
                    break;
                case "0":
                    project.exit();
                    break;
                case "-1":project.otopark();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir giriş yapınız.");
                    break;
            }
        }
    }
    public void exit(){
        hareketler.addLog("kullanıcı çıkış yaptı");
           System.out.println("Çıkışa yönlendiriliyorsunuz...");
           System.exit(0);}

    public void otopark(){
        hareketler.addLog("Kullanıcı park katını kullandı");
           System.out.println("Otopark katındasınız.");}

    public void showHareketler(){
        System.out.println("***Kullanıcı hareketleri***");
        hareketler.showLogs();
    }

}