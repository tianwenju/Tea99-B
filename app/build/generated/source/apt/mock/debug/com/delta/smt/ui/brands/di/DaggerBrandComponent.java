package com.delta.smt.ui.brands.di;

import com.delta.smt.api.ApiService;
import com.delta.smt.di.component.AppComponent;
import com.delta.smt.ui.brands.BrandListActivity;
import com.delta.smt.ui.brands.BrandListActivity_MembersInjector;
import com.delta.smt.ui.brands.mvp.BrandContract;
import com.delta.smt.ui.brands.mvp.BrandPresenter;
import com.delta.smt.ui.brands.mvp.BrandPresenter_Factory;
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
public final class DaggerBrandComponent implements BrandComponent {
  private Provider<ApiService> apiServiceProvider;

  private Provider<BrandContract.Model> providerModelProvider;

  private Provider<BrandContract.View> providerViewProvider;

  private Provider<BrandPresenter> brandPresenterProvider;

  private MembersInjector<BrandListActivity> brandListActivityMembersInjector;

  private DaggerBrandComponent(Builder builder) {
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
            BrandModule_ProviderModelFactory.create(builder.brandModule, apiServiceProvider));

    this.providerViewProvider =
        DoubleCheck.provider(BrandModule_ProviderViewFactory.create(builder.brandModule));

    this.brandPresenterProvider =
        DoubleCheck.provider(
            BrandPresenter_Factory.create(
                MembersInjectors.<BrandPresenter>noOp(),
                providerModelProvider,
                providerViewProvider));

    this.brandListActivityMembersInjector =
        BrandListActivity_MembersInjector.create(brandPresenterProvider);
  }

  @Override
  public void inject(BrandListActivity activity) {
    brandListActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private BrandModule brandModule;

    private AppComponent appComponent;

    private Builder() {}

    public BrandComponent build() {
      if (brandModule == null) {
        throw new IllegalStateException(BrandModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerBrandComponent(this);
    }

    public Builder brandModule(BrandModule brandModule) {
      this.brandModule = Preconditions.checkNotNull(brandModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
