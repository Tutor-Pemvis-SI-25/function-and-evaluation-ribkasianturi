//Ribka Sianturi - 12S25018
import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] deskripsi = new String[10], kodeMK = new String[10], namaMK = new String[10], dosen = new String[10], deadline = new String[10], keterangan = new String[10], status = new String[10];
        int[] tingkatKesulitan = new int[10], hariDeadline = new int[10];
        int jumlahTugas;
        String perintah;

        // while (Conditional) {
            System.out.println("masukkan perintah:");
            perintah = input.nextLine();
            if (perintah.equals("Add task")) {
                tambahTugas();
            } else {
                if (perintah.equals("update task status")) {
                    UpdateStatus();
                } else {
                    if (perintah.equals("show assignment")) {
                        TampilkanTugas();
                    }
                }
            }
        // }
    }
    
    public static int tambahTugas(int daftarTugas) {
        
        return ;
    }
}

