package com.bb2.goodsmanagement.converter;

import com.bb2.goodsmanagement.domain.DeactivationReason;
import com.bb2.goodsmanagement.dto.DeactivationReasonDTO;

public class DeactivationReasonConverter {

    public static DeactivationReason DTO2Pojo (DeactivationReasonDTO dto){
        DeactivationReason reason = new DeactivationReason();
        reason.setReason_id(dto.getReason_id());
        reason.setReason(dto.getReason());
        reason.setDeactivatedItem(ItemConverter.DTO2Pojo(dto.getDeactivatedItem()));
        reason.setUser(UserConverter.DTO2pojo(dto.getUser()));

        return reason;
    }

}
