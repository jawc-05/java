/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.adapter;

public class DropBoxAdapter  implements Persistence{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox){
        this.dropBox = dropBox;
    }
}
