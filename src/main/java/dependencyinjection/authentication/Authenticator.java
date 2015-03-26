package dependencyinjection.authentication;

/**
 * @author Chris Campo
 */
public interface Authenticator {
    public void authenticate(final String username, final String password) throws AuthenticationException;
}
