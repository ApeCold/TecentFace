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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeDBInstanceRequest  extends AbstractModel{

    /**
    * 实例ID，形如mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例升级后的内存大小，单位GB，其值不能比当前实例内存小
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
     * 获取实例ID，形如mssql-njj2mtpl
     * @return InstanceId 实例ID，形如mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，形如mssql-njj2mtpl
     * @param InstanceId 实例ID，形如mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取实例升级后的内存大小，单位GB，其值不能比当前实例内存小
     * @return Memory 实例升级后的内存大小，单位GB，其值不能比当前实例内存小
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例升级后的内存大小，单位GB，其值不能比当前实例内存小
     * @param Memory 实例升级后的内存大小，单位GB，其值不能比当前实例内存小
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
     * @return Storage 实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
     * @param Storage 实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);

    }
}

