/*
 * #%L
 * P6Spy
 * %%
 * Copyright (C) 2002 - 2014 P6Spy
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.p6spy.engine.proxy.cache;


/**
 * @author Peter Butkovic
 */
public class CacheFactory {
  
  public static final <K,V> Cache<K,V> newCache() {
    // TODO we'd be able to use any other caching solution here
    // any 3.rd party chache (ehcache,...) or some simple LRUMap from apache commons
    // based on class availability on classpath OR some config switch,...
    return new HashMapBasedCache<K,V>();
  }

}
