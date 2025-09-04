/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.facade;

public class Apartment {

    private Long code;

    private String end;

    public Apartment(Long code, String end) {
        this.code = code;
        this.end = end;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
