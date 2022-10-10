/**
 * Homework 4: Virtual pet
 * 
 * @author Charlie Le
 * @version Ocober 4 2019
 */

 // This is a game that allows you to nurture your own virtual pet for as long as possible.

import java.util.Scanner;

public class Homework4 {
    static Scanner input = new Scanner(System.in);
    static String name;
    static int age;
    static int hunger;
    static int hungerRate;
    static int boredom;
    static int boredomRate;
    static int  dirtiness;
    static int dirtinessRate;
    static boolean died;
    final static int LOW_STAT_THRESHOLD = 4;
    final static int MED_STAT_THRESHOLD = 8;
    final static int HIGH_STAT_THRESHOLD = 12;
    final static int DEATH_STAT_THRESHOLD = 16;

    public static void main(String [] args){
        make();
        died = false;

        while(died == false) {
            age();
            choose();
            status();
        }
        playerRecord();


    }
        
    public static void make() {
        age = 0;
        System.out.println("What name would you like to give your pet?");
        name = input.nextLine();
        hunger = LOW_STAT_THRESHOLD;
        boredom = LOW_STAT_THRESHOLD;
        dirtiness = LOW_STAT_THRESHOLD;
        hungerRate = 1;
        boredomRate = 1;
        dirtinessRate = 1;
    }
    public static void age(){
        age++;

        System.out.println(name + " is " + age + " days old.");
        
        if(age % 3 == 0){
            hungerRate++;
            dirtinessRate++;
            boredomRate++;
            System.out.println("Your pet is getting hungry more often.");
            System.out.println("Your pet is getting dirty more often.");
            System.out.println("Your pet is getting bored more often.");
        }
        

    }
    //System.out.println("If you want to feed " + name + ", enter feed./n" + "If you want to play with " + name + ", enter play. /n" + "If you want to play with " + name + ", enter play/n");
    //System.out.println("If you want to feed " + name + ", enter feedd./n");
    public static void choose(){
       
        System.out.println("It's a new day! What would you like to do with " + name + "?");
        System.out.println("If you want to feed " + name + ", enter feed." + " If you want to play with " + name + ", enter play." + " If you want to clean " + name + ", enter clean");
        String choice = input.nextLine();

        if (choice.equals("feed")){
            feed();
        }
        else if (choice.equals("play")){
            play();
        }
        else if (choice.equals("clean")){
            clean();

        }
        else{
            System.out.println("Wrong input. Try again.");
            choose();

        }
    }
    public static void feed(){
        hunger -= hungerRate;
        dirtiness += dirtinessRate;

        System.out.println("You gave " + name + " food, but now he got dirtier.");
    }
    public static void play(){
        boredom-= boredomRate;
        hunger += hungerRate;

    }
    public static void clean(){
        dirtiness -= dirtinessRate;
        boredom += boredomRate;

    }
    public static void status() {
        String hungerDescription = "Hunger Status:";
        String boredomDescription = "Boredom Level:";
        String dirtyDescription = "Dirtiness Status:";
        System.out.println(hungerDescription + getHunger(hunger));
        System.out.println(boredomDescription + getBoredom(boredom));
        System.out.println(dirtyDescription + getCleanliness(dirtiness));
        died = dies();

    }

    public static String getHunger (int food){

        if(food<= LOW_STAT_THRESHOLD) {
            return name + " is not hungry.";
        }
        if (food<= MED_STAT_THRESHOLD){
            return name + " is a little hungry.";

        }
        if (food <= HIGH_STAT_THRESHOLD){
            return name + " is starving.";

        }
        else{
            return name + " is starving... like to death... like seriously.";
        }
    }
    public static String getBoredom( int bored){
        
        if(bored<= LOW_STAT_THRESHOLD) {
            return name + " is not bored.";
        }
        if (bored<= MED_STAT_THRESHOLD){
            return name + " is a little bored.";

        }
        if (bored <= HIGH_STAT_THRESHOLD){
            return name + " is really bored.";

        }
        else{
            return name + " is bored... like to death... like seriously.";
        }
    }
    public static String getCleanliness( int dirty){
        
        if(dirty<= LOW_STAT_THRESHOLD) {
            return name + " is not dirty.";
        }
        if (dirty<= MED_STAT_THRESHOLD){
            return name + " is a little dirty.";

        }
        if (dirty <= HIGH_STAT_THRESHOLD){
            return name + " is really dirty.";

        }
        else{
            return name + " is dirty... like to death... like seriously.";
        }
    }
    public static boolean dies(){
        if(hunger >= DEATH_STAT_THRESHOLD){
            System.out.println(name + " had nothing in his belly for a long time, so he died of hunger.");
            return true;
        }
        if(boredom >= DEATH_STAT_THRESHOLD){
            System.out.println(name + " did not have fun with you, so he died of boredom.");
            return true;
        }
        if(dirtiness >= DEATH_STAT_THRESHOLD){
            System.out.println(name + " looked in the mirror and saw how dirty he was and died, so he died of dirtiness.");
            return true;
        }
        return false;
    }

    public static void playerRecord(){
        if ( age <= 7 ){
            System.out.println( "Your pet lived for a week. You really suck at taking care of pet.");
        }
        else if ( age < 14 ){
            System.out.println( "Your pet lived for only more than one week. You suck at taking care of your pet.");
        }
        else if ( age < 30 ){
            System.out.println( "Your pet lived for less than a month. You kind of suck at taking care of your pet.");
        }
        else if ( age >= 30 ){
            System.out.println( "Your pet lived more than a month. Good.");
        }

    }




}