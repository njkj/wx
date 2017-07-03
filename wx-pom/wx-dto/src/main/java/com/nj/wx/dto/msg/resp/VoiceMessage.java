package com.nj.wx.dto.msg.resp;

/**
 * 语音消息
 * 
 * @author zhangxiaorong
 * @date 2017年8月31日
 */
public class VoiceMessage extends BaseMessage {
    // 语音
    private Voice Voice;

    public Voice getVoice() {
        return Voice;
    }

    public void setVoice(Voice voice) {
        Voice = voice;
    }
}