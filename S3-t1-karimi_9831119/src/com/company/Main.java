package com.company;
/**
 *
 *main class of project
 * we build my clock based as an object based on ClockDisplay class
 * local time is provided by LocalDateTime
 * display the colock and sleep for 1 sec
 * !!!! couldnt find a working code for clearing the screen !!!
 * @author Mohammad Reza Karimi
 * @version 1.0
 *
 */

import java.io.Console;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ClockDisplay mycolock = new ClockDisplay();
        LocalDateTime date = LocalDateTime.now();
        mycolock.setTime(date.getHour(), date.getMinute(), date.getSecond());
        while (1<2) {


            System.out.println(mycolock.getTime());

            mycolock.timeTick();
       //     TimeUnit.SECONDS.sleep(1);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

           // System.out.print('\u000C');




        }



    }

}
