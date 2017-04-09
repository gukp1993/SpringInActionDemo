/**
 * 
 */
package com.springinaction.springidol;

import java.util.Collection;

/**
 * @ClassName:OneManBand
 * @Description:һ���ֶ�
 * @Author:gukp
 * @Date:2017��4��9������5:10:14
 */
public class OneManBand implements Performer{
	public OneManBand(){}

	public void perform() {
		for(Instrument instrument:instruments){
			instrument.play();
		}
	}
	
	//�ֶ���ȻҪ���ݺܶ������
	private Collection<Instrument> instruments;
	
	public void setInstruments(Collection<Instrument> instruments){
		this.instruments=instruments;
	}

}
