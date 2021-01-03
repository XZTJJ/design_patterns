package com.zhouhc.eachPattern.responsibilityChain.desc.code;

/**
 * 责任链模式的核心，就是需要一直传递，直到找到对应的数据项位置
 * 因此有融合部分的方式模板模式
 */
public abstract class Handler {
    private Handler nextHandler;

    //设置级别
    protected abstract Level getHandlerLevel();

    //设置下一个处理者
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //设置响应
    protected abstract Response echo(Request request);

    //处理者必须对请求进行处理
    public final Response handleMessage(Request request) {
        Response response = null;
        //判断是否是自己级别能处理的
        if (this.getHandlerLevel().equals(request.getRequestLevel()))
            response = this.echo(request);
        else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //处理没有接受者的情况
            }
        }
        return response;
    }

}
