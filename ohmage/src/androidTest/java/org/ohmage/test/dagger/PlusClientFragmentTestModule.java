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

package org.ohmage.test.dagger;

import org.ohmage.auth.AuthenticatorActivity;
import org.ohmage.auth.AuthenticatorActivityTest;
import org.ohmage.auth.PlusClientFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

@Module(
        injects = {
                AuthenticatorActivityTest.class,
                AuthenticatorActivity.class,
        },
        overrides = true,
        complete = false
)
public class PlusClientFragmentTestModule {

    @Provides @Singleton PlusClientFragment providesPlusClientFragment() {
        return mock(PlusClientFragment.class);
    }
}