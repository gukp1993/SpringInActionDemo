package com.springinaction.springidol;


/**
 *@ClassName:PoeticJuggler
 *@Description:一个会朗诵诗歌的杂技师
 *@Author:gukp
 *@Since:2017年3月31日下午8:30:44
 *@Version:1.1.0
 */
public class PoeticJuggler extends Juggler{
  private Poem poem;
  
  public PoeticJuggler(Poem poem){//注入poem
    super();
    this.poem=poem;
  }
  
  public PoeticJuggler(int beanBags,Poem poem){//注入袋子数量和poem
    super(beanBags);
    this.poem=poem;
  }
  
  public void perform(){
    super.perform();
    System.out.println(" While reciting ...");
    poem.recite();
  }
  
}
