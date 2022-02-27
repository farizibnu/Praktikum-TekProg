public class KelasDua {
    {
        System.out.println(5); /* tidak diprint karena
        KelasDua tidak mendapatkan constructed */
    }
    public static void main(String[] args)
    {
        System.out.println(6); //hasil print pertama
        KelasSatu satu = new KelasSatu(); //construct object tanpa parameter
        KelasSatu dua = new KelasSatu(10); //construct object dengan parameter
    }
}
