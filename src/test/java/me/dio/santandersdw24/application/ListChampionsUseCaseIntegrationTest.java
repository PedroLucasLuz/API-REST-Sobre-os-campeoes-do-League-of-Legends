package me.dio.santandersdw24.application;

import me.dio.santandersdw24.domain.model.Champions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListChampionsUseCaseIntegrationTest {

    @Autowired
    private ListChampionsUseCase listChampionsUseCase;

    @Test
    public void TesteListChampionsUseCase() {
        List<Champions> champions = listChampionsUseCase.findAll();

        Assertions.assertEquals(12, champions.size());
    }
}
