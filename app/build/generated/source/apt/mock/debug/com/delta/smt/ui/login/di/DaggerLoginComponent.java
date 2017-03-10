package com.delta.smt.ui.login.di;

import com.delta.smt.api.ApiService;
import com.delta.smt.di.component.AppComponent;
import com.delta.smt.ui.login.LoginActivity;
import com.delta.smt.ui.login.LoginActivity_MembersInjector;
import com.delta.smt.ui.login.mvp.LoginContract;
import com.delta.smt.ui.login.mvp.LoginPresenter;
import com.delta.smt.ui.login.mvp.LoginPresenter_Factory;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerLoginComponent implements LoginComponent {
  private Provider<ApiService> apiServiceProvider;

  private Provider<LoginContract.Model> providerModelProvider;

  private Provider<LoginContract.View> providerViewProvider;

  private Provider<LoginPresenter> loginPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private DaggerLoginComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.apiServiceProvider =
        new Factory<ApiService>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public ApiService get() {
            return Preconditions.checkNotNull(
                appComponent.apiService(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.providerModelProvider =
        DoubleCheck.provider(
            LoginModule_ProviderModelFactory.create(builder.loginModule, apiServiceProvider));

    this.providerViewProvider =
        DoubleCheck.provider(LoginModule_ProviderViewFactory.create(builder.loginModule));

    this.loginPresenterProvider =
        DoubleCheck.provider(
            LoginPresenter_Factory.create(
                MembersInjectors.<LoginPresenter>noOp(),
                providerModelProvider,
                providerViewProvider));

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(loginPresenterProvider);
  }

  @Override
  public void inject(LoginActivity activity) {
    loginActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private LoginModule loginModule;

    private AppComponent appComponent;

    private Builder() {}

    public LoginComponent build() {
      if (loginModule == null) {
        throw new IllegalStateException(LoginModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerLoginComponent(this);
    }

    public Builder loginModule(LoginModule loginModule) {
      this.loginModule = Preconditions.checkNotNull(loginModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
