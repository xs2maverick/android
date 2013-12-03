/*
 * Copyright (C) 2013 ohmage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ohmage.dagger;

/**
 * Created by cketcham on 12/2/13.
 */

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.squareup.otto.Bus;

import org.ohmage.app.OkHttpStack;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = false,
        library = true
)
public class OhmageModule {

    @Provides @Singleton RequestQueue provideRequestQueue(@ForApplication Context context) {
        return Volley.newRequestQueue(context, new OkHttpStack());
    }

    @Provides @Singleton Bus provideBus() {
        return new Bus();
    }
}