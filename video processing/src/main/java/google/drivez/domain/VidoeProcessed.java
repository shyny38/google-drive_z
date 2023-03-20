package google.drivez.domain;

import google.drivez.domain.*;
import google.drivez.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VidoeProcessed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String url;

    public VidoeProcessed(Video aggregate) {
        super(aggregate);
    }

    public VidoeProcessed() {
        super();
    }
}
