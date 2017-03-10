package com.delta.smt.ui.brands.di;

import com.delta.smt.api.ApiService;
import com.delta.smt.ui.brands.mvp.BrandContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BrandModule_ProviderModelFactory implements Factory<BrandContract.Model> {
  private final BrandModule module;

  private final Provider<ApiService> serviceProvider;

  public BrandModule_ProviderModelFactory(
      BrandModule module, Provider<ApiService> serviceProvider) {
    assert module != null;
    this.module = module;
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public BrandContract.Model get() {
    return Preconditions.checkNotNull(
        module.providerModel(serviceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BrandContract.Model> create(
      BrandModule module, Provider<ApiService> serviceProvider) {
    return new BrandModule_ProviderModelFactory(module, serviceProvider);
  }
}
