package com.company;

import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(3);
        executorService.execute(new PrintChar('a',100));
        executorService.execute(new PrintChar('b',100));
        executorService.execute(new PrintNum(100));
        executorService.shutdown();
    }
}
