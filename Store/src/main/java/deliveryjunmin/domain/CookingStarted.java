package deliveryjunmin.domain;

import deliveryjunmin.domain.*;
import deliveryjunmin.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingStarted extends AbstractEvent {

    private Long id;

    public CookingStarted(Cooking aggregate) {
        super(aggregate);
    }

    public CookingStarted() {
        super();
    }
}
