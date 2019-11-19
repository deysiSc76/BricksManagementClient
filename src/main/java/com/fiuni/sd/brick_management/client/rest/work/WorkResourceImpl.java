package com.fiuni.sd.brick_management.client.rest.work;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.work.WorkDTO;
import com.fiuni.sd.bricks_management.dto.work.WorkResult;
import org.springframework.stereotype.Repository;

@Repository("workResource")
public class WorkResourceImpl extends BaseResourceImpl<WorkDTO> implements IWorkResource {
    public WorkResourceImpl() {
        super(WorkDTO.class, "/work");
    }
    @Override
    public WorkResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(WorkResult.class);
    }
}
