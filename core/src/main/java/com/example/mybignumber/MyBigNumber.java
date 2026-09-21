package com.example.mybignumber;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyBigNumber {

    public String sum(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Hai tham so khong duoc null.");
        }

        String a = str1.trim();
        String b = str2.trim();

        if (a.isEmpty() || b.isEmpty()) {
            throw new IllegalArgumentException("Hai tham so khong duoc rong.");
        }

        if (!a.matches("\\d+") || !b.matches("\\d+")) {
            throw new IllegalArgumentException("Hai tham so chi duoc chua chu so.");
        }

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int step = 1;
        List<String> history = new ArrayList<>();

        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int total = digitA + digitB + carry;
            int current = total % 10;
            int prevCarry = carry;
            carry = total / 10;

            result.append(current);

            String log;
            if (prevCarry == 0) {
                log = "Buoc " + step + ": Lay " + digitA + " cong " + digitB + " = " + total + ". Luu " + current + " vao ket qua va nho " + carry + ".";
            } else {
                log = "Buoc " + step + ": Lay " + digitA + " cong " + digitB + " cong nho " + prevCarry + " = " + total + ". Luu " + current + " vao ket qua va nho " + carry + ".";
            }
            history.add(log);

            i--;
            j--;
            step++;
        }

        return result.reverse().toString();
    }

    public List<String> getHistory(String str1, String str2) {
        List<String> history = new ArrayList<>();
        String a = str1.trim();
        String b = str2.trim();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int step = 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int total = digitA + digitB + carry;
            int current = total % 10;
            int prevCarry = carry;
            carry = total / 10;

            String log;
            if (prevCarry == 0) {
                log = "Buoc " + step + ": Lay " + digitA + " cong " + digitB + " = " + total + ". Luu " + current + " vao ket qua va nho " + carry + ".";
            } else {
                log = "Buoc " + step + ": Lay " + digitA + " cong " + digitB + " cong nho " + prevCarry + " = " + total + ". Luu " + current + " vao ket qua va nho " + carry + ".";
            }
            history.add(log);

            i--;
            j--;
            step++;
        }

        return history;
    }
}
