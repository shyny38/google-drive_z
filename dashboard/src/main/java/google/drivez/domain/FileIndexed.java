package google.drivez.domain;

import google.drivez.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String keywords;
}
