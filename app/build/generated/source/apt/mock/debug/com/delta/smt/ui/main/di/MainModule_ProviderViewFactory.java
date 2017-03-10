package com.delta.smt.ui.main.di;

import com.delta.smt.ui.main.mvp.MainContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainModule_ProviderViewFactory implements Factory<MainContract.View> {
  private final MainModule module;

  public MainModule_ProviderViewFactory(MainModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MainContract.View get() {
    return Preconditions.checkNotNull(
        module.providerView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainContract.View> create(MainModule module) {
    return new MainModule_ProviderViewFactory(module);
  }
}
