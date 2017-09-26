package com.nj.wx.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

public class BaseController {
    
    /**
     * 封装ajax输出
     * 
     * @param response
     * @param outputStr 输出字节
     * @throws IOException
     */
    protected void ajaxOutput(HttpServletResponse response, String outputStr) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(outputStr);
        response.getWriter().flush();
    }

    /**
     * 封装spring redirect重定向到某个页面
     * 
     * @param url
     * @return
     */
    protected String redirectTo(String url) {
        if (StringUtils.isEmpty(url) || url.startsWith("redirect:")) {
            return url;
        }
        // 利用redirect打头的url spring转发器会默认为重定向
        return "redirect:" + url;
    }

    /**
     * 封装spring forward到某个页面
     * 
     * @param url
     * @return
     */
    protected String forwardTo(String url) {
        if (StringUtils.isEmpty(url) || url.startsWith("forward:")) {
            return url;
        }
        return "forward:" + url;
    }

    /**
     * 获取返回链接
     * 
     * @param backUrl
     * @param request
     * @return
     */
    protected String getBackUrl(String backUrl, HttpServletRequest request) {
        if (StringUtils.isNotEmpty(backUrl)) {
            return backUrl;
        }
        backUrl = request.getHeader("referer");
        return backUrl;
    }

}
