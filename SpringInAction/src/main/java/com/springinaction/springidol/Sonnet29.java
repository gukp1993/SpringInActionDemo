package com.springinaction.springidol;


/**
 *@ClassName:Sonnet29
 *@Description:����ʫ�貢��������
 *@Author:gukp
 *@Since:2017��3��31������8:39:08
 *@Version:1.1.0
 */
public class Sonnet29 implements Poem{
  private static String[] lines={"������ʹ","��֮�Ը�"};

  public Sonnet29(){}
  
  public void recite() {
    for(int i=0;i<lines.length;i++){
      System.out.println(lines[i]);
    }
    
  }
}
