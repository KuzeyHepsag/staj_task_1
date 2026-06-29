import java.util.LinkedList;
import java.util.Queue;

public class KuyrukGorevi {
    public static void main(String[] args) {
        // LinkedList tabanlı bir Queue oluştur
        Queue<String> kuyruk = new LinkedList<>();

        // Kuyruğa 3 stajyer ismi ekle (Kuzey, Ahmet, Mehmet)
        kuyruk.add("Kuzey");
        kuyruk.add("Ahmet");
        kuyruk.add("Mehmet");

        System.out.println("İlk Kuyruk: " + kuyruk);

        // Kuyruğun en önündeki elemanı çek ve ekrana yazdır (poll metodu)
        String ilkGiren = kuyruk.poll();
        System.out.println("Kuyruktan çıkan ilk kişi: " + ilkGiren);
        System.out.println("Kuyruğun kalan hali: " + kuyruk);
    }
}