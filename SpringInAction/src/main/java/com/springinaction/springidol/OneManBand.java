/**
 * 
 */
package com.springinaction.springidol;

import java.util.Collection;

/**
 * @ClassName:OneManBand
 * @Description:一人乐队
 * @Author:gukp
 * @Date:2017年4月9日下午5:10:14
 */
public class OneManBand implements Performer{
	public OneManBand(){}

	public void perform() {
		for(Instrument instrument:instruments){
			instrument.play();
		}
	}
	
	//乐队自然要表演很多的乐器
	private Collection<Instrument> instruments;
	
	public void setInstruments(Collection<Instrument> instruments){
		this.instruments=instruments;
	}

}
