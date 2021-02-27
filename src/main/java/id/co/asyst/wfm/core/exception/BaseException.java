package id.co.asyst.wfm.core.exception;

public abstract class BaseException extends RuntimeException
{
    protected String TYPE;
    protected String TYPE_APPLICATION = "APPLICATION ERROR";
    protected String TYPE_SYSTEMS = "SYSTEMS ERROR";
    protected String TYPE_ENGINE = "ENGINE ERROR";
}
