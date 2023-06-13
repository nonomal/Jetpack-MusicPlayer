/*
 *
 *  * Copyright 2018-present KunMinX
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *    http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.kunminx.puremusic.ui.page.helper;

import android.view.View;
import android.widget.SeekBar;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Create by KunMinX at 2020/12/3
 */
public class DefaultInterface {

  public interface OnSeekBarChangeListener extends SeekBar.OnSeekBarChangeListener {
    @Override
    default void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
    }

    @Override
    default void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    default void onStopTrackingTouch(SeekBar seekBar) {
    }
  }

  public interface PanelSlideListener extends SlidingUpPanelLayout.PanelSlideListener {
    @Override
    default void onPanelSlide(View panel, float slideOffset) {
    }

    @Override
    default void onPanelStateChanged(View panel,
                                     SlidingUpPanelLayout.PanelState previousState,
                                     SlidingUpPanelLayout.PanelState newState) {
    }
  }

  public interface Observer<T> extends io.reactivex.Observer<T> {
    default void onSubscribe(@NonNull Disposable d) {
    }

    void onNext(@NonNull T t);

    default void onError(@NonNull Throwable e) {
    }

    default void onComplete() {
    }
  }
}
