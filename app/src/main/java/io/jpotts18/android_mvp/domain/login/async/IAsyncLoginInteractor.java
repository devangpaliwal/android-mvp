package io.jpotts18.android_mvp.domain.login.async;

import io.jpotts18.android_mvp.domain.login.OnLoginFinishedListener;

/**
 * Created by jpotts18 on 5/11/15.
 */
public interface IAsyncLoginInteractor {
    void validateCredentialsAsync(OnLoginFinishedListener listener, String username, String password);
}
