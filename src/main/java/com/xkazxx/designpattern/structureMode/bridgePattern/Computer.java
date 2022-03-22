package com.xkazxx.designpattern.structureMode.bridgePattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.bridgePattern.bean
 * date:2022/3/21
 */
@Data
@AllArgsConstructor
public class Computer {
  protected Brand brand;
  protected Category category;

  protected String info(){
    return brand.getInfo() + category.getInfo();
  }
}

class Lenovo implements Brand{
  @Override
  public String getInfo() {
    return "联想";
  }
}
class Huawei implements Brand{
  @Override
  public String getInfo() {
    return "华为";
  }
}

class Laptop implements Category{
  @Override
  public String getInfo() {
    return "笔记本";
  }
}
class Desktop implements Category{
  @Override
  public String getInfo() {
    return "台式";
  }
}

