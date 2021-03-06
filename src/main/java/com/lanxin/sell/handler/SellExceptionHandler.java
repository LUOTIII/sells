package com.lanxin.sell.handler;

import com.lanxin.sell.config.ProjectUrlConfig;
import com.lanxin.sell.excrption.SellException;
import com.lanxin.sell.excrption.SellerAuthorizeException;
import com.lanxin.sell.utils.ResultVoUtil;
import com.lanxin.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    //拦截登录异常
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
        .concat(projectUrlConfig.getWechatOpenAuthorize())
        .concat("/sell/wechat/qrAuthorize")
        .concat("?returnUrl=")
        .concat(projectUrlConfig.getSell())
        .concat("/sell/seller/login"));
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVo handlerSellerException(SellException e){
        return ResultVoUtil.error(e.getCode(),e.getMessage());
    }
}
