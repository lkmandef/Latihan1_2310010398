package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika lukman = new Matematika(9, 8);
        
        System.out.println("Hasil Penjumlahan : "+lukman.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+lukman.setPengurangan());
        System.out.println("Hasil Perkalian   : "+lukman.setPerkalian());
        System.out.println("Hasil Pembagian   : "+lukman.setPembagian());
    }   
}