package dogshoppingmall.domain;

import dogshoppingmall.domain.*;
import dogshoppingmall.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReviewCreated extends AbstractEvent {

    private Long id;
    private Integer orderId;
    private Integer productId;
    private String reivewContent;
    private Long score;

    public ReviewCreated(Review aggregate) {
        super(aggregate);
    }

    public ReviewCreated() {
        super();
    }
}
//>>> DDD / Domain Event
