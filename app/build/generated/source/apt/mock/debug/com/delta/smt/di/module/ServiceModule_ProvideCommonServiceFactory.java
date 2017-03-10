package com.delta.smt.di.module;

import com.delta.smt.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideCommonServiceFactory implements Factory<ApiService> {
  private final ServiceModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ServiceModule_ProvideCommonServiceFactory(
      ServiceModule module, Provider<Retrofit> retrofitProvider) {
    assert module != null;
    this.module = module;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return Preconditions.checkNotNull(
        module.provideCommonService(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApiService> create(
      ServiceModule module, Provider<Retrofit> retrofitProvider) {
    return new ServiceModule_ProvideCommonServiceFactory(module, retrofitProvider);
  }
}
