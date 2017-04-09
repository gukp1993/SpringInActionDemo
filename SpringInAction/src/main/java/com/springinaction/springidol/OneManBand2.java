/**
 * 
 */
package com.springinaction.springidol;

import java.util.Map;

/**
 * @ClassName:OneManBand
 * @Description:一人乐队
 * @Author:gukp
 * @Date:2017年4月9日下午5:10:14
 */
public class OneManBand2 implements Performer{
	public OneManBand2(){}

	public void perform() {
		for(String key:instruments.keySet()){
			System.out.println(key+" : ");
			Instrument instrument=instruments.get(key);
			instrument.play();
		}
	}
	
	//乐队自然要表演很多的乐器
	private Map<String,Instrument> instruments;
	
	public void setInstruments(Map<String,Instrument> instruments){
		this.instruments=instruments;
	}

}
