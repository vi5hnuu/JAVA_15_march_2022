package com.company;

public class tryy {
}


class MyRunnable implements Runnable {
    public void run() {
        System.out.println("In run() method ");
        throw new RuntimeException("some problem");
    }

    public static void main(String[] args)throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        Thread.sleep(500);
        System.out.println("End of main() method");
    }
}

