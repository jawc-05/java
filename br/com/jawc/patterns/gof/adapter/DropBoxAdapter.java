/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.adapter;

import java.io.File;

public class DropBoxAdapter  implements Persistence{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox){
        this.dropBox = dropBox;
    }

    @Override
    public void rec(File file) {
        dropBox.upload(new DropBoxFile(file.getAbsolutePath()));
    }

    @Override
    public File read(String id) {
        DropBoxFile dbFile = dropBox.download(id);
        return new File(dbFile.getLocalPath());
    }
}
