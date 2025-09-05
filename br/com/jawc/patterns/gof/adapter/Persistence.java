/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.adapter;

public interface Persistence {

    void rec(File file);
    File read(String id);
}
