package com.springinaction.springidol;

/**
 * @ClassName:Instrumentalist
 * @Description:����һ�����������
 * @Author:gukp
 * @Date:2017��4��9������3:57:01
 */
public class Instrumentalist implements Performer{
	public Instrumentalist(){}

	public void perform() {
		System.out.println("playing "+song+" : ");//����ұ��ݸ���
		instrument.play();
	}
	
	private String song;
	
	public void setSong(String song){//setע��song
		this.song=song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong(){
		return song;
	}
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument){//setע��instrument
		this.instrument=instrument;
	}
}
