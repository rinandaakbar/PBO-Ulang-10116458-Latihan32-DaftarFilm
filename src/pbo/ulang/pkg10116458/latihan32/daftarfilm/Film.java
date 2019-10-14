/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan32.daftarfilm;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying(String filmName, String filmGenre, Double filmRating, 
            int filmDuration) {
        System.out.println();
        System.out.println("Judul Film\t: " + filmName);
        System.out.println("Genre Film\t: " + filmGenre);
        System.out.println("Rating Film\t: " + filmRating);
        System.out.println("Duration Film\t: " + filmDuration + " Menit");
        
    }
}
