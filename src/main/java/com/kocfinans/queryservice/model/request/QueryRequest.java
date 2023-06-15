package com.kocfinans.queryservice.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class QueryRequest {

    private List<FilterInfo> filterList;
    private List<String> requestedFields;
}
