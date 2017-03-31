package com.springinaction.springidol;


/**
 *@ClassName:Juggler
 *@Description:杂技师
 *@Author:gukp
 *@Since:2017年3月31日下午8:09:19
 *@Version:1.1.0
 */
public class Juggler implements Performer{

  //默认可以同时抛3袋豆子
  private int beanBags=3;
  public Juggler(){}
  
  public Juggler(int beanBags){
    this.beanBags=beanBags;
  }
  
  public void perform() {
    System.out.println("juggling "+beanBags+" beanBags");
  }

}
