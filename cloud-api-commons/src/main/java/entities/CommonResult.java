package entities;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/25
 * Time: 14:40
 * Description: No Description
 */
@Data

public class CommonResult<T> {

    //404 NOT_FOUND
    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
