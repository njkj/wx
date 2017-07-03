package com.nj.wx.dto.msg.resp;

/**
 * 音乐消息
 * 
 * @author zhangxiaorong
 * @date 2017年8月31日
 */
public class MusicMessage extends BaseMessage {
    // 音乐
    private Music Music;

    public Music getMusic() {
        return Music;
    }

    public void setMusic(Music music) {
        Music = music;
    }
}