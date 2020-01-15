package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        // 准备测试数据
        List<String> data = new ArrayList<String>();
        for (int i = 0; i <200000; i++) {
            data.add("item" + i);
        }
        int threadNum = 3;//设置需要开启的线程数
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);//CountDownLatch实现使用一个计数器，而参数cout就是初始化计数器的值，该值一经初始化就不能再被修改。
        ThreadUtil.handleList(data, countDownLatch, threadNum);
        countDownLatch.await();// 调用await方法阻塞当前线程，等待子线程完成后在继续执行
        System.out.println("=============主线程执行完毕!================");
    }
}
