package dependencyinjection.authentication;

/**
 * @author Chris Campo
 */
public class OAuthAuthenticator implements Authenticator {
    @Override
    public void authenticate(final String username, final String password) {
        System.out.println("OAUTH authentication; username = " + username + ", password = " + password);
    }
}
