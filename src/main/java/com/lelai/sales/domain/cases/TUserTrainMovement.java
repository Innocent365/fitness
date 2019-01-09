package com.lelai.sales.domain.cases;

/**
 * @author hw
 * @version on 2018/11/28
 */
public class TUserTrainMovement {

    private String id;

    private String part;
    private String location;
    private String movement;

    private String movementId;
    private String intensity;
    private Integer groupCount;
    private Integer groupNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getMovementId() {
        return movementId;
    }

    public void setMovementId(String movementId) {
        this.movementId = movementId;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public Integer getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }
}
