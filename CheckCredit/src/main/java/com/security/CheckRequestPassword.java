package com.security;

import org.apache.ws.security.WSPasswordCallback;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 22/08/13
 * Time: 8:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class CheckRequestPassword implements CallbackHandler {
    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        //To change body of implemented methods use File | Settings | File Templates.

        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

        if (pc.getIdentifier().equals("mani")) {
            if (!pc.getPassword().equals("password")) {
                throw new IOException("wrong password");
            }
        }
    }
}
