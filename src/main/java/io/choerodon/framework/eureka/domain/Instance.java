package io.choerodon.framework.eureka.domain;

import com.netflix.appinfo.InstanceInfo;

/**
 * @author flyleft
 * @date 2018/1/23
 */
public class Instance {

    private static final String VERSION_STR = "VERSION";

    private static final String DEFAULT_VERSION_NAME = "null_version";

    private String status;

    private String appName;

    private String id;

    private String version;

    private String uuid;

    public Instance(InstanceInfo instanceInfo) {
        this.status = instanceInfo.getStatus().name();
        this.appName = instanceInfo.getAppName().toLowerCase();
        this.id = instanceInfo.getId();
        this.version = instanceInfo.getMetadata().get(VERSION_STR);
        this.version = version == null ? DEFAULT_VERSION_NAME : version;
        this.uuid = "";
    }

    public Instance() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "status='" + status + '\'' +
                ", appName='" + appName + '\'' +
                ", id='" + id + '\'' +
                ", version='" + version + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
