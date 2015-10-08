/*************************DA-BOARD-LICENSE-START*********************************
 * Copyright 2014 CapitalOne, LLC.
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
 *************************DA-BOARD-LICENSE-END*********************************/

package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents a cloud account
 */
@Document(collection = "CloudComputeData")
public class CloudComputeAggregatedData extends BaseModel {
	private ObjectId collectorItemId;
	private ObjectId componentId;
	private int nonEncryptedCount;
	private int nonTaggedCount;
	private int stoppedCount;
	private int ageWarning;
	private int ageExpired;
	private int ageGood;
	private int cpuLow;
	private int cpuMid;
	private int cpuHigh;
	private int totalInstanceCount;
    private long lastUpdated;
	private ArrayList<CloudComputeRawData> instanceDetailList;
	private HashMap<String, Integer> countByMonth = new HashMap<>();

	
	public ObjectId getCollectorItemId() {
		return collectorItemId;
	}

	public void setCollectorItemId(ObjectId collectorItemId) {
		this.collectorItemId = collectorItemId;
	}
	
	public ObjectId getComponentId() {
		return componentId;
	}

	public void setComponentId(ObjectId componentId) {
		this.componentId = componentId;
	}
	
	public int getNonEncryptedCount() {
		return nonEncryptedCount;
	}

	public void setNonEncryptedCount(int nonEncryptedCount) {
		this.nonEncryptedCount = nonEncryptedCount;
	}

	public int getNonTaggedCount() {
		return nonTaggedCount;
	}

	public void setNonTaggedCount(int nonTaggedCount) {
		this.nonTaggedCount = nonTaggedCount;
	}

	public int getStoppedCount() {
		return stoppedCount;
	}

	public void setStoppedCount(int stoppedCount) {
		this.stoppedCount = stoppedCount;
	}

	public int getAgeWarning() {
		return ageWarning;
	}

	public void setAgeWarning(int ageWarning) {
		this.ageWarning = ageWarning;
	}

	public int getAgeExpired() {
		return ageExpired;
	}

	public void setAgeExpired(int ageExpired) {
		this.ageExpired = ageExpired;
	}

	public int getAgeGood() {
		return ageGood;
	}

	public void setAgeGood(int ageGood) {
		this.ageGood = ageGood;
	}

	public int getCpuLow() {
		return cpuLow;
	}

	public void setCpuLow(int cpuLow) {
		this.cpuLow = cpuLow;
	}

	public int getCpuMid() {
		return cpuMid;
	}

	public void setCpuMid(int cpuMid) {
		this.cpuMid = cpuMid;
	}

	public int getCpuHigh() {
		return cpuHigh;
	}

	public void setCpuHigh(int cpuHigh) {
		this.cpuHigh = cpuHigh;
	}

	public HashMap<String, Integer> getCountByMonth() {
		return countByMonth;
	}

	public void setCountByMonth(HashMap<String, Integer> countByMonth) {
		this.countByMonth = countByMonth;
	}

	public void setDetailList(ArrayList<CloudComputeRawData> instanceDetailList) {
		this.instanceDetailList = instanceDetailList;
	}

	public List<CloudComputeRawData> getDetailList() {
		return instanceDetailList;
	}

	public int getTotalInstanceCount() {
		return totalInstanceCount;
	}

	public void setTotalInstanceCount(int totalInstanceCount) {
		this.totalInstanceCount = totalInstanceCount;
	}
	
	public long getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}