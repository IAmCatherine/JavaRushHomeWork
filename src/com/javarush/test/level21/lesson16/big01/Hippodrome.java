package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by User on 15.02.2016.
 */
public class Hippodrome
{    public static ArrayList<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;
    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse murka = new Horse("Мурка",3,0);
        Horse umka = new Horse("Умка",3,0);
        Horse afanasiy = new Horse("Афанасий",3,0);
        game.horses.add(murka);
        game.horses.add(umka);
        game.horses.add(afanasiy);
        game.run();
        game.printWinner();





    }
    public ArrayList<Horse> getHorses(){
        return  horses;
    }
    public void run() throws InterruptedException
    {
        for (int i = 0 ; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }

    }
    public void move(){
        for (int i = 0; i < game.horses.size(); i++){
            game.horses.get(i).move();
        }

    }
    public void print(){
        for (int i = 0; i < game.horses.size(); i++){
            game.horses.get(i).print();
        }
        System.out.println("");
        System.out.println("");

    }
     public Horse getWinner(){
         Horse winner = game.horses.get(0);
         for (int i =1; i < game.horses.size(); i++){
             if (game.horses.get(i).getDistance() > winner.getDistance()){
                 winner = game.horses.get(i);
             }

         }

         return winner;
     }
    public void printWinner(){
        System.out.println("Winner is "+ getWinner().getName()+"!");

    }
}
