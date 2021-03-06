// Generated by view binder compiler. Do not edit!
package com.freakin.foodorderingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.freakin.foodorderingapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OrderSampleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView orderImage;

  @NonNull
  public final TextView orderItemName;

  @NonNull
  public final TextView orderNumber;

  @NonNull
  public final TextView ordersPrice;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  private OrderSampleBinding(@NonNull LinearLayout rootView, @NonNull ImageView orderImage,
      @NonNull TextView orderItemName, @NonNull TextView orderNumber, @NonNull TextView ordersPrice,
      @NonNull TextView textView3, @NonNull TextView textView5, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.orderImage = orderImage;
    this.orderItemName = orderItemName;
    this.orderNumber = orderNumber;
    this.ordersPrice = ordersPrice;
    this.textView3 = textView3;
    this.textView5 = textView5;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderSampleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OrderSampleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.order_sample, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OrderSampleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.orderImage;
      ImageView orderImage = rootView.findViewById(id);
      if (orderImage == null) {
        break missingId;
      }

      id = R.id.orderItemName;
      TextView orderItemName = rootView.findViewById(id);
      if (orderItemName == null) {
        break missingId;
      }

      id = R.id.orderNumber;
      TextView orderNumber = rootView.findViewById(id);
      if (orderNumber == null) {
        break missingId;
      }

      id = R.id.ordersPrice;
      TextView ordersPrice = rootView.findViewById(id);
      if (ordersPrice == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      return new OrderSampleBinding((LinearLayout) rootView, orderImage, orderItemName, orderNumber,
          ordersPrice, textView3, textView5, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
