package org.liuyi.file.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class DownloadFileRequest implements Serializable {
    String fileId;
}
