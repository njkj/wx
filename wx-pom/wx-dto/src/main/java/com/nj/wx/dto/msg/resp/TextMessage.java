package com.nj.wx.dto.msg.resp;

/**
 * 文本消息
 * 
 * @author zhangxiaorong
 * @date 2017年8月31日
 */
public class TextMessage extends BaseMessage {
	// 回复的消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}