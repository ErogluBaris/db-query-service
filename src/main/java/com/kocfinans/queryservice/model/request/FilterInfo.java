package com.kocfinans.queryservice.model.request;

import com.kocfinans.queryservice.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class FilterInfo {

    private String name;
    private Object value;
    private OperationType operation;
}
