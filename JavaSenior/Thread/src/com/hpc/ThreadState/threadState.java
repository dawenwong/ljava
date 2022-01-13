package com.hpc.ThreadState;

/**
 * Thread 一个完整的生命周期：
 *          sleep()时间到             <---阻塞 <------     sleep(long time)
 *          join结束               /                 \    join()
 *          获取同步锁            /                    \   等待同步锁
 *       notify()/notifyAll()  /                       \   wait()
 *       resume()            /      获取cpu执行权        \  suspend()（已过时）
 *  新建------------------>就绪<------------------------->运行---------------------------->死亡
 *           调用start()        失去cpu执行权或yield()           执行完run();
 *                                                             调用线程的stop();
 *                                                             出现Error/Exception且没处理
 *
 */
public class threadState {


}
