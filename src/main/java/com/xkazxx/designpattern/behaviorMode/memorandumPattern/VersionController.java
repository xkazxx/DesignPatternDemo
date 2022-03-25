package com.xkazxx.designpattern.behaviorMode.memorandumPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.memorandumPattern
 * date:2022/3/25
 */
public class VersionController {
  private final List<Version> versionList;
  private final Version target;

  public VersionController(Version version) {
    this.versionList = new LinkedList<>();
    this.target = version;
  }

  public void save() {
    versionList.add(new Version(target.getMessage()));
  }

  public void reset() {
    if (versionList.isEmpty()) {
      System.out.println("当前没有副本可用于回退操作！");
      return;
    }
    Version remove = versionList.remove(versionList.size() - 1);
    target.setMessage(remove.getMessage());
  }

}
