package com.moiim.util;

public interface JsonSerializable {
    //
    default String toJsonString() {
        //
        return JsonUtil.toJson(this);
    }
}
