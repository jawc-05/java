/**
 * @author jawc-05
 */
package br.com.jawc.exceptions.client;

import javax.swing.*;
import java.util.Scanner;

public class APPClient {

    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog(null,
                "Digite o código do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);
    }
}