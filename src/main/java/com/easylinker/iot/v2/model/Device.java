package com.easylinker.iot.v2.model;

import com.easylinker.iot.v2.model.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by wwhai on 2017/11/15.
 */
@Entity
@Table(name = "DEVICE")
/**
 CREATE TABLE `mqtt_user` (
 `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 `username` varchar(100) DEFAULT NULL,
 `password` varchar(100) DEFAULT NULL,
 `salt` varchar(35) DEFAULT NULL,
 `is_superuser` tinyint(1) DEFAULT 0,
 `created` datetime DEFAULT NULL,
 PRIMARY KEY (`id`),
 UNIQUE KEY `mqtt_username` (`username`)
 ) ENGINE=MyISAM DEFAULT CHARSET=utf8;
 */
public class Device extends BaseEntity {
    private String openId;
    private String deviceName;
    private String deviceDescribe;
    @ManyToOne(targetEntity = DeviceGroup.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private DeviceGroup deviceGroup = new DeviceGroup("默认分组", 1);

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceDescribe() {
        return deviceDescribe;
    }

    public void setDeviceDescribe(String deviceDescribe) {
        this.deviceDescribe = deviceDescribe;
    }
}
