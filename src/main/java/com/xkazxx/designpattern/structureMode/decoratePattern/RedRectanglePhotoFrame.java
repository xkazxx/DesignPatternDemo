package com.xkazxx.designpattern.structureMode.decoratePattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.decoratePattern
 * date:2022/3/23
 */

public class RedRectanglePhotoFrame extends PhotoFrameDecorator {

  public RedRectanglePhotoFrame(IPhotoFrame photoFrame) {
    super("红色", photoFrame);
  }

}
