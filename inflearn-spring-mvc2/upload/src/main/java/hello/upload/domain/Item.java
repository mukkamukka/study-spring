package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private UpLoadFile attachFile;
    private List<UpLoadFile> imageFiles;
}
