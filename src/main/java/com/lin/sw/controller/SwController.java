package com.lin.sw.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lin")
@Scope("prototype")
@Api(value = "测试接口",description = "测试接口")
public class SwController {
    @ApiOperation(value = "获取商品",notes = "获取商品",response = Respond.class)
    @RequestMapping(value = "getProductInfobySevice",method = RequestMethod.POST)
    public Respond getProductInfobySevice(@RequestBody String id){
        Respond respond = new Respond();
        respond.setCode("200");
        respond.setMessge("aa");
        respond.setVession("1.0");
        return respond;
    }
}
