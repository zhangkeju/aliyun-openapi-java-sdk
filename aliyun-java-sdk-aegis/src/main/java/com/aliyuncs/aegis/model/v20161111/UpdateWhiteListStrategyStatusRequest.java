/*
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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateWhiteListStrategyStatusRequest extends RpcAcsRequest<UpdateWhiteListStrategyStatusResponse> {
	
	public UpdateWhiteListStrategyStatusRequest() {
		super("aegis", "2016-11-11", "UpdateWhiteListStrategyStatus", "vipaegis");
	}

	private String sourceIp;

	private String strategyIds;

	private String lang;

	private Integer status;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getStrategyIds() {
		return this.strategyIds;
	}

	public void setStrategyIds(String strategyIds) {
		this.strategyIds = strategyIds;
		if(strategyIds != null){
			putQueryParameter("StrategyIds", strategyIds);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<UpdateWhiteListStrategyStatusResponse> getResponseClass() {
		return UpdateWhiteListStrategyStatusResponse.class;
	}

}
