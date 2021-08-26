// Generated by view binder compiler. Do not edit!
package com.freakin.foodorderingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView add;

  @NonNull
  public final TextView detailDescription;

  @NonNull
  public final ImageView detailImage;

  @NonNull
  public final Button insertButton;

  @NonNull
  public final EditText nameBox;

  @NonNull
  public final TextView nameLbl;

  @NonNull
  public final EditText phoneBox;

  @NonNull
  public final TextView priceLbl;

  @NonNull
  public final TextView quantity;

  @NonNull
  public final ImageView subtract;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView8;

  private ActivityDetailBinding(@NonNull LinearLayout rootView, @NonNull ImageView add,
      @NonNull TextView detailDescription, @NonNull ImageView detailImage,
      @NonNull Button insertButton, @NonNull EditText nameBox, @NonNull TextView nameLbl,
      @NonNull EditText phoneBox, @NonNull TextView priceLbl, @NonNull TextView quantity,
      @NonNull ImageView subtract, @NonNull TextView textView, @NonNull TextView textView8) {
    this.rootView = rootView;
    this.add = add;
    this.detailDescription = detailDescription;
    this.detailImage = detailImage;
    this.insertButton = insertButton;
    this.nameBox = nameBox;
    this.nameLbl = nameLbl;
    this.phoneBox = phoneBox;
    this.priceLbl = priceLbl;
    this.quantity = quantity;
    this.subtract = subtract;
    this.textView = textView;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add;
      ImageView add = rootView.findViewById(id);
      if (add == null) {
        break missingId;
      }

      id = R.id.detailDescription;
      TextView detailDescription = rootView.findViewById(id);
      if (detailDescription == null) {
        break missingId;
      }

      id = R.id.detailImage;
      ImageView detailImage = rootView.findViewById(id);
      if (detailImage == null) {
        break missingId;
      }

      id = R.id.insertButton;
      Button insertButton = rootView.findViewById(id);
      if (insertButton == null) {
        break missingId;
      }

      id = R.id.nameBox;
      EditText nameBox = rootView.findViewById(id);
      if (nameBox == null) {
        break missingId;
      }

      id = R.id.nameLbl;
      TextView nameLbl = rootView.findViewById(id);
      if (nameLbl == null) {
        break missingId;
      }

      id = R.id.phoneBox;
      EditText phoneBox = rootView.findViewById(id);
      if (phoneBox == null) {
        break missingId;
      }

      id = R.id.priceLbl;
      TextView priceLbl = rootView.findViewById(id);
      if (priceLbl == null) {
        break missingId;
      }

      id = R.id.quantity;
      TextView quantity = rootView.findViewById(id);
      if (quantity == null) {
        break missingId;
      }

      id = R.id.subtract;
      ImageView subtract = rootView.findViewById(id);
      if (subtract == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = rootView.findViewById(id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityDetailBinding((LinearLayout) rootView, add, detailDescription, detailImage,
          insertButton, nameBox, nameLbl, phoneBox, priceLbl, quantity, subtract, textView,
          textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}