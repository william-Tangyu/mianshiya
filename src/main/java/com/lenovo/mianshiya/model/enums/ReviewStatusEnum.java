package com.lenovo.mianshiya.model.enums;

import cn.hutool.core.util.ObjectUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ReviewStatusEnum {

    REVIEWING("待审核",0),
    PASS("审核通过",1),
    REJECT("审核失败",2);

    private final String text;

    private final int value;

    ReviewStatusEnum(String text,int value){
        this.text = text;
        this.value = value;
    }

    /**
     *  通过value获取枚举值
     *
     * @param value
     * @return
     */
    public static ReviewStatusEnum getEnumByValue(Integer value){
        if(ObjectUtil.isEmpty(value)){
            return null;
        }
        for (ReviewStatusEnum anEnum : ReviewStatusEnum.values()){
            if (anEnum.value == value){
                return anEnum;
            }
        }
        return null;
    }


    public static List<Integer> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public int getValue(){
        return value;
    }

    public String getText(){
        return text;
    }
}
