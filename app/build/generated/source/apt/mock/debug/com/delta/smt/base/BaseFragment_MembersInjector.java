package com.delta.smt.base;

import com.delta.commonlibs.base.mvp.BasePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseFragment_MembersInjector<p extends BasePresenter>
    implements MembersInjector<BaseFragment<p>> {
  private final Provider<p> mPresenterProvider;

  public BaseFragment_MembersInjector(Provider<p> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <p extends BasePresenter> MembersInjector<BaseFragment<p>> create(
      Provider<p> mPresenterProvider) {
    return new BaseFragment_MembersInjector<p>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseFragment<p> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static <p extends BasePresenter> void injectMPresenter(
      BaseFragment<p> instance, Provider<p> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
