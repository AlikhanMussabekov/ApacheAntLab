
public class MyException extends Exception {
    public MyException(Throwable e)
    {
        this.initCause(e);
    }
}
