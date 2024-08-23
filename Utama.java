/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMh;

/**
 *
 * @author ISMAIL
 */
public class Utama {
    public static void main (String args []){
        Mamalia sapi = new Mamalia();
        System.out.println("Nama Saya Sapi...");
        sapi.beradaptasi();
        sapi.bernafas();
        sapi.tumbuhDanBerkembang();
        sapi.pekaTerhadapRangsang();
        sapi.kelenjarSusu();
        sapi.setJumlahkaki(4);
        sapi.setAlatNafas("paru - paru");
        sapi.setBertulangbelakang("Vertebrata");
        sapi.setHabitat("Darat");
        sapi.setMakanan("Herbivora");
        sapi.setBergerak("Berjalan");
        sapi.setSuhu("Berdarah Panas");
        System.out.println("Jumlah kaki saya ada " + sapi.getJumlahkaki());
        System.out.println("Alat Pernapasan saya yakni " + sapi.getAlatNafas());
        System.out.println("Saya tergolong hewan " + sapi.getBertulangbelakang());
        System.out.println("Habitat Saya berada di " + sapi.getHabitat());
        System.out.println("Dari segi makanan saya tergolong hewan " + sapi.getMakanan());
        System.out.println("Saya Bergerak dengan cara " + sapi.getBergerak());
        System.out.println("Saya termasuk kedalam hewan " + sapi.getSuhu());
                
    }
}
