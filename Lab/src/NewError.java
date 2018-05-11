
public class NewError extends Error {
    public NewError(Error e)
    {
        this.initCause(e);
    }
}