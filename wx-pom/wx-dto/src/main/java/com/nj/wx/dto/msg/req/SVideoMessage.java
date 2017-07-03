package com.nj.wx.dto.msg.req;

/**
 * 小视频消息
 * 
 * @author zhangxiaorong
 */
public class SVideoMessage extends BaseMessage {

	// 媒体ID
	private String MediaId;
	
	// 语音格式
	private String ThumbMediaId;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

}