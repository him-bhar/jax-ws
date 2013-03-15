/*
 * Copyright 2013 Himanshu Bhardwaj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.himanshu.poc.jaxws.document_client;

import gen.com.himanshu.poc.jaxws.stubs.document_type.HelloWorldService;
import gen.com.himanshu.poc.jaxws.stubs.document_type.HelloWorldServiceImplService;


public class DocumentClient {

	public static void main(String[] args) {
		HelloWorldServiceImplService helloWorld = new HelloWorldServiceImplService();
		HelloWorldService helloWorldService = helloWorld.getHelloWorldServiceImplPort();
		System.out.println(helloWorldService.getHelloWorldAsString(" DOCUMENT MY FRIEND"));
	}

}
