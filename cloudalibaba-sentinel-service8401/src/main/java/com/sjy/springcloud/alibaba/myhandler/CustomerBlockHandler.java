package com.sjy.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import entities.CommonResult;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/5
 * Time: 19:21
 * Description: No Description
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }


    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
