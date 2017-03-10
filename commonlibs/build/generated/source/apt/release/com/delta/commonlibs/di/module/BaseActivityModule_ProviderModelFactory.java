package com.delta.commonlibs.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseActivityModule_ProviderModelFactory<E> implements Factory<E> {
  private final BaseActivityModule<E> module;

  public BaseActivityModule_ProviderModelFactory(BaseActivityModule<E> module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public E get() {
    return Preconditions.checkNotNull(
        module.providerModel(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static <E> Factory<E> create(BaseActivityModule<E> module) {
    return new BaseActivityModule_ProviderModelFactory<E>(module);
  }
}
