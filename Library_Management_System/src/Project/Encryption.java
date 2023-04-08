/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.*;
import java.math.*;
import java.nio.charset.*;
import java.security.*;
import javax.swing.*;

/**
 *
 * @author SAIMIHIRNATH
 */
public class Encryption {
    static String pepper = "THEDARKLORD";
    public static String genRandString(int n) {
        Random r = new Random();
        String alphanum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int ind = (int) (alphanum.length() * Math.random());
            sb.append(alphanum.charAt(ind));
        }
        return sb.toString();
    }

    public static String encrypt(String password,String salt) {
        String hash = pepper + password + salt;
        for (int i = 0; i < 5; i++) {
            try {
                hash = toHexString(getSHA(hash));
            } catch (NoSuchAlgorithmException e) {
                JOptionPane.showMessageDialog(null,"Exception thrown for incorrect algorithm: " + e);
            }
        }
        return hash.toString();
    }

    public static byte[] getSHA(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash) {
        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 64) {
            hexString.insert(0, '0');
        }
        return hexString.toString();
    }
}
