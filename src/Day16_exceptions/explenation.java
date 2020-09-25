package Day16_exceptions;

public class explenation {

/*    Managing Exceptions: try
    The try block is like a staging area for potentially error-raising code. If your program is unable to
    execute the code inside a try block, it throws an exception and tries to find an exception handler to
    salvage the situation. The syntax is as follows:
            try{
        // write exception-throwing code here
    }

    Managing Exceptions: catch
    A catch block should always immediately follow a try block, and looks like a sort of mini-function.
    It must take some type of exception (either Exception or one of its subclasses) as a parameter, and it
    looks like this:
            catch(Exception e){
        // write exception handling logic here
    }
    Part of writing good code is knowing, circumventing, and anticipating exactly what type of exceptions your instructions might throw, but if your parameter is of type Exception, it will catch any exception that is a subclass of Exception. If the code in your try block has the potential to throw more than one type of exception, you can have multiple catch blocks to catch each type of anticipated exception.

    Managing Exceptions: finally
    The finally block immediately follows the catch block, and will always execute when the try block
    exits—regardless of whether or not an exception is thrown. The finally block is optional, and generally
    used for cleanup code.

    Managing Exceptions: try with resources
    This is useful when you are using a resource that must be opened/closed (anything that implements
    java.lang.AutoCloseable or java.io.Closeable), such as a Scanner or BufferedReader.
    While you will likely never need try-with-resources blocks for our challenges, it's still worth knowing about.
            try(Scanner scan = new Scanner();){
        // use scanner to do something that potentially throws an exception
    }*/

}
