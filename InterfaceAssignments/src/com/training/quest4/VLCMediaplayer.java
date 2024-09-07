package com.training.quest4;

public class VLCMediaplayer implements IMediaplayer {

	@Override
	public void playMusic() {
		System.out.println("Play MP3 files");
	}

	@Override
	public void downloadMusic() {
		System.out.println("Download MP3 files");
	}

}
