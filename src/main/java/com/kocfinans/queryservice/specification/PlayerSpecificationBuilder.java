package com.kocfinans.queryservice.specification;

import com.kocfinans.queryservice.model.request.FilterInfo;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PlayerSpecificationBuilder {

    private final List<FilterInfo> criteriaList;


}
