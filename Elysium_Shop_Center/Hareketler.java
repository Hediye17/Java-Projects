package Elysium_Shop_Center;
import java.util.Arrays;
import java.time.LocalDateTime;


public class Hareketler {
    private LocalDateTime timestamp;
    private static Hareketler instance; // Singleton instance
    private Log[] logs = new Log[0];
    private Hareketler(){}

    public static Hareketler getInstance() {
        if (instance == null) {
            instance = new Hareketler();
        }
        return instance;
    }

    public void addLog(String message) {
        Log yenilog = new Log(message);
        Log[] newArray = Arrays.copyOf(logs, logs.length + 1);
        newArray[newArray.length - 1] = yenilog;
        logs = newArray;
    }
    public void showLogs() {
        for (Log log : logs) {
            System.out.println(log.getMessage());
        }
    }

}
