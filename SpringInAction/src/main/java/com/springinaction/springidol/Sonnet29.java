package com.springinaction.springidol;


/**
 *@ClassName:Sonnet29
 *@Description:定义诗歌并表演朗诵
 *@Author:gukp
 *@Since:2017年3月31日下午8:39:08
 *@Version:1.1.0
 */
public class Sonnet29 implements Poem{
  private static String[] lines={"吻我以痛","报之以歌"};

  public Sonnet29(){}
  
  public void recite() {
    for(int i=0;i<lines.length;i++){
      System.out.println(lines[i]);
    }
    
  }
}
