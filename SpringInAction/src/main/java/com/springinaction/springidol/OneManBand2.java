/**
 * 
 */
package com.springinaction.springidol;

import java.util.Map;

/**
 * @ClassName:OneManBand
 * @Description:һ���ֶ�
 * @Author:gukp
 * @Date:2017��4��9������5:10:14
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
	
	//�ֶ���ȻҪ���ݺܶ������
	private Map<String,Instrument> instruments;
	
	public void setInstruments(Map<String,Instrument> instruments){
		this.instruments=instruments;
	}

}
