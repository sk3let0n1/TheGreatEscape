package com.company;

public class TheGreatEscape {

    public static void main(String[] args) {
        System.out.println("       " + (char)92 + (char)95 + " " + (char)95 + (char)47 + " " + "       " + (char)92 + (char)95 + " " + (char)95 + (char)47);
        pause();
        System.out.println("       " + (char)40 + (char)34 + " " + (char)34 + (char)41 + " " + "       " + (char)40 + (char)34 + " " + (char)34 + (char)41);
        pause();
        System.out.println("  " + (char)46 + (char)45 + (char)45 + (char)45 + (char)45 + (char)45 + (char)92 + " " + (char)47 + "          " + (char)92 + " " + (char)47 );
    }
        public static void pause() {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
    }
}
