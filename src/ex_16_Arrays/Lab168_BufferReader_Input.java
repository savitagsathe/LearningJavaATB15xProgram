package ex_16_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//to take the input from user BufferReader is also used but the Scanner is easy one
public class Lab168_BufferReader_Input {
    static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n: ");
        int n=Integer.parseInt(bf.readLine().trim());
        System.out.println(n);
        }

    }

