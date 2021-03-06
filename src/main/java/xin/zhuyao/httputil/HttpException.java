package xin.zhuyao.httputil;

/**
 * Created by zy on 2018-09-25.
 *
 * @author zy
 * @version 0.1
 */
public class HttpException extends RuntimeException {

    public static final HttpException INSTANCE = new HttpException("系统内部错误");

    public HttpException() {
        super();
    }

    public HttpException(String message) {
        super(message);
    }

    public HttpException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpException(Throwable cause) {
        super(cause);
    }

    protected HttpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
