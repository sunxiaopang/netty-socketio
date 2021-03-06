/**
 * Copyright 2012 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.corundumstudio.socketio;

import java.net.InetSocketAddress;
import java.util.Date;
import java.util.List;
import java.util.Map;

public final class HandshakeData {

    private final Map<String, List<String>> headers;
    private final InetSocketAddress address;
    private final Date time = new Date();
    private final String url;
    private final Map<String, List<String>> urlParams;
    private final boolean xdomain;

    public HandshakeData(Map<String, List<String>> headers, Map<String, List<String>> urlParams, InetSocketAddress address, String url, boolean xdomain) {
        super();
        this.headers = headers;
        this.urlParams = urlParams;
        this.address = address;
        this.url = url;
        this.xdomain = xdomain;
    }

    public InetSocketAddress getAddress() {
        return address;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public Date getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }

    public boolean isXdomain() {
        return xdomain;
    }

    public Map<String, List<String>> getUrlParams() {
        return urlParams;
    }

}
