/*
Copyright 2012 Opera Software ASA
Copyright 2007-2009 WebDriver committers
Copyright 2007-2009 Google Inc.
Portions copyright 2007 ThoughtWorks, Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.opera.core.systems.environment;

import com.opera.core.systems.environment.webserver.Jetty7WebServer;
import com.opera.core.systems.environment.webserver.WebServer;

public class InProcessTestEnvironment extends DefaultTestEnvironment implements TestEnvironment {

  private WebServer server;

  public InProcessTestEnvironment() {
    server = new Jetty7WebServer();
    server.start();
  }

  public WebServer getWebServer() {
    return server;
  }

  public void stop() {
    server.stop();
  }

  public static void main(String[] args) {
    new InProcessTestEnvironment();
  }

}