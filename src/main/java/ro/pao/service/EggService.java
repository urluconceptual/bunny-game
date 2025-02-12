package ro.pao.service;

import ro.pao.model.Egg;
import ro.pao.model.enums.EggColor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EggService {

    Optional<Egg> getEggById(UUID id);

    Optional<Egg> getEggByColor(EggColor color);

    List<Egg> getAllEggs();

    public List<EggRecords> getEggsRecord();

    void addEggs(List<Egg> eggs);

    void addEgg(Egg egg);

    void addEggRecords();

    static record EggRecords(List<Egg> eggs) {
        public EggRecords {
            eggs = eggs == null ? new ArrayList<>() : eggs;
        }
    }
}
