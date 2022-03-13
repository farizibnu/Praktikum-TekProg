import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        byte id;
        int pengurangan;
        System.out.println("===============MENU===============");
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();

        Scanner sc= new Scanner(System.in);
        System.out.print("\nNama makanan(sesuai id):     ");
        id = sc.nextByte(); // input nama makanan
        System.out.print("Jumlah pesanan:   ");
        pengurangan = sc.nextInt(); // input jumlah makanan
        menu.kurangStok(id, pengurangan);
        System.out.println("\n===============STOK===============");
        System.out.println();
        menu.tampilMenuMakanan();
    }
}

