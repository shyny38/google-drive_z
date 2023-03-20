package google.drivez.domain;

import google.drivez.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;
    private String path;
    private String type;
}
