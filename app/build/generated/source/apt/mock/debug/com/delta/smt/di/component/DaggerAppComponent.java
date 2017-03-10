package com.delta.smt.di.component;

import android.app.Application;
import com.delta.commonlibs.di.module.AppModule;
import com.delta.commonlibs.di.module.AppModule_ProvideApplicationFactory;
import com.delta.commonlibs.di.module.ClientModule;
import com.delta.commonlibs.di.module.ClientModule_ProvideBaseUrlFactory;
import com.delta.commonlibs.di.module.ClientModule_ProvideCacheFactory;
import com.delta.commonlibs.di.module.ClientModule_ProvideCacheFileFactory;
import com.delta.commonlibs.di.module.ClientModule_ProvideClientFactory;
import com.delta.commonlibs.di.module.ClientModule_ProvideInterceptFactory;
import com.delta.commonlibs.di.module.ClientModule_ProvideRetrofitFactory;
import com.delta.smt.api.ApiService;
import com.delta.smt.di.module.ServiceModule;
import com.delta.smt.di.module.ServiceModule_ProvideCommonServiceFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.io.File;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Application> provideApplicationProvider;

  private Provider<File> provideCacheFileProvider;

  private Provider<Cache> provideCacheProvider;

  private Provider<Interceptor> provideInterceptProvider;

  private Provider<OkHttpClient> provideClientProvider;

  private Provider<HttpUrl> provideBaseUrlProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<ApiService> provideCommonServiceProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideApplicationProvider =
        DoubleCheck.provider(AppModule_ProvideApplicationFactory.create(builder.appModule));

    this.provideCacheFileProvider =
        DoubleCheck.provider(
            ClientModule_ProvideCacheFileFactory.create(
                builder.clientModule, provideApplicationProvider));

    this.provideCacheProvider =
        DoubleCheck.provider(
            ClientModule_ProvideCacheFactory.create(
                builder.clientModule, provideCacheFileProvider));

    this.provideInterceptProvider =
        DoubleCheck.provider(ClientModule_ProvideInterceptFactory.create(builder.clientModule));

    this.provideClientProvider =
        DoubleCheck.provider(
            ClientModule_ProvideClientFactory.create(
                builder.clientModule, provideCacheProvider, provideInterceptProvider));

    this.provideBaseUrlProvider =
        DoubleCheck.provider(ClientModule_ProvideBaseUrlFactory.create(builder.clientModule));

    this.provideRetrofitProvider =
        DoubleCheck.provider(
            ClientModule_ProvideRetrofitFactory.create(
                builder.clientModule, provideClientProvider, provideBaseUrlProvider));

    this.provideCommonServiceProvider =
        DoubleCheck.provider(
            ServiceModule_ProvideCommonServiceFactory.create(
                builder.serviceModule, provideRetrofitProvider));
  }

  @Override
  public Application Application() {
    return provideApplicationProvider.get();
  }

  @Override
  public ApiService apiService() {
    return provideCommonServiceProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private ClientModule clientModule;

    private ServiceModule serviceModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (clientModule == null) {
        throw new IllegalStateException(ClientModule.class.getCanonicalName() + " must be set");
      }
      if (serviceModule == null) {
        this.serviceModule = new ServiceModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder clientModule(ClientModule clientModule) {
      this.clientModule = Preconditions.checkNotNull(clientModule);
      return this;
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }
  }
}
