/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.adapter;

import java.io.File;

public interface Persistence {

    public void rec(File file);

    public File read(String id);
}
