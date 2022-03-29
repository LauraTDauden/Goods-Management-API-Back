package com.bb2.goodsmanagement.domain;

import javax.persistence.*;

@Entity
@Table (name = "DeactivationReason")
public class DeactivationReason {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reason_id;

    @Column(nullable=false)
    private String reason;

    @OneToOne
    private Item deactivatedItem;

    @ManyToOne
    private User user;

    public DeactivationReason (){
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

    public Item getDeactivatedItem() {
        return deactivatedItem;
    }

    public void setDeactivatedItem(Item deactivatedItem) {
        this.deactivatedItem = deactivatedItem;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
