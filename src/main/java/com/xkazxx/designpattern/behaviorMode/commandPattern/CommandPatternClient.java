package com.xkazxx.designpattern.behaviorMode.commandPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.commandPattern
 * date:2022/3/24
 */
public class CommandPatternClient {

  public static void main(String[] args) throws Exception {
    final CommandStation commandStation = new CommandStation();
    commandStation.addCommand(() -> System.out.println("买瓶汽水"));
    commandStation.addCommand(() -> {
      System.out.println("整个番茄炒蛋");
      Thread.sleep(1000);
    });
    commandStation.addCommand(() -> {System.out.println("剥个橘子");
    Thread.sleep(2000);});

 commandStation.addCommand(() -> System.out.println("买瓶汽水"));
    commandStation.addCommand(() -> {
      System.out.println("整个番茄炒蛋");
      Thread.sleep(1000);
    });
    commandStation.addCommand(() -> {System.out.println("剥个橘子");
    Thread.sleep(2000);});

 commandStation.addCommand(() -> System.out.println("买瓶汽水"));
    commandStation.addCommand(() -> {
      System.out.println("整个番茄炒蛋");
      Thread.sleep(1000);
    });
    commandStation.addCommand(() -> {System.out.println("剥个橘子");
    Thread.sleep(2000);});

 commandStation.addCommand(() -> System.out.println("买瓶汽水"));
    commandStation.addCommand(() -> {
      System.out.println("整个番茄炒蛋");
      Thread.sleep(1000);
    });
    commandStation.addCommand(() -> {System.out.println("剥个橘子");
    Thread.sleep(2000);});

 commandStation.addCommand(() -> System.out.println("买瓶汽水"));
    commandStation.addCommand(() -> {
      System.out.println("整个番茄炒蛋");
      Thread.sleep(1000);
    });
    commandStation.addCommand(() -> {System.out.println("剥个橘子");
    Thread.sleep(2000);});

 commandStation.addCommand(() -> System.out.println("买瓶汽水"));
    commandStation.addCommand(() -> {
      System.out.println("整个番茄炒蛋");
      Thread.sleep(1000);
    });
    commandStation.addCommand(() -> {System.out.println("剥个橘子");
    Thread.sleep(2000);});

    commandStation.addCommand(() -> System.out.println("买瓶汽水"));
    commandStation.addCommand(() -> {
      System.out.println("整个番茄炒蛋");
      Thread.sleep(1000);
    });
    commandStation.addCommand(() -> {
      System.out.println("剥个橘子");
      Thread.sleep(2000);
    });



  }
}
