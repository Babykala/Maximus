package com.training.quest4;

public class PlayerMain {

	public static void main(String[] args) {
		IMediaplayer mediaPlayer=new VLCMediaplayer();
		mediaPlayer.playMusic();
		mediaPlayer.downloadMusic();
		
		mediaPlayer=new WindowsMediaPlayer1();
		mediaPlayer.playMusic();
		mediaPlayer.downloadMusic();
	}

}
