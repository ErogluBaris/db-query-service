package com.kocfinans.queryservice.specification.criteria.less;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

public class LessEqualCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().lessThanOrEqualTo(model.root().get(model.filterInfo().getName())
                , (Integer) model.filterInfo().getValue());
    }
}
