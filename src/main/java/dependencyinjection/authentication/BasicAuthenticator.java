package dependencyinjection.authentication;

/**
 * @author Chris Campo
 */
public class BasicAuthenticator implements Authenticator {
    @Override
    public void authenticate(final String username, final String password) {
        System.out.println("BASIC authentication; username = " + username + ", password = " + password);
    }
}
