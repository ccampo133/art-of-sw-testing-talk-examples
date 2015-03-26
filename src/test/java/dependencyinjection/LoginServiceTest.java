package dependencyinjection;

import dependencyinjection.authentication.AuthenticationException;
import dependencyinjection.authentication.Authenticator;
import dependencyinjection.authentication.BasicAuthenticator;
import dependencyinjection.authentication.OAuthAuthenticator;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author Chris Campo
 */
public class LoginServiceTest {

    @Test
    public void testBasicLogin() {
        final LoginService loginService = new LoginService(new BasicAuthenticator());
        loginService.login("foo", "bar");
    }

    @Test
    public void testOAuthLogin() {
        final LoginService loginService = new LoginService(new OAuthAuthenticator());
        loginService.login("foo", "bar");
    }

    @Test
    public void testLoginError() throws AuthenticationException {
        final Authenticator mockAuthentication = mock(Authenticator.class);
        doThrow(new AuthenticationException("Invalid credentials!"))
                .when(mockAuthentication).authenticate(anyString(), anyString());
        final LoginService loginService = new LoginService(mockAuthentication);
        loginService.login("foo", "bar");
    }

    @Test
    public void testLoginWithLambda() {
        final LoginService loginService = new LoginService(
                (un, pw) -> System.out.println("LAMBDA authentication: username = " + un + ", password = " + pw));
        loginService.login("foo", "bar");
    }
}
