package com.nj.wx.dto.msg.resp;

/**
 * 视频消息 
 * 
 * @author zhangxiaorong
 * @date 2017年8月31日
 */
public class VideoMessage extends BaseMessage {
    // 视频
    private Video Video;

    public Video getVideo() {
        return Video;
    }

    public void setVideo(Video video) {
        Video = video;
    }
}