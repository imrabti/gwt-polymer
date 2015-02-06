package com.google.gwt.polymerdemo.polymerstubs;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.polymerdemo.myelemental.HTMLElement;

@JsType
public interface PaperToggleButton extends HTMLElement {
    @JsProperty Boolean getChecked();
    @JsProperty void setChecked(Boolean isChecked);
}
