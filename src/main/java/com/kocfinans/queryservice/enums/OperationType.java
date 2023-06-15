package com.kocfinans.queryservice.enums;

import com.kocfinans.queryservice.specification.criteria.after.AfterCriteria;
import com.kocfinans.queryservice.specification.criteria.before.BeforeCriteria;
import com.kocfinans.queryservice.specification.criteria.beginswith.BeginsWithCriteria;
import com.kocfinans.queryservice.specification.criteria.beginswith.NotBeginsWithCriteria;
import com.kocfinans.queryservice.specification.criteria.contains.ContainsCriteria;
import com.kocfinans.queryservice.specification.criteria.contains.NotContainsCriteria;
import com.kocfinans.queryservice.specification.criteria.endswith.EndsWithCriteria;
import com.kocfinans.queryservice.specification.criteria.endswith.NotEndsWithCriteria;
import com.kocfinans.queryservice.specification.criteria.equals.EqualsCriteria;
import com.kocfinans.queryservice.specification.criteria.equals.NotEqualsCriteria;
import com.kocfinans.queryservice.specification.criteria.greater.GreaterCriteria;
import com.kocfinans.queryservice.specification.criteria.greater.GreaterEqualsCriteria;
import com.kocfinans.queryservice.specification.criteria.less.LessCriteria;
import com.kocfinans.queryservice.specification.criteria.less.LessEqualCriteria;
import com.kocfinans.queryservice.specification.criteria.nullable.NotNullCriteria;
import com.kocfinans.queryservice.specification.criteria.nullable.NullCriteria;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OperationType {

    CONTAINS(ContainsCriteria.class),
    NOT_CONTAIN(NotContainsCriteria.class),
    EQUALS(EqualsCriteria.class),
    NOT_EQUAL(NotEqualsCriteria.class),
    BEGINS_WITH(BeginsWithCriteria.class),
    NOT_BEGIN_WITH(NotBeginsWithCriteria.class),
    ENDS_WITH(EndsWithCriteria.class),
    NOT_ENDS_WITH(NotEndsWithCriteria.class),
    NULL(NullCriteria.class),
    NOT_NULL(NotNullCriteria.class),
    GREATER_THAN(GreaterCriteria.class),
    GREATER_THAN_EQUAL(GreaterEqualsCriteria.class),
    LESS_THAN(LessCriteria.class),
    LESS_THAN_EQUAL(LessEqualCriteria.class),
    AFTER(AfterCriteria.class),
    BEFORE(BeforeCriteria.class);

    private final Class<?> criteria;
}
