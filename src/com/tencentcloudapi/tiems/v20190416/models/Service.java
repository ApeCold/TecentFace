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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Service  extends AbstractModel{

    /**
    * 服务ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 运行集群
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行环境
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 模型地址
    */
    @SerializedName("ModelUri")
    @Expose
    private String ModelUri;

    /**
    * 处理器配置, 单位为1/1000核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存配置, 单位为1M
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 处理器配置, 单位为1/100 tflops
    */
    @SerializedName("TflopUnits")
    @Expose
    private Long TflopUnits;

    /**
    * 显存配置, 单位为1M
    */
    @SerializedName("GpuMemory")
    @Expose
    private Long GpuMemory;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 支持AUTO, MANUAL
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * 弹性伸缩配置
    */
    @SerializedName("Scaler")
    @Expose
    private Scaler Scaler;

    /**
    * 服务状态
    */
    @SerializedName("Status")
    @Expose
    private ServiceStatus Status;

    /**
    * 服务地址
    */
    @SerializedName("ServingIp")
    @Expose
    private String ServingIp;

    /**
    * 访问密钥
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * 服务配置Id
    */
    @SerializedName("ServiceConfigId")
    @Expose
    private Long ServiceConfigId;

    /**
    * 服务配置名
    */
    @SerializedName("ServiceConfigName")
    @Expose
    private String ServiceConfigName;

    /**
    * 服务运行时长
    */
    @SerializedName("ServeSeconds")
    @Expose
    private Long ServeSeconds;

    /**
    * 配置版本
    */
    @SerializedName("ServiceConfigVersion")
    @Expose
    private String ServiceConfigVersion;

    /**
     * 获取服务ID
     * @return Id 服务ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * 设置服务ID
     * @param Id 服务ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * 获取运行集群
     * @return Cluster 运行集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置运行集群
     * @param Cluster 运行集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取服务名称
     * @return Name 服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置服务名称
     * @param Name 服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取运行环境
     * @return Runtime 运行环境
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置运行环境
     * @param Runtime 运行环境
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * 获取模型地址
     * @return ModelUri 模型地址
     */
    public String getModelUri() {
        return this.ModelUri;
    }

    /**
     * 设置模型地址
     * @param ModelUri 模型地址
     */
    public void setModelUri(String ModelUri) {
        this.ModelUri = ModelUri;
    }

    /**
     * 获取处理器配置, 单位为1/1000核
     * @return Cpu 处理器配置, 单位为1/1000核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * 设置处理器配置, 单位为1/1000核
     * @param Cpu 处理器配置, 单位为1/1000核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取内存配置, 单位为1M
     * @return Memory 内存配置, 单位为1M
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存配置, 单位为1M
     * @param Memory 内存配置, 单位为1M
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取处理器配置, 单位为1/100 tflops
     * @return TflopUnits 处理器配置, 单位为1/100 tflops
     */
    public Long getTflopUnits() {
        return this.TflopUnits;
    }

    /**
     * 设置处理器配置, 单位为1/100 tflops
     * @param TflopUnits 处理器配置, 单位为1/100 tflops
     */
    public void setTflopUnits(Long TflopUnits) {
        this.TflopUnits = TflopUnits;
    }

    /**
     * 获取显存配置, 单位为1M
     * @return GpuMemory 显存配置, 单位为1M
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * 设置显存配置, 单位为1M
     * @param GpuMemory 显存配置, 单位为1M
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取更新时间
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取支持AUTO, MANUAL
     * @return ScaleMode 支持AUTO, MANUAL
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * 设置支持AUTO, MANUAL
     * @param ScaleMode 支持AUTO, MANUAL
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * 获取弹性伸缩配置
     * @return Scaler 弹性伸缩配置
     */
    public Scaler getScaler() {
        return this.Scaler;
    }

    /**
     * 设置弹性伸缩配置
     * @param Scaler 弹性伸缩配置
     */
    public void setScaler(Scaler Scaler) {
        this.Scaler = Scaler;
    }

    /**
     * 获取服务状态
     * @return Status 服务状态
     */
    public ServiceStatus getStatus() {
        return this.Status;
    }

    /**
     * 设置服务状态
     * @param Status 服务状态
     */
    public void setStatus(ServiceStatus Status) {
        this.Status = Status;
    }

    /**
     * 获取服务地址
     * @return ServingIp 服务地址
     */
    public String getServingIp() {
        return this.ServingIp;
    }

    /**
     * 设置服务地址
     * @param ServingIp 服务地址
     */
    public void setServingIp(String ServingIp) {
        this.ServingIp = ServingIp;
    }

    /**
     * 获取访问密钥
     * @return AccessToken 访问密钥
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * 设置访问密钥
     * @param AccessToken 访问密钥
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * 获取服务配置Id
     * @return ServiceConfigId 服务配置Id
     */
    public Long getServiceConfigId() {
        return this.ServiceConfigId;
    }

    /**
     * 设置服务配置Id
     * @param ServiceConfigId 服务配置Id
     */
    public void setServiceConfigId(Long ServiceConfigId) {
        this.ServiceConfigId = ServiceConfigId;
    }

    /**
     * 获取服务配置名
     * @return ServiceConfigName 服务配置名
     */
    public String getServiceConfigName() {
        return this.ServiceConfigName;
    }

    /**
     * 设置服务配置名
     * @param ServiceConfigName 服务配置名
     */
    public void setServiceConfigName(String ServiceConfigName) {
        this.ServiceConfigName = ServiceConfigName;
    }

    /**
     * 获取服务运行时长
     * @return ServeSeconds 服务运行时长
     */
    public Long getServeSeconds() {
        return this.ServeSeconds;
    }

    /**
     * 设置服务运行时长
     * @param ServeSeconds 服务运行时长
     */
    public void setServeSeconds(Long ServeSeconds) {
        this.ServeSeconds = ServeSeconds;
    }

    /**
     * 获取配置版本
     * @return ServiceConfigVersion 配置版本
     */
    public String getServiceConfigVersion() {
        return this.ServiceConfigVersion;
    }

    /**
     * 设置配置版本
     * @param ServiceConfigVersion 配置版本
     */
    public void setServiceConfigVersion(String ServiceConfigVersion) {
        this.ServiceConfigVersion = ServiceConfigVersion;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "ModelUri", this.ModelUri);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "TflopUnits", this.TflopUnits);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamObj(map, prefix + "Scaler.", this.Scaler);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "ServingIp", this.ServingIp);
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "ServiceConfigId", this.ServiceConfigId);
        this.setParamSimple(map, prefix + "ServiceConfigName", this.ServiceConfigName);
        this.setParamSimple(map, prefix + "ServeSeconds", this.ServeSeconds);
        this.setParamSimple(map, prefix + "ServiceConfigVersion", this.ServiceConfigVersion);

    }
}

