package com.delta.smt.base;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseFragmentModule_ProviderViewFactory<E> implements Factory<E> {
  private final BaseFragmentModule<E> module;

  private final Provider<E> eProvider;

  public BaseFragmentModule_ProviderViewFactory(
      BaseFragmentModule<E> module, Provider<E> eProvider) {
    assert module != null;
    this.module = module;
    assert eProvider != null;
    this.eProvider = eProvider;
  }

  @Override
  public E get() {
    return Preconditions.checkNotNull(
        module.providerView(eProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static <E> Factory<E> create(BaseFragmentModule<E> module, Provider<E> eProvider) {
    return new BaseFragmentModule_ProviderViewFactory<E>(module, eProvider);
  }
}
