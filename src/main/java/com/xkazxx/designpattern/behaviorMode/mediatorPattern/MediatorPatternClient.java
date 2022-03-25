package com.xkazxx.designpattern.behaviorMode.mediatorPattern;

import java.util.concurrent.CompletableFuture;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.mediatorPattern
 * date:2022/3/25
 */
public class MediatorPatternClient {


  public static void main(String[] args) {

    // 聊天功能：原始版，我和你直连模式（必须同时在线才能收发消息）
    User userA = new User("张三");
    User userB = new User("李四");
    userA.sendMessage("老李，借我十块钱", userB);
    userB.sendMessage("老张啊，我最近手头也不宽裕啊", userA);

    System.out.println("=======================");

    // 中介模式版本，加入中介-ChartRoom，聊天室内所有用户发言都放在公告板announcement上，所有用户都可以在任何时候看到
    final ChartRoom chartRoom = new ChartRoom();
    chartRoom.add(userA);
    chartRoom.add(userB);
    chartRoom.sendMessage("老李，借我十块钱", userB);
    chartRoom.sendMessage("老张啊，我最近手头也不宽裕啊", userA);
  }

}
