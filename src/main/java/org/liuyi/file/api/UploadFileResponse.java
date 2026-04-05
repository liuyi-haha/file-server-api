package org.liuyi.file.api;

import lombok.Data;

import javax.lang.model.type.ErrorType;

@Data
public class UploadFileResponse extends BaseResponse{
    public enum UploadErrorType {
        FILE_TOO_LARGE,    // 文件体积太大
        UNKNOWN_ERROR      // 未知错误
    }
    ErrorType errorType;
    String fileId;
}
