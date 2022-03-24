package com.xkazxx.designpattern.structureMode.decoratePattern;

import lombok.Data;

/**
 * 相框的装饰类，可以自定义相框的颜色
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.decoratePattern
 * date:2022/3/23
 */
@Data
public abstract class PhotoFrameDecorator implements IPhotoFrame {
  protected String color;
  protected IPhotoFrame photoFrame;

  public PhotoFrameDecorator(String color, IPhotoFrame photoFrame) {
    this.color = color;
    this.photoFrame = photoFrame;
  }

  public void framedPhoto(Photo photo) {
    setPhotoFrameColor();
    photoFrame.framedPhoto(photo);
  }

  private void setPhotoFrameColor() {
    System.out.println("我有颜色啦，我是" + color + "相框");
  }

}
