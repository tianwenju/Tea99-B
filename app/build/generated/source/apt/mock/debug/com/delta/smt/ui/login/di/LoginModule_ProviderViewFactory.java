package com.delta.smt.ui.login.di;

import com.delta.smt.ui.login.mvp.LoginContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginModule_ProviderViewFactory implements Factory<LoginContract.View> {
  private final LoginModule module;

  public LoginModule_ProviderViewFactory(LoginModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoginContract.View get() {
    return Preconditions.checkNotNull(
        module.providerView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoginContract.View> create(LoginModule module) {
    return new LoginModule_ProviderViewFactory(module);
  }
}
