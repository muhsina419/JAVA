/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s2.practice;

/**
 *
 * @author muhsi
 */
public class ShowCurrentTime {
    public static void main(String[] args){
        long totalMs=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        long totalSeconds=totalMs/1000;
        long currentSecond=totalSeconds%60;
        long totalMinutes=totalSeconds/60;
        long currentMinute=totalMinutes%60;
        long totalHours=totalMinutes/60;
        long currentHour=totalHours%24;
        System.out.println("Current Time is "+currentHour+": "+currentMinute+": "+currentSecond);       
    }
}
