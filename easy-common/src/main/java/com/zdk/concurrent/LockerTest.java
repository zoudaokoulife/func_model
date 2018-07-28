package com.zdk.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试使用lock
 * Date: 2018/7/28
 * Company: www.dtstack.com
 * @author xuchao
 */

public class LockerTest {

    private Lock lock = new ReentrantLock();

    public void testLock(){
        try{
            lock.lock();
            //do something
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void testTryLock() throws InterruptedException {
        if(lock.tryLock(10, TimeUnit.MILLISECONDS)){
            try{
                //do something
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
    }


}
