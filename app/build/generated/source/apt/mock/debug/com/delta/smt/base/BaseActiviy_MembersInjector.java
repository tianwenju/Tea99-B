package com.delta.smt.base;

import com.delta.commonlibs.base.mvp.BasePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseActiviy_MembersInjector<p extends BasePresenter>
    implements MembersInjector<BaseActiviy<p>> {
  private final Provider<p> mPresenterProvider;

  public BaseActiviy_MembersInjector(Provider<p> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <p extends BasePresenter> MembersInjector<BaseActiviy<p>> create(
      Provider<p> mPresenterProvider) {
    return new BaseActiviy_MembersInjector<p>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseActiviy<p> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static <p extends BasePresenter> void injectMPresenter(
      BaseActiviy<p> instance, Provider<p> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
