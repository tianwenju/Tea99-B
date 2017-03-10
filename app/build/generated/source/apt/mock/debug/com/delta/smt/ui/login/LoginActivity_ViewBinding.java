// Generated code from Butter Knife. Do not modify!
package com.delta.smt.ui.login;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.delta.smt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding<T extends LoginActivity> implements Unbinder {
  protected T target;

  private View view2131493032;

  @UiThread
  public LoginActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.et_userName = Utils.findRequiredViewAsType(source, R.id.userName, "field 'et_userName'", EditText.class);
    target.et_password = Utils.findRequiredViewAsType(source, R.id.password, "field 'et_password'", EditText.class);
    view = Utils.findRequiredView(source, R.id.bt_login, "method 'onClick'");
    view2131493032 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.et_userName = null;
    target.et_password = null;

    view2131493032.setOnClickListener(null);
    view2131493032 = null;

    this.target = null;
  }
}
