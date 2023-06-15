package com.kocfinans.queryservice.specification;

import com.kocfinans.queryservice.entity.Player;
import com.kocfinans.queryservice.exception.CriteriaBuildException;
import com.kocfinans.queryservice.factory.PlayerCriteriaFactory;
import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.model.request.FilterInfo;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.data.jpa.domain.Specification;

@AllArgsConstructor
public class PlayerSpecification implements Specification<Player> {

    private final FilterInfo filterInfo;

    @Override
    public Predicate toPredicate(@NonNull Root<Player> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder criteriaBuilder) {

        try {
            Criteria criteria = new PlayerCriteriaFactory().createCriteria(filterInfo.getOperation());
            return criteria.build(new CriteriaModel(criteriaBuilder, root, filterInfo));
        } catch ( Exception e ) {
            throw new CriteriaBuildException(filterInfo);
        }
    }
}
