package com.nj.wx.dto.msg.resp;

/**
 * 图片消息
 * 
 * @author zhangxiaorong
 * @date 2017年8月31日
 */
public class ImageMessage extends BaseMessage {
    
    private Image Image;

    public Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }
}