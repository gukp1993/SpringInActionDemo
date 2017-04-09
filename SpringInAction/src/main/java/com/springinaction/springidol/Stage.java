/**
 * 
 */
package com.springinaction.springidol;

/**
 * @ClassName:Stage
 * @Description:
 * @Author:gukp
 * @Date:2017��4��9������4:31:40
 */
public class Stage {
	private Stage(){}
	
	private static class StageSingletonHolder{
		static Stage instance=new Stage();//�ӳټ���ʵ��
	}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}
}
