package com.delta.smt.ui.login.di;

import com.delta.smt.api.ApiService;
import com.delta.smt.ui.login.mvp.LoginContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginModule_ProviderModelFactory implements Factory<LoginContract.Model> {
  private final LoginModule module;

  private final Provider<ApiService> serviceProvider;

  public LoginModule_ProviderModelFactory(
      LoginModule module, Provider<ApiService> serviceProvider) {
    assert module != null;
    this.module = module;
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public LoginContract.Model get() {
    return Preconditions.checkNotNull(
        module.providerModel(serviceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoginContract.Model> create(
      LoginModule module, Provider<ApiService> serviceProvider) {
    return new LoginModule_ProviderModelFactory(module, serviceProvider);
  }
}
