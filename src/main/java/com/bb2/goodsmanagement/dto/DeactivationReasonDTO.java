package com.bb2.goodsmanagement.dto;

public class DeactivationReasonDTO {

    private long reason_id;
    private String reason;
    private ItemDTO deactivatedItem;
    private UserDTO user;

    public DeactivationReasonDTO (){
        this.reason_id = 0;
        this.reason = "";
        this.deactivatedItem = null;
        this.user = null;
    }

    public long getReason_id() {
        return reason_id;
    }

    public void setReason_id(long reason_id) {
        this.reason_id = reason_id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ItemDTO getDeactivatedItem() {
        return deactivatedItem;
    }

    public void setDeactivatedItem(ItemDTO deactivatedItem) {
        this.deactivatedItem = deactivatedItem;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
