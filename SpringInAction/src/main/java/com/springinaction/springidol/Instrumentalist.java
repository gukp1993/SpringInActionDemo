package com.springinaction.springidol;

/**
 * @ClassName:Instrumentalist
 * @Description:定义一个音乐演奏家
 * @Author:gukp
 * @Date:2017年4月9日下午3:57:01
 */
public class Instrumentalist implements Performer{
	public Instrumentalist(){}

	public void perform() {
		System.out.println("playing "+song+" : ");//演奏家表演歌曲
		instrument.play();
	}
	
	private String song;
	
	public void setSong(String song){//set注入song
		this.song=song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong(){
		return song;
	}
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument){//set注入instrument
		this.instrument=instrument;
	}
}
