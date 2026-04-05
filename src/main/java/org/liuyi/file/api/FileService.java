package org.liuyi.file.api;

public interface FileService {
    UploadFileResponse uploadFile(UploadFileRequest request);
    DownloadFileResponse downloadFile(DownloadFileRequest request);
}

