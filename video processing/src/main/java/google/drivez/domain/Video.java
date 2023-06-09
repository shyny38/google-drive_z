package google.drivez.domain;

import google.drivez.VideoProcessingApplication;
import google.drivez.domain.VidoeProcessed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    private String url;

    @PostPersist
    public void onPostPersist() {
        VidoeProcessed vidoeProcessed = new VidoeProcessed(this);
        vidoeProcessed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    public static void processVideo(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        VidoeProcessed vidoeProcessed = new VidoeProcessed(video);
        vidoeProcessed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);

            VidoeProcessed vidoeProcessed = new VidoeProcessed(video);
            vidoeProcessed.publishAfterCommit();

         });
        */

    }
}
