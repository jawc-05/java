/**
 * @author jawc
 */

package br.com.jawc.patterns.gof.adapter;

public class Demo {

    public static void main(String[] args) {
        String dirFile = "/tmp/teste.txt";
        //Lib externa
        DropBox dropBox = new DropBox();
        Persistence persistence = new DropBoxAdapter(dropBox);
        persistence.rec(new File(dirFile));

    }
}
