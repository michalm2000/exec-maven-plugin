/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

File execLog = new File(basedir, 'exec.log')
assert execLog.exists()
assert execLog.getText().contains('Can you hear me, Major Tom?')

File buildLog = new File(basedir, 'build.log')
assert buildLog.exists()
def buildLogText = buildLog.getText()
assert buildLogText.contains( "Adding project dependency artifact: slf4j-api to classpath" )
assert buildLogText.contains( "Adding project dependency artifact: reload4j to classpath" )
assert buildLogText.contains( "Adding project dependency artifact: slf4j-reload4j to classpath" )
assert !buildLogText.contains( "Adding project dependency artifact: junit to classpath" )
