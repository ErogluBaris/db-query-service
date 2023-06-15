package com.kocfinans.queryservice.factory;

import com.kocfinans.queryservice.enums.OperationType;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.InvocationTargetException;

@Getter
@RequiredArgsConstructor
public abstract class CriteriaFactory<T> {

    public abstract Criteria createCriteria(OperationType operationType) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
