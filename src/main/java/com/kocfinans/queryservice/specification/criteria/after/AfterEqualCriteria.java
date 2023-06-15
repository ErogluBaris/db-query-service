package com.kocfinans.queryservice.specification.criteria.after;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

import java.time.LocalDateTime;

public class AfterEqualCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().greaterThanOrEqualTo(
                model.root().get(model.filterInfo().getName())
                , (LocalDateTime) model.filterInfo().getValue());
    }
}
