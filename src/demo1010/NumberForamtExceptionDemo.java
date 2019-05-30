/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1010;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 * 杩愮敤鍥惧舰鐣岄潰鐨勫姞娉曡繍绠�
 */
public class NumberForamtExceptionDemo {

    public static void main(String args[]) {

        String s1 = JOptionPane.showInputDialog(null, "input a integer"); //"123"
        String s2 = JOptionPane.showInputDialog(null, "input a integer");  //"456"
        int sum=0;
        
        try{
        
        int x = Integer.parseInt(s1); //1w鏁板瓧鏍煎紡寮傚父瀵硅薄ttt
        int y = Integer.parseInt(s2); //NumberFormatException 
         sum = x + y;
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
           // System.out.println("鏁板瓧鏍煎紡閿欒");
            
            
        }
        
        JOptionPane.showMessageDialog(null, sum);

    }
}
