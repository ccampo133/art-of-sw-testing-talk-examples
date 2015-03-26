package dependencyinjection.authentication;

/**
 * @author Chris Campo
 */
public class AuthenticationException extends Exception {
    public AuthenticationException(final String message) {
        super(message);
    }
}
