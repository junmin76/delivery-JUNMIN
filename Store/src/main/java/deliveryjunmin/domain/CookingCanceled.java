package deliveryjunmin.domain;

import deliveryjunmin.domain.*;
import deliveryjunmin.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingCanceled extends AbstractEvent {

    private Long id;

    public CookingCanceled(Cooking aggregate) {
        super(aggregate);
    }

    public CookingCanceled() {
        super();
    }
}
