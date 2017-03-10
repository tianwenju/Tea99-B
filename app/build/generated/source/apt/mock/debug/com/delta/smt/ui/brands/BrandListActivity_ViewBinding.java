// Generated code from Butter Knife. Do not modify!
package com.delta.smt.ui.brands;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.delta.commonlibs.widget.statusLayout.StatusLayout;
import com.delta.smt.R;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BrandListActivity_ViewBinding<T extends BrandListActivity> implements Unbinder {
  protected T target;

  @UiThread
  public BrandListActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.superRecyclerView = Utils.findRequiredViewAsType(source, R.id.lv_list, "field 'superRecyclerView'", SuperRecyclerView.class);
    target.status = Utils.findRequiredViewAsType(source, R.id.status, "field 'status'", StatusLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.superRecyclerView = null;
    target.status = null;

    this.target = null;
  }
}
