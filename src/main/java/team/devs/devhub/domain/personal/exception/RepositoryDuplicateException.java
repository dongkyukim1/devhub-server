package team.devs.devhub.domain.personal.exception;

import team.devs.devhub.global.error.exception.BusinessException;
import team.devs.devhub.global.error.exception.ErrorCode;

public class RepositoryDuplicateException extends BusinessException {
    public RepositoryDuplicateException(ErrorCode errorCode) {
        super(errorCode);
    }
}
