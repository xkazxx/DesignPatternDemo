package com.xkazxx.designpattern.structureMode.decoratePattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.decoratePattern
 * date:2022/3/23
 */
public class DecoratePatternClient {

  public static void main(String[] args) {
    final Photo photo = new Photo("帅照");
    final RectanglePhotoFrame rectanglePhotoFrame = new RectanglePhotoFrame();
    rectanglePhotoFrame.framedPhoto(photo);
    System.out.println("=================================");
    final RedRectanglePhotoFrame redRectanglePhotoFrame = new RedRectanglePhotoFrame(rectanglePhotoFrame);
    redRectanglePhotoFrame.framedPhoto(photo);
  }
}
