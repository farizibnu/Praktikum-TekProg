public class Restaurant {
    private Menu[] Makanan;
    public static byte id=0;

    public Restaurant() {
        Makanan = new Menu[10];
        for(int i = 0; i<10; i++){
            Makanan[i] = new Menu("dummy", 0.0, 0);
        }
    }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        Makanan[id].setNama_makanan(nama);
        Makanan[id].setHarga_makanan(harga);
        Makanan[id].setStok(stok);
    }
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(Makanan[i].getNama_makanan() +"["+Makanan[i].getStok()+"]"+"\tRp. "+Makanan[i].getHarga_makanan());
            }
        }
    }
    private boolean isOutOfStock(int id){
        if(Makanan[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    public void kurangStok(int id, int pengurangan) {
        Makanan[id].setStok(Makanan[id].getStok() - pengurangan);
    }
    public static void nextId(){
        id++;
    }
}

