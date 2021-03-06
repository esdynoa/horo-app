/*
 * Copyright 2012 FuseSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fusesource.examples.horo.web.vo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "horoscopeResponse")
public class HoroscopesResponseVO {
    private List<HoroscopeVO> horoscopes;

    public List<HoroscopeVO> getHoroscopes() {
        return horoscopes;
    }

    public void setHoroscopes(List<HoroscopeVO> horoscopes) {
        this.horoscopes = horoscopes;
    }
}
