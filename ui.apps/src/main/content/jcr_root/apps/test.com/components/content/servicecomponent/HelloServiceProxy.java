/*
 *  Copyright 2014 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package apps.test.com.components.content.servicecomponent;

import javax.script.Bindings;

import org.apache.sling.api.scripting.SlingScriptHelper;
import test332.com.core.HelloService;

import com.adobe.cq.sightly.WCMUse;

public class HelloServiceProxy extends WCMUse {
    
	@Override
	public void activate() throws Exception {
		// nothing to be done here in this case
	}
	
    public String getHelloMessage() {
    	SlingScriptHelper ssh = getSlingScriptHelper();
    	HelloService helloService = ssh.getService(HelloService.class);
    	return helloService.getMessage();
    }
}