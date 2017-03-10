package com.delta.smt.ui.login;

import com.delta.smt.ui.login.mvp.LoginPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginPresenter> mPresenterProvider;

  public LoginActivity_MembersInjector(Provider<LoginPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<LoginActivity> create(Provider<LoginPresenter> mPresenterProvider) {
    return new LoginActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    com.delta.smt.base.BaseActiviy_MembersInjector.injectMPresenter(instance, mPresenterProvider);
  }
}
