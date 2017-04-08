package com.springinaction.springidol;


/**
 *@ClassName:PoeticJuggler
 *@Description:һ��������ʫ����Ӽ�ʦ
 *@Author:gukp
 *@Since:2017��3��31������8:30:44
 *@Version:1.1.0
 */
public class PoeticJuggler extends Juggler{
  private Poem poem;
  
  public PoeticJuggler(Poem poem){//ע��poem
    super();
    this.poem=poem;
  }
  
  public PoeticJuggler(int beanBags,Poem poem){//ע�����������poem
    super(beanBags);
    this.poem=poem;
  }
  
  public void perform(){
    super.perform();
    System.out.println(" While reciting ...");
    poem.recite();
  }
  
}
