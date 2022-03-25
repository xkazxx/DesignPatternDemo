package com.xkazxx.designpattern.behaviorMode.memorandumPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.memorandumPattern
 * date:2022/3/25
 */
public class MemorandumPatternClient {

  public static void main(String[] args) {
    Version version = new Version("State #1");
    VersionController controller = new VersionController(version);

    version.setMessage("State #2");
    controller.save();
    version.setMessage("State #3");
    version.setMessage("State #4");
    controller.save();
    version.setMessage("State #5");
    version.setMessage("State #6");
    controller.save();
    version.setMessage("State #7");
    version.setMessage("State #8");
    version.setMessage("State #9");
    controller.save();

    controller.reset();
    System.out.println(version.getMessage());

    controller.reset();
    System.out.println(version.getMessage());

    controller.reset();
    System.out.println(version.getMessage());
    version.setMessage("State #10");
    controller.save();
    version.setMessage("State #11");
    controller.reset();
    System.out.println(version.getMessage());
    controller.reset();
    System.out.println(version.getMessage());
    controller.reset();
    System.out.println(version.getMessage());
  }
}
