package org.liuyi.file.api;

import lombok.Data;

@Data
public class DownloadFileResponse extends BaseResponse {
    // 新增错误类型枚举
    public enum DownloadErrorType {
        FILE_NOT_FOUND,    // 文件不存在
        UNKNOWN_ERROR      // 未知错误（可选）
    }
    byte[] content;
}
