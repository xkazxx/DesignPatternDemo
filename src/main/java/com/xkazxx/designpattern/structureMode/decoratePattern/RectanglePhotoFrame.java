package com.xkazxx.designpattern.structureMode.decoratePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.decoratePattern
 * date:2022/3/23
 */
@Data
public class RectanglePhotoFrame implements IPhotoFrame {

  @Override
  public void framedPhoto(Photo photo) {
    System.out.println("我是矩形相框，我装了一张照片：" + photo.getName());
  }

}
