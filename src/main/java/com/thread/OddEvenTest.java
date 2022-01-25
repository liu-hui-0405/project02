package com.thread;

/**
 * @ClassName: OddEvenTest
 * @Description: 起两个线程交替打印0~100的奇偶数
 * @Author: LH
 * @CreateDate: 2021/11/22
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2021/11/22
 * @UpdateRemark: UpdateRemark
 */
public class OddEvenTest {
    private static int count;

    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        // process();
        process2();
    }



    /**
     * 1、避开了线程交替获取锁的需求,效率较低，如果同一个线程一直抢到锁，而另一个线程一直没有拿到，就会导致线程做很多无谓的空转。
     */
    static void process() {
        Thread even = new Thread(() -> {
            while (count < 100) {
                synchronized (lock) {
                    if ((count & 1) == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                    }
                }
            }
        }, "偶数");

        Thread odd = new Thread(() -> {
            while (count < 100) {
                synchronized (lock) {
                    if ((count & 1) == 1) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                    }
                }
            }
        }, "奇数");
        even.start();
        odd.start();
    }

    /**
     * 交替获取锁方案
     * @throws InterruptedException
     */
    static void process2() throws InterruptedException {
        // Thread even = new Thread(() -> {
        //     while (count <= 100) {
        //         synchronized (lock) {
        //             System.out.println(Thread.currentThread().getName() + ": " + count++);
        //             lock.notifyAll();
        //             try {
        //                 // 如果还没有结束，则让出当前的锁并休眠
        //                 if (count <= 100) {
        //                     lock.wait();
        //                 }
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // }, "偶数");
        // Thread odd = new Thread(() -> {
        //     while (count <= 100) {
        //         synchronized (lock) {
        //             System.out.println(Thread.currentThread().getName() + ": " + count++);
        //             lock.notifyAll();
        //             try {
        //                 // 如果还没有结束，则让出当前的锁并休眠
        //                 if (count <= 100) {
        //                     lock.wait();
        //                 }
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // }, "奇数");
        // even.start();
        // // 确保偶数线程线先获取到锁
        // Thread.sleep(1);
        // odd.start();

        new Thread(new TurningRunner(), "偶数").start();
        // 确保偶数线程线先获取到锁
        Thread.sleep(1);
        new Thread(new TurningRunner(), "奇数").start();
    }
    static class TurningRunner implements Runnable {

        @Override
        public void run() {
            while (count <= 100) {
                // 获取锁
                synchronized (lock) {
                    // 拿到锁就打印
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    // 唤醒其他线程
                    lock.notifyAll();
                    try {
                        if (count <= 100) {
                            // 如果任务还没有结束，则让出当前的锁并休眠
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
