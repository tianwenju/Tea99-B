package com.delta.smt.ui.main.di;

import com.delta.smt.api.ApiService;
import com.delta.smt.ui.main.mvp.MainContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainModule_ProviderModelFactory implements Factory<MainContract.Model> {
  private final MainModule module;

  private final Provider<ApiService> serviceProvider;

  public MainModule_ProviderModelFactory(MainModule module, Provider<ApiService> serviceProvider) {
    assert module != null;
    this.module = module;
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public MainContract.Model get() {
    return Preconditions.checkNotNull(
        module.providerModel(serviceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainContract.Model> create(
      MainModule module, Provider<ApiService> serviceProvider) {
    return new MainModule_ProviderModelFactory(module, serviceProvider);
  }
}
