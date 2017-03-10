package com.delta.smt.ui.brands.mvp;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BrandPresenter_Factory implements Factory<BrandPresenter> {
  private final MembersInjector<BrandPresenter> brandPresenterMembersInjector;

  private final Provider<BrandContract.Model> modelProvider;

  private final Provider<BrandContract.View> mViewProvider;

  public BrandPresenter_Factory(
      MembersInjector<BrandPresenter> brandPresenterMembersInjector,
      Provider<BrandContract.Model> modelProvider,
      Provider<BrandContract.View> mViewProvider) {
    assert brandPresenterMembersInjector != null;
    this.brandPresenterMembersInjector = brandPresenterMembersInjector;
    assert modelProvider != null;
    this.modelProvider = modelProvider;
    assert mViewProvider != null;
    this.mViewProvider = mViewProvider;
  }

  @Override
  public BrandPresenter get() {
    return MembersInjectors.injectMembers(
        brandPresenterMembersInjector,
        new BrandPresenter(modelProvider.get(), mViewProvider.get()));
  }

  public static Factory<BrandPresenter> create(
      MembersInjector<BrandPresenter> brandPresenterMembersInjector,
      Provider<BrandContract.Model> modelProvider,
      Provider<BrandContract.View> mViewProvider) {
    return new BrandPresenter_Factory(brandPresenterMembersInjector, modelProvider, mViewProvider);
  }
}
