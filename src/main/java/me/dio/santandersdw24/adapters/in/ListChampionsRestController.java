package me.dio.santandersdw24.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.dio.santandersdw24.application.ListChampionsUseCase;
import me.dio.santandersdw24.domain.model.Champions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Campeões", description = "Endpoints do dominio de campeões do league of legends.")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champions> findAllChampions(){
        return useCase.findAll();
    }

}
