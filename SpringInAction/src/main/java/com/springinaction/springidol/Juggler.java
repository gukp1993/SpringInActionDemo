package com.springinaction.springidol;


/**
 *@ClassName:Juggler
 *@Description:�Ӽ�ʦ
 *@Author:gukp
 *@Since:2017��3��31������8:09:19
 *@Version:1.1.0
 */
public class Juggler implements Performer{

  //Ĭ�Ͽ���ͬʱ��3������
  private int beanBags=3;
  public Juggler(){}
  
  public Juggler(int beanBags){
    this.beanBags=beanBags;
  }
  
  public void perform() {
    System.out.println("juggling "+beanBags+" beanBags");
  }

}
