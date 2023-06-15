package com.kocfinans.queryservice.factory;

import com.kocfinans.queryservice.entity.Player;
import com.kocfinans.queryservice.enums.OperationType;
import com.kocfinans.queryservice.specification.criteria.Criteria;

import java.lang.reflect.InvocationTargetException;

public class PlayerCriteriaFactory extends CriteriaFactory<Player> {

    @Override
    public Criteria createCriteria(OperationType operationType) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> criteriaClass = operationType.getCriteria();

        return (Criteria) criteriaClass.getConstructor().newInstance();
    }
}
