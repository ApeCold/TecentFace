/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceIdentifyStatistic  extends AbstractModel{

    /**
    * 持续时间
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 结束时间
    */
    @SerializedName("EndTs")
    @Expose
    private Long EndTs;

    /**
    * 人员唯一标识符
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 相似度
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * 开始时间
    */
    @SerializedName("StartTs")
    @Expose
    private Long StartTs;

    /**
     * 获取持续时间
     * @return Duration 持续时间
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * 设置持续时间
     * @param Duration 持续时间
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取结束时间
     * @return EndTs 结束时间
     */
    public Long getEndTs() {
        return this.EndTs;
    }

    /**
     * 设置结束时间
     * @param EndTs 结束时间
     */
    public void setEndTs(Long EndTs) {
        this.EndTs = EndTs;
    }

    /**
     * 获取人员唯一标识符
     * @return PersonId 人员唯一标识符
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置人员唯一标识符
     * @param PersonId 人员唯一标识符
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取相似度
     * @return Similarity 相似度
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * 设置相似度
     * @param Similarity 相似度
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * 获取开始时间
     * @return StartTs 开始时间
     */
    public Long getStartTs() {
        return this.StartTs;
    }

    /**
     * 设置开始时间
     * @param StartTs 开始时间
     */
    public void setStartTs(Long StartTs) {
        this.StartTs = StartTs;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "EndTs", this.EndTs);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "StartTs", this.StartTs);

    }
}

