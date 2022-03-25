package com.xkazxx.designpattern.behaviorMode.commandPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.commandPattern
 * date:2022/3/24
 */
public  interface IWorker {
  void execute(ICommand command) throws InterruptedException;
}
