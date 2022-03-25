package com.xkazxx.designpattern.behaviorMode.mediatorPattern;

import lombok.SneakyThrows;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.mediatorPattern
 * date:2022/3/25
 */
public class ChartRoom {

  private final List<User> users;

  private final ArrayBlockingQueue<String> announcement;

  public ChartRoom() {
    users = new LinkedList<>();
    announcement = new ArrayBlockingQueue<String>(1000);
    initProcess();
  }

  private void initProcess() {
    new Thread(() -> {
      while (true) {
        try {
          final String take = announcement.take();
          System.out.println(take);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
  }

  @SneakyThrows
  public void sendMessage(String message, User user) {
    if (!users.contains(user)) {
      return;
    }
    final String announce = "用户[" + user.getName() + "]发送消息: " + message;
    Thread.sleep(500);
    announcement.put(announce);
  }

  public void add(User user) {
    users.add(user);
  }

  public void quite(User user) {
    users.remove(user);
  }

}
