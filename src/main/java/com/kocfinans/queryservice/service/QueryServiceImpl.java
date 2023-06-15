package com.kocfinans.queryservice.service;

import com.kocfinans.queryservice.entity.Player;
import com.kocfinans.queryservice.model.request.FilterInfo;
import com.kocfinans.queryservice.model.request.QueryRequest;
import com.kocfinans.queryservice.repository.PlayerRepository;
import com.kocfinans.queryservice.specification.PlayerSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class QueryServiceImpl implements QueryService {

    private final PlayerRepository playerRepository;

    @Override
    public List<Player> findPlayers(QueryRequest playerQueryRequest) {

        List<FilterInfo> filterInfos =  playerQueryRequest.getFilterList();
        if ( filterInfos.isEmpty() )
            return new ArrayList<>();

        Specification<Player> result = new PlayerSpecification(filterInfos.get(0));
        for ( FilterInfo filterInfo : filterInfos ) {
            PlayerSpecification playerSpecification = new PlayerSpecification(filterInfo);
            result.and(playerSpecification);
        }

        return playerRepository.findAll(result);
    }
}
