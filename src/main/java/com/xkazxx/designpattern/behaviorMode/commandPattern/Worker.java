package com.xkazxx.designpattern.behaviorMode.commandPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.commandPattern
 * date:2022/3/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker implements IWorker {
  private ICommand command;

  @Override
  public void execute(ICommand command) throws InterruptedException {
    command.execute();
    System.out.println("工人完成了一个命令");
  }
}
