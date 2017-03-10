package com.delta.smt.ui.brands;

import com.delta.smt.ui.brands.mvp.BrandPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BrandListActivity_MembersInjector implements MembersInjector<BrandListActivity> {
  private final Provider<BrandPresenter> mPresenterProvider;

  public BrandListActivity_MembersInjector(Provider<BrandPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BrandListActivity> create(
      Provider<BrandPresenter> mPresenterProvider) {
    return new BrandListActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BrandListActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    com.delta.smt.base.BaseActiviy_MembersInjector.injectMPresenter(instance, mPresenterProvider);
  }
}
