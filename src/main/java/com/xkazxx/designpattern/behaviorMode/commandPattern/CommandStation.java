package com.xkazxx.designpattern.behaviorMode.commandPattern;

import lombok.Data;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.commandPattern
 * date:2022/3/24
 */
public final class CommandStation {
  private final ArrayBlockingQueue<IWorker> workerQueue;
  private final ArrayBlockingQueue<ICommand> commandQueue;

  public CommandStation() throws InterruptedException {
    workerQueue = new ArrayBlockingQueue<>(10, Boolean.TRUE);
    for (int i = 0; i < 10; i++) {
      workerQueue.offer(new Worker());
    }
    commandQueue = new ArrayBlockingQueue<>(100, Boolean.TRUE);
    initStartWork();
  }

  private void initStartWork() {
    new Thread(() -> {
      while (true) {
        try {
          IWorker worker = workerQueue.take();
          ICommand command = commandQueue.take();
          worker.execute(command);
          workerQueue.put(worker);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
  }

  public void addCommand(ICommand command) throws InterruptedException {
    commandQueue.put(command);
  }


  public boolean cancel(ICommand command) {
    return commandQueue.remove(command);
  }


}
