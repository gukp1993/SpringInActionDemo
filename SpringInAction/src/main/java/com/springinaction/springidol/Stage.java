/**
 * 
 */
package com.springinaction.springidol;

/**
 * @ClassName:Stage
 * @Description:
 * @Author:gukp
 * @Date:2017年4月9日下午4:31:40
 */
public class Stage {
	private Stage(){}
	
	private static class StageSingletonHolder{
		static Stage instance=new Stage();//延迟加载实例
	}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}
}
