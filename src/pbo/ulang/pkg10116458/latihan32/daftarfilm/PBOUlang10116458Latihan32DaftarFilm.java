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
public class PBOUlang10116458Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("===Daftar Film Sedang Tayang===");
        Film movie = new Film();
        movie.nowPlaying("Venom", "Action, Horror, Sci-fi", 8.5, 120);
        movie.nowPlaying("Small Foot", "Animation", 9.0, 96);
        movie.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        movie.nowPlaying("Asih", "Horror", 6.0, 100);
    }
    
}
