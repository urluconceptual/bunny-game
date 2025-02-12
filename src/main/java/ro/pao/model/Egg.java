package ro.pao.model;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import ro.pao.model.abstracts.AbstractEntity;
import ro.pao.model.enums.EggColor;
import ro.pao.model.enums.EggType;

@SuperBuilder
@Getter
@ToString
public class Egg extends AbstractEntity {
    private EggColor color;
    private EggType type;
}
