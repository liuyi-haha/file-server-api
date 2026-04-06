package org.liuyi.file.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DownloadFileResponse extends BaseResponse {
    // 新增错误类型枚举
    public enum DownloadErrorType {
        FILE_NOT_FOUND,    // 文件不存在
        UNKNOWN_ERROR      // 未知错误（可选）
    }
    DownloadErrorType errorType;
    byte[] content;
}
