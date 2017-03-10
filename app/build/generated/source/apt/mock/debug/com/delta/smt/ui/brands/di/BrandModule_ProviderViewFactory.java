package com.delta.smt.ui.brands.di;

import com.delta.smt.ui.brands.mvp.BrandContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BrandModule_ProviderViewFactory implements Factory<BrandContract.View> {
  private final BrandModule module;

  public BrandModule_ProviderViewFactory(BrandModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BrandContract.View get() {
    return Preconditions.checkNotNull(
        module.providerView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BrandContract.View> create(BrandModule module) {
    return new BrandModule_ProviderViewFactory(module);
  }
}
