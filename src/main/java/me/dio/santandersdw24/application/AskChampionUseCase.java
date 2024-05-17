package me.dio.santandersdw24.application;

import me.dio.santandersdw24.domain.exception.championNotFoundException;
import me.dio.santandersdw24.domain.ports.ChampionsRepository;
import me.dio.santandersdw24.domain.model.Champions;

public record AskChampionUseCase(ChampionsRepository repository) {

    public String AskChampion(Long championId,String question){

        Champions champion = repository.findById(championId)
                .orElseThrow(() -> new championNotFoundException(championId));

        String championContext = champion.generateContextByQuestion(question);
        // TODO: Evoluir a lógica de negócio para considerar a integração com IAs generativas.

        return champion.generateContextByQuestion(question);
    }

}
