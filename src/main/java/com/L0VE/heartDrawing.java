package com.L0VE;

import com.birdbrain.Finch;

public class heartDrawing {
    public static void main(String[] args){
        Finch bird = new Finch();

        //ADD STUFF
       
        bird.pause(1);
        bird.setBeak(220, 20, 60);
        bird.pause(1);
        bird.setTail("all", 220, 20, 60);
        bird.pause(1);
        bird.setBeak(141, 0, 255);
    
        
        bird.setMotors(50, 0);
        bird.pause(1);
        bird.stop();
        bird.pause(1);
        bird.setMove("F", 6, 100);
        bird.pause(1);
        bird.setTurn("R", 90, 50);
        bird.pause(1);
        bird.setMove("F", 6, 100);
        bird.pause(1);
        bird.setMotors(50, 0);
        bird.pause(1);
        bird.stop();

        bird.disconnect();
    }
}
