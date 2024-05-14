package me.dio.santandersdw24.application;

import me.dio.santandersdw24.domain.model.Champions;
import me.dio.santandersdw24.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase (ChampionsRepository repository){

    public List<Champions> findAll(){
        return repository.findAll();
    }

}
