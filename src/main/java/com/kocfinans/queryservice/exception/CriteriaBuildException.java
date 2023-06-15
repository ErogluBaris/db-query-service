package com.kocfinans.queryservice.exception;

import com.kocfinans.queryservice.model.request.FilterInfo;

public class CriteriaBuildException extends RuntimeException {

    public CriteriaBuildException(FilterInfo filterInfo) {
        super(String.format("Criteria cannot build for filterInfo: %s", filterInfo));
    }
}
