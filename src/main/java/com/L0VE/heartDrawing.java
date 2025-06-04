package com.L0VE;

import com.birdbrain.Finch;
import java.util.Scanner;

public class heartDrawing {
    public static void main(String[] args){
        Finch bird = new Finch();
        Scanner scanner = new Scanner(System.in);
        bird.setBeak(0, 0, 0);
        bird.stopAll();

        // //ADD STUFF
        System.out.println("Please choose a color for the beak! Pink, Hot Pink, Purple, or Blue!: ");
        String beak = scanner.nextLine();
        System.out.println("Please choose a color for the tail! Pink, Hot Pink, Purple, Blue or all: ");
        String tail = scanner.nextLine();

        // //determines the color of the beak
        if(beak.equals("Pink")){
            bird.setBeak(96, 53, 71);
        }else if(beak.equals("Hot Pink")){
            bird.setBeak(100, 0, 65);
        }else if(beak.equals("Purple")){
            bird.setBeak(62, 0 ,100);
        }else if(beak.equals("Blue")){
            bird.setBeak(57, 77, 95);
        }

        // //determines the color(s) of the tail
        if(tail.equals("Pink")){
            bird.setTail("all", 96, 53, 71);
        }else if(tail.equals("Hot Pink")){
            bird.setTail("all", 100, 0, 65);
        }else if(tail.equals("Purple")){
            bird.setTail("all", 62, 0 , 100);
        }else if(tail.equals("Blue")){
            bird.setTail("all", 0, 56, 100);
        }else if(tail.equals("all")){
            bird.setTail(1, 96, 53, 71);
            bird.setTail(2, 100, 0, 65);
            bird.setTail(3, 62, 0, 100);
            bird.setTail(4, 0, 56, 100);
        }
        bird.pause(2);
        
            
        //  draws the heart 
         bird.setMotors(90, 0);
         bird.pause(1);
         bird.stop();
         bird.pause(1);
         bird.setMove("F", 12, 100);
         bird.pause(1);
         bird.setTurn("R", 90, 50);
         bird.pause(1);
         bird.setMove("F", 12, 100);
         bird.pause(1);
         bird.setMotors(90, 0);
         bird.pause(1);     
            
         // resets to draw again
         bird.setTurn("L", 160, 50);
         bird.setMove("F", 15, 100);
         bird.pause(1);

        
      

        // // draws a heart
        bird.setMotors(90, 0);
        bird.pause(1);
        bird.stop();
        bird.pause(1);
        bird.setMove("F", 12, 100);
        bird.pause(1);
        bird.setTurn("R", 90, 50);
        bird.pause(1);
        bird.setMove("F", 12, 100);
        bird.pause(1);
        bird.setMotors(90, 0);
        bird.pause(1);     
        bird.stop();
       
        }
        

        
    }
