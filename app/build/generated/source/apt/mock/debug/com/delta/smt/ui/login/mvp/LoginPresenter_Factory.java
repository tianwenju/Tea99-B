package com.delta.smt.ui.login.mvp;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginPresenter_Factory implements Factory<LoginPresenter> {
  private final MembersInjector<LoginPresenter> loginPresenterMembersInjector;

  private final Provider<LoginContract.Model> modelProvider;

  private final Provider<LoginContract.View> mViewProvider;

  public LoginPresenter_Factory(
      MembersInjector<LoginPresenter> loginPresenterMembersInjector,
      Provider<LoginContract.Model> modelProvider,
      Provider<LoginContract.View> mViewProvider) {
    assert loginPresenterMembersInjector != null;
    this.loginPresenterMembersInjector = loginPresenterMembersInjector;
    assert modelProvider != null;
    this.modelProvider = modelProvider;
    assert mViewProvider != null;
    this.mViewProvider = mViewProvider;
  }

  @Override
  public LoginPresenter get() {
    return MembersInjectors.injectMembers(
        loginPresenterMembersInjector,
        new LoginPresenter(modelProvider.get(), mViewProvider.get()));
  }

  public static Factory<LoginPresenter> create(
      MembersInjector<LoginPresenter> loginPresenterMembersInjector,
      Provider<LoginContract.Model> modelProvider,
      Provider<LoginContract.View> mViewProvider) {
    return new LoginPresenter_Factory(loginPresenterMembersInjector, modelProvider, mViewProvider);
  }
}
